package Lectures.part1Basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of" + n + "- I first need factorial of" + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of" + n)

      result
    }
  }

  println(factorial(10)) //stores it in the memory stack and has a limited amount of memory
  //factorial(5000) would crash


  def anotherFactorial(n: Int): BigInt = {
    @tailrec // this will check if the function is tail - recursive and will throw an error if it isn't
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x < 1) accumulator
      else factorialHelper(x - 1, x * accumulator)

    factorialHelper(n, 1)
  }
  //this would work with just factorialHelper, it does not need to be an auxillary function
  //Because, while in the previous example the compiler stored the current result in the stack and then used it later(consuming more space),
  //in this example it replaces current result with the new one, not consuming any extra memory

  //This is what is called TAIL RECURSION = use a recursive call as the last expression

  /*
     anotherFactorial(10) = factorialHelper(10,1)
     = factorialHelper(9, 10 * 1)
     = factorialHelper(8, 9 * 10 * 1)
     = factorialHelper(7, 8 * 9 * 10 * 1)
     = ...
     = factorialHelper(2, 3 * 4 * 5 * ... * 10 * 1)
     = factorialHelper(1, 2 * 3 * 4 * ... * 10 * 1)
     = 1 * 2 * 3 * 4 * ... * 10 * 1
   */

  println(anotherFactorial(5000))
  //WHEN YOU NEED LOOPS USE _TAIL_RECURSION


}