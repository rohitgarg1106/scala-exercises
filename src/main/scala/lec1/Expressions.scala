package lec1

object Expressions extends App{
  val x = 1 + 2
  println(x)

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  //INSTRUCTIONS (DO) and EXPRESSIONS (VALUE)
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  //WHILE LOOP IN JAVA
  var i = 0
  while(i<10){
    println(i)
    i += 1
  }


  //UNITS IN SCALA
  val aWeirdValue = (aVariable = 3) // Unit === Void
  println(aWeirdValue)

  //side effects return unit : println, whiles, reassigning

  //code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)

  //difference between "hello world" vs println("hello world")?

  val someValue = {
    2<3
  }

  println(someValue)

}
