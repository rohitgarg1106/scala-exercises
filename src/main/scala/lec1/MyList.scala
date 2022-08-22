package lec1

abstract class MyList {
//    head = first element of list
//    tail = remainder of the list
//    isEmpty = is the list empty
// add(int) = return new list with element added
// toString = string representation of list

  def head : Int
  def tail : MyList
  def isEmpty : Boolean
  def add(n : Int) : MyList
  def printList : String

}

object Empty extends MyList {
  override def head: Int = 0

  override def tail: MyList = Empty

  override def isEmpty: Boolean = true

  override def add(n: Int): MyList = new Cons(n, Empty)

  override def printList: String = "empty->"
}

class Cons(h : Int, t : MyList) extends MyList{
  override def head: Int = h

  override def tail: MyList = t

  override def isEmpty: Boolean = false

  override def add(n : Int) = new Cons(n, this)

  override def printList: String = s"${this.h}->${this.t.printList}"
}

object Play extends App{
  var c : MyList = new Cons(1,Empty)
  println(c.printList)

  c = new Cons(1, new Cons(2, new Cons(3, new Cons(4, Empty))))
  println(c.printList)

  //bounded types

//  class Animal
//  class Dog extends Animal
//  class Cat extends Animal
//
//  class Cage[A <: Animal] (animal: Animal)
//
//  var c =



}


