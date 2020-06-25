package com.pjwstk.scala1

object ex2 {

  def main(args: Array[String]): Unit = {
    var days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(daysRecursion(days, ""))
    println(daysReversed(days, ""))

    def daysRecursion(days: List[String] ,  str: String): String = {
      println("ex.2.a")
      if(days.length > 1){
        return daysRecursion(days.tail, str + days(0) + ",")
      }
      else{
        return str + days(0)
      }
    }

    def daysReversed(days: List[String] ,  str: String): String = {
      println("ex.2.b")
      if(days.length > 1){
        return daysReversed(days.slice(0,days.length-1),str + days.last + ";")
      }
      else{
        return str + days.last
      }
    }
    
  }
}
