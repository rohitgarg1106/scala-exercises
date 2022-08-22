package lec1

object MethodNotations extends App {

  class Person(name:String, favouriteMove: String){
    def likes(movie : String): Boolean = movie == favouriteMove
    def hangoutWith(other : Person) = {
//      println(s"${this.name} hangs out with ${other.name}")
    }
  }

  var p = new Person("Rohit Garg", "ZNMD")
  var q = new Person ("Ruturaj Apte", favouriteMove = "Raaz")

  p.hangoutWith(q)

}
