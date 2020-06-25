printjson(db.people.insert({
	"sex" : "Male",
	"first_name" : "Yusuf",
	"last_name" : "Dabiri",
	"job" : "Developer",
	"email" : "s13898@pjwstk.edu.pl",
	"location" : {
		"city" : "Warsaw",
		"address" : {
			"streetname" : "Fiszera",
			"streetnumber" : "666"
		}
	},
	"description" : ".NET developer",
	"height" : "170",
	"weight" : "60",
	"birth_date" : "1996-07-09T01:01:01",
	"nationality" : "Germany",
	"credit" : [
		{
			"type" : "jcb",
			"number" : "123456789123456",
			"currency" : "EURO",
			"balance" : "10"
		}
	]
}
));

