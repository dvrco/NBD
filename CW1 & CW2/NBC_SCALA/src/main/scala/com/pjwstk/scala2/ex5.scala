
object ex5 {
  def main(args: Array[String]) : Unit = {
    val pracownik = new Osoba("Bbacki", "Bbacki") with Pracownik;
    pracownik.pensja = 8000;
    println("Pensja pracownik", pracownik.pensja)

    val nauczyciel = new Osoba("Cbacki", "Cbacki") with Nauczyciel;
    nauczyciel.pensja = 9000;
    println("Pensja nauczyciel", nauczyciel.pensja)

    val student = new Osoba("Abacki", "Abacki") with Student
    println("Podatek studenta", student.podatek)

    val pracownikNauczyciel = new Osoba("Dbacki", "Dbacki") with Pracownik with Nauczyciel
    pracownikNauczyciel.pensja = 8000;
    println("Podatek pracownika", pracownikNauczyciel.podatek)

    val nauczycielPracownik = new Osoba("Ebacki", "Ebacki") with Nauczyciel with Pracownik
    nauczycielPracownik.pensja = 9000;
    println("Podatek nauczyciela", nauczycielPracownik.podatek)
  }

  class Osoba(imie: String, nazwisko: String) {
    private var _imie : String = "";
    private var _nazwisko : String = "";
    private var _podatek : Double = 0.00;
    def imie = _imie
    def nazwisko = _nazwisko
  }

  trait Student extends {
    def podatek = 0.00
  }
}
trait Nauczyciel extends Pracownik {
  override def podatek = pensja * 0.1
}

trait Pracownik extends {
  var pensja: Double = 0.00
  def podatek = pensja * 0.2
}

