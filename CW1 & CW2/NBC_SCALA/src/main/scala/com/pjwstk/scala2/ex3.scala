package com.pjwstk.scala2

object ex3 {

  def main(args: Array[String]) : Unit = {
    val john = new Osoba("John", "Aoe")
    println(welcomeMessage(john))
    val kevin = new Osoba("Kevin", "Boe")
    println(welcomeMessage(kevin))
    val hose = new Osoba("Hose", "Doe")
    println(welcomeMessage(hose))
  }

  def welcomeMessage(p: Osoba) = p match {
    case Osoba("John", "Aoe") => "Hi John Aoe!"
    case Osoba("Kevin", "Boe") => "Hiiiiii Kevin Boe!1!1!!"
    case Osoba(firstName, lastName) => s"Hello, $firstName $lastName"
  }

  case class Osoba(val firstName:String, var lastName: String) {
    override def equals(that: Any): Boolean = ???
  }
}
