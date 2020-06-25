db.people.aggregate([
    {
        $match: {nationality: "Poland"}
    },
	{
        $match: {sex: "Female"}
    },
	{
        $unwind: "$credit"
    },
	{
        $group: {
			_id: "$credit.currency",
			avgBalance:
			{
                $avg:{$toDouble: "$credit.balance"}
			},
            totalBalance:
            {
                $sum:{$toDouble: "$credit.balance"}
            }
		}
	}
])