package com.pjwstk.scala2

object ex1 {

  def main(args: Array[String]) : Unit = {
    println(itsWorkDay("Poniedziałek"))
    println(itsWorkDay("Sobota"))
    println(itsWorkDay("Test"))
  }

  def itsWorkDay(day: String) = {
    day match {
      case "Poniedziałek" => "Praca"
      case "Wtorek" => "Praca"
      case "Środa" => "Praca"
      case "Czwartek" => "Praca"
      case "Piątek" => "Praca"
      case "Sobota" => "Weekend"
      case "Niedziela" => "Weekend"
      case _ => "Nie ma takiego dnia"
    }
  }
}
