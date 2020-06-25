package com.pjwstk.scala1

object ex7 {
  def main(args: Array[String]): Unit = {
    val products = Map (
      "Carbonara" -> "Spaghetti",
      "Whisky" -> "Alcohol"
    )

    println(matchProducts(products.get("Carbonara")))
    println(matchProducts(products.get("Pizza")))

    def matchProducts(x: Option[String]) = x match {
      case Some(s) => s
      case None => "?"
    }

  }
}
