package com.pjwstk.scala2

object ex4 {

  def main(args: Array[String]) : Unit = {

    println(fun(4)(inc))

    def fun(x : Int)(fun: (Int,Int) => Int): Int = {
      fun(x,4)
    }

    def inc(x : Int, rep : Int): Int = {
      if (rep>0) {
        val z:Int=rep-1
        inc(x+x,z)
      }
      else x
    }

  }
}