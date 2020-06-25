package com.pjwstk.scala1

object ex1 {
  def main(args: Array[String]): Unit ={
    var days = List("Poniedziałek", "Wtorek", "Środa","Czwartek","Piątek","Sobota", "Niedziela")

    println(daysOfTheWeek(days))
    println(daysOfTheWeekStartedWithP(days))
    println(daysOfTheWeekWhile(days))

    def daysOfTheWeek(days: List[String]): String ={
      println("ex.1.a")
      var cncStr = ""
      for ( day <- days ) {
        cncStr += day +","
      }
      cncStr.dropRight(1)
    }

    def daysOfTheWeekStartedWithP(days: List[String]): String ={
      println("ex.1.b")
      var cncStr = ""
      for ( day <- days ) {
        if (day.charAt(0).==('P')){
          cncStr += day +","
        }
      }
      cncStr.dropRight(1)
    }

    def daysOfTheWeekWhile(days: List[String]): String ={
      println("ex.1.c")
      var cncStr = ""
      var i = 0
      while (i < days.size) {
        cncStr += days(i) + ","
        i += 1
      }
      cncStr.dropRight(1)
    }

  }
}
