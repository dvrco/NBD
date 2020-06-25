package com.pjwstk.scala1

import scala.annotation.tailrec

object ex3 {
  def main(args: Array[String]): Unit = {
    var days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(tailRecursion(days))

    def tailRecursion(days: List[String] ): String = {
      @tailrec
      def tail(days: List[String] , str: String): String = {
        if(days.length > 1){
          return tail(days.tail,str + days(0) + ";")
        }
        else{
          return str + days(0)
        }
      }
      tail(days,"")
    }
  }
}
