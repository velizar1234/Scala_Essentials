package Lectures.part1Basics

object Functions extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b

  def aParametarlessFunction(): Int = 42

  println(aParametarlessFunction())
  println(aParametarlessFunction)


  //RECURSIVE FUNCTION - a function that calls itself and substitutes a loop
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Veli", 5))


  //Auxilarry Function - a function that exists to help another function do it's job, usually to handle a specific
  //sub- problem
  def aBigFunction(n: Int): Int = {
    def aSmallFucntion(a: Int, b: Int): Int = a + b

    aSmallFucntion(n, n - 1)
  }

  println(aBigFunction(4))


  //exercise
  def greetingFucntion(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old"
  }

  def factorialFunction(n: Int): Int = {
    if(n <= 1) 1
    else n * factorialFunction(n-1)
  }

  println(factorialFunction(4))


  //fibonaci sequence, where the first two numbers are 1 and 1 and after that each number is the summary of the
  //previous numbers
  def fibonaci(n: Int) : Int =
    if(n <= 2) 1
    else fibonaci(n-1) + fibonaci(n-2)


  println(fibonaci(6))
//1 1 2 3 5 8 13 21 34 55 89 144




  //A prime number is a whole number that cannot be divided by another whole number except 1 and itself
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t : Int) : Boolean =
      if(t<=1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}

