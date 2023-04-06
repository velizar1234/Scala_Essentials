package Lectures.part2OOP

import scala.language.postfixOps

object Method_Notations extends App {

  class Person(val name: String,favouriteMovie: String)  {

    def likes(movie: String): Boolean = movie == favouriteMovie


    //this function acts as an operator, performing a task between two elements
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"



    def unary_! : String = s"$name, what the heck?"

    def isAlive : Boolean = true

    def apply(): String = s"Hi my name is $name and I like $favouriteMovie"

  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))



  //syntactic sugar
  //object - method - parameter
  println(mary likes "Inception")  //these two lines are equivalent
  //infix notation / operator notation
  //only works with methods that have only one parameter



  //"Operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(2+3)
  println(mary.+(tom))

  println(1+2)
  println(1.+(2))
  //ALL OPERATORS ARE METHODS

  //prefix notation
  val x = -1           //these two are equivalent
  val y = 1.unary_-
  //unary_prefix only works with a few operators: - + ~ !

  println(!mary)       //these two are identical
  println(mary.unary_!)

  //postfix notation
  //methods that don't take any arguments can have a postfix notation

  println(mary.isAlive)   //equivalent
  println(mary isAlive)


  //apply method
  println(mary.apply())   //equivalent
  println(mary())




}
