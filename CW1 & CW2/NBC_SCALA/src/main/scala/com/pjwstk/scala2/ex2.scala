package com.pjwstk.scala2

object ex2 {

  def main(args: Array[String]) : Unit = {
    val konto1 = new KontoBankowe()
    val konto2 = new KontoBankowe(999)

    println(konto1.stanKonta)
    println(konto2.stanKonta)
  }

  class KontoBankowe() {
    private var _stanKonta : Double = 0;

    def stanKonta = _stanKonta

    def this(stanKonta: Double){
      this()
      this._stanKonta = stanKonta
    }

    def wplata(kwota: Double): Unit ={
      return _stanKonta + kwota;
    }
    def wyplata(kwota: Double): Unit ={
    return _stanKonta - kwota;
    }
  }
}
