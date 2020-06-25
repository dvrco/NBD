package com.pjwstk.scala1

object ex10 {
  def main(args: Array[String]): Unit = {

    var values = List(0,1, 5,44,-22,-42,11,32,0,-1)

    println(values)
    println(range(values, -5 ,12))

    def range(values: List[Int], minVal: Int, maxVal: Int): List[Int] = {
      values.filter(x => (x>= minVal && x <= maxVal))
    }
  }
}
