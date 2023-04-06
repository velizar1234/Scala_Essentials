package Lectures.part1Basics

object Exercises extends App {
  /*
  1. Concatenate a string n times using tail recursion
  2. IsPrime with tail recursion
  3. Fibonacci sequence using tail recursion
  */

  def stringConcatenator(word: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else stringConcatenator(word, n - 1, word + accumulator)

  println(stringConcatenator("hello", 3, ""))


  def isPrime(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)


  }

  println(isPrime(2003))
  println(isPrime(649))


  def fibonacciNumber(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonacciNumber(8))

}
