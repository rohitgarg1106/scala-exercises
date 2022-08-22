package lec1

object AbstractDataTypes extends App{

  abstract class Animal{
    var creatureType : String = "Rohit"
    def eat : Unit = println("")
  }

  trait Carnivore{
    def eat(animal: Animal): Unit
  }

}
