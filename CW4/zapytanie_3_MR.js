db.people.mapReduce(
  function() 
  {
      emit(
          this.job, 
          null
      );
  },
  function(k, v) 
  {},
  {
      out:  "result" 
  }
)

db.result.find({})