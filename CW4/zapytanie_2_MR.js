db.people.mapReduce(
  function () {
  
    if (!this.credit) return;
    
    this.credit.forEach(function (credit) {
      emit(
        credit.currency, 
        parseFloat(credit.balance) || 0
      );
    });
  
  },
  function (key, value) {
    return Array.sum(value)
  }, {
  out: "balance"
  }
);
  
db.balance.find({})