package com.pjwstk.scala1

object ex6 {
  def main(args: Array[String]): Unit = {
    val tuple = (1444, 99.99, "Klawiatura"): Tuple3[Int, Double, String]

    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
  }
}
