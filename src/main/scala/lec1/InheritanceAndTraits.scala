package lec1

import scala.language.postfixOps

object InheritanceAndTraits extends App{

  class Animal{
    def eat : Unit = println("nomnom")
    //
    private def drink : Unit = println("slurp")
    protected def crunch : Boolean = true
  }

  class Cat extends Animal{
    def burp:Unit = {
      if(crunch) println("Yes")
      else println("No")
    }
  }

  class Dog extends Animal

  var d = new Dog
  d.eat
  println(d.getClass)
  var c = new Cat

  println(c burp)

  class Person(name: String, age:Int){
    def this(name:String) = this(name,0)
  }

  class Adult(name:String, age:Int, idCard:String) extends Person(name, age) {
    override def toString: String =s"[Adult]: {name : ${this.name} , age : ${this.age}, idCard : ${this.idCard}"
  }

  var a = new Adult("Rohit", 10, "420");
  println(a.toString)


  //Final methods can not be overriden
  //Final class can not be overriden
  //sealed class can be overriden in same file but not in other file

}
