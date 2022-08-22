package lec1

import scala.jdk.Accumulator

object Recursion extends App {

  println(2%3 == 0)

  def factorial(n:Int):Int =
    if(n <= 1) 1
    else{
      println("Computing factorial of " + n + "; first I need factorial of " + (n-1))
      val result = n*factorial(n-1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))

  //FACTORIAL WITH ACCUMULATOR
  def factWithAcc(n : Int, accumulator: Int) : Int =
    if(n <=1) accumulator
    else{
      factWithAcc(n-1, n*accumulator)
    }

  println(factWithAcc(5,1))

  def fibonacciT(n:Int):Int = {
    def fiboTailrec(i:Int,last:Int,nextToLast:Int):Int = {
      if(i>=n) last
      else fiboTailrec(i+1, nextToLast+last, last)
    }

    if(n<=2) 1
    else fiboTailrec(3,1,1)
  }

  fibonacciT(8)


}
