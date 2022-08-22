package lec1

object AnonClass extends App{

  abstract class Animal{
    def eat:Unit
  }

  var animal = new Animal {
    override def eat: Unit = println("Hello World")
  }

  println(animal.getClass)

}

