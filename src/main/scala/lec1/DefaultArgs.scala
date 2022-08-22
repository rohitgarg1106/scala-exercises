package lec1

import scala.jdk.Accumulator

object DefaultArgs extends App{

  def trFact(n : Int, accumulator: Int = 1): Int =
    if (n<=1) accumulator
    else trFact(n-1,n*accumulator)

}
