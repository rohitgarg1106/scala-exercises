package lec1

object CaseClasses extends App{

  /*
  * equals, hashcode, toString
  *
  * */
  case class Person(name: String, age: Int)

  //1. case class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)

  //2/ sensible to to String

  println(jim)
  println(jim.toString)

  //3. traits are interfaces

  //5. CCs have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

  //CCs are serializable

//  CCs have extractor patterns = CCs can be used in pattern matching



}
