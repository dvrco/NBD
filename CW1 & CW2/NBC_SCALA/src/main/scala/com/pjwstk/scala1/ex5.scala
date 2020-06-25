package com.pjwstk.scala1

object ex5 {
  def main(args: Array[String]): Unit = {

    val products: Map[String, Double] = Map(
      ("Klawiatura", 120),
      ("Mysz", 90),
      ("Monitor", 949),
      ("PC", 5999)
    )

    println(products)
    println(listMapping(products))

    def listMapping(products: Map[String, Double]): Map[String, Double] = {
      products map {case (key, value) => (key, value * 0.9)}
    }
  }
}
