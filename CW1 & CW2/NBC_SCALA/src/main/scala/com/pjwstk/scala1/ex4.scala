package com.pjwstk.scala1

object ex4 {

  def main(args: Array[String]): Unit = {
    var days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(daysFoldLeft(days))
    println(daysFoldRight(days))
    println(daysFoldLeftStartedWithP(days))

    def daysFoldLeft(days: List[String]): String ={
      println("ex.4.a")
      days.foldLeft("")((acc, s) => acc + s + ",").dropRight(1)
    }

    def daysFoldRight(days: List[String]): String ={
      println("ex.4.b")
      days.foldRight("")((acc, s) => acc + "," + s).dropRight(1)
    }

    def daysFoldLeftStartedWithP(days: List[String]): String ={
      println("ex.4.c")
      days.foldLeft("")((acc, s) => if(s.charAt(0).==('P')) acc + s + "," else acc).dropRight(1)
    }

  }
}
