package lec1

object CBVvsCBN extends App {

  def infinite():Int = 1 + infinite()

  //this delays execution of y (call by name)
  def printFirst(x:Int, y: => Int) = println(x)

  printFirst(34, infinite())

}
