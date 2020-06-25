package com.pjwstk.scala1

object ex9 {
  def main(args: Array[String]): Unit = {

    var values = List(12, 0, 3, 4, 0 ,2552, 2)

    println(values)
    println(addOne(values))

    def addOne(values: List[Int]): List[Int] =
    {
      return values.map(x => x+1);
    }
  }
}
