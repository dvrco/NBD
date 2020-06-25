db.people.mapReduce(
    function () {
        emit(this.sex, {  
            count: 1, 
            height: parseFloat(this.height), 
            weight: parseFloat(this.weight)
        });}, 
    function (key, values) {
        
        var avrageValues = {
            count: 0, 
            height: 0, 
            weight: 0
        };

        values.forEach(function (value) {
            avrageValues.count += 1
            avrageValues.height += value.height;
            avrageValues.weight += value.weight;
        });

        avrageValues.height = avrageValues.height / avrageValues.count;
        avrageValues.weight = avrageValues.weight / avrageValues.count;
        
        return avrageValues;
    }, {
        out: 'avrageValues'
    });

db.avrageValues.find({})