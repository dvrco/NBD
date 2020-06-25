package com.pjwstk.scala1

object ex8 {

  def main(args: Array[String]): Unit = {

    var values = List(12, 0, 3, 4, 0 ,2552, 2)
    var empty = List()

    println(values)
    println("Lista po skasowaniu zer " + removeZeroFromList(values, empty))

    def removeZeroFromList(values: List[Int], newValuesList: List[Int]): List[Int] = {
      if(values.length > 0)
      {
        if(values.head.equals(0)){
          removeZeroFromList(values.tail,newValuesList)
        }
        else{
          removeZeroFromList(values.tail,newValuesList :+ values.head)
        }
      }
      else
        newValuesList
    }
  }
}
