package lec1

object Functions extends App {

  def aFunction(a: String, b: Int) : String = {
    a + " " + b
  }

  println(aFunction("hello", 3))


  def aRepeatedFunction(a : String, n : Int) : String = {
    if(n == 1) a
    else a + aRepeatedFunction(a, n-1);
  }

  println(aRepeatedFunction("hello", 5))

  // WHEN YOU NEED LOOPS, USE RECURSION
  // YOU DONT NEED RETURN TYPE IN FUNCTIONS


  def aBigFunction(n : Int) : Int = {
    def aSmallFunction(a: Int, b:Int):Int = a + b
    aSmallFunction(n,n-1);
  }

  //greeting function

  def greeting(name:String, age:String) : String = {
    "%s %s".format(name,age)
  }

  def fibonacci(n : Int) : Int = {
    if(n<=1){
      1
    }
    else{
      fibonacci(n-1) + fibonacci(n-2)
    }
  }

  println(fibonacci(4))

  println(greeting("Rohit", "10"))
}


/*
* val message = "Hello, World
* compiler figures out type based on context
* compiler looks at implementation and able to guess return type
*
* */
