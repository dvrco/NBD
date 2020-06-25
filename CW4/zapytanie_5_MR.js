var cnt = function(){
	for(var credit in this.credit){
        var balance = parseFloat(this.credit[credit].balance);
		var currency = this.credit[credit].currency;
		var result = {
            balance: balance, 
            quantity:1
        };
        
        emit(
            currency, 
            result
        );
	}	
};

var reduce = function(key, values){
	var reducedValue = {
        balance: 0, 
        quantity: 0
    };
	values.forEach(function(val) {
        reducedValue.balance += val.balance;
        reducedValue.quantity += val.quantity;
    });
    return reducedValue;
};

var avrage = function (key, value){ 
     value.avrageBalance = value.balance / value.quantity;
     return value;
}

db.people.mapReduce(
    cnt,
    reduce,
    {
        query: { nationality: "Poland", sex: "Female"}, 
        out: "avrageBalance", 
        finalize: avrage
    }
)

db.avrageBalance.find({})