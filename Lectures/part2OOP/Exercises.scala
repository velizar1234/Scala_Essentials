package Lectures.part2OOP

object Exercises extends App {

  /*
     Novel and Writer class

     Writer: first name, surname, year
        - method: fullname

     Novel: name, year of release, author(instance of type writer )
        - author age - age at the year of release
        - isWrittenBy (author)
        - copy (new year of release) = new instance of Novel
   */

  class Writer(first_name: String, surname: String, val year: Int) {
    def fullname(): String = first_name + " " + surname
  }


  class Novel(name: String, yearOfRelease: Int, author: Writer) {
    def authorAge(): Int = author.year - yearOfRelease

    def isWrittenBy(author: Writer) = author == this.author

    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }

  /*
      Counter Class
      - receives an Int
      - method that returns a current count
      - method to increment and decrement => new counter
      - overload inc/dec to receive an amount by which to increment or decrement
   */

  class Counter(count: Int = 0) {
    def currentCount() = count

    def increment() = new Counter(count + 1) //immutability

    def decrement() = new Counter(count - 1)

    def increment(x: Int): Counter = {
      if (x <= 0) this
      else increment().increment(x - 1)
    }


    def decrement(x: Int): Counter = {
      if (x <= 0) this
      else decrement().decrement(x - 1)
    }

    def print = println(count)
  }











  class Person(val name: String, favouriteMovie: String,val age: Int = 0) {

    def likes(movie: String): Boolean = movie == favouriteMovie


    //this function acts as an operator, performing a task between two elements
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"


    def unary_! : String = s"$name, what the heck?"

    def isAlive: Boolean = true

    def apply(): String = s"Hi my name is $name and I like $favouriteMovie"



    /*
    1.Overload the + operator that takes a String, returns a new person with a nickname
    2.Add age to the Person class, default 0 value, and add a unary_+ operator that increments the value of age and returns
    a new person.
    3.Add a learns method into the Person class, that takes a string and returns a sentence => "Mery learns Scala"
    Add a learnsScala method that doesn't receive any parameters and calls the learns method with "Scala" as a parameter
    Use it in postfix notation
    4.Overload the apply method to receive a number and return a string
    mery.apply(2) => "Mery watched her favourite movie Inception 2 times"
    */


    def +(nickname: String): Person = new Person(s"$name ($nickname)", favouriteMovie)

    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)

    def isLearning(learn: String) = s"$name is learning $learn"
    def isLearningScala(): String = this isLearning("Scala")

    def apply(n: Int): String = s"$name watched her favourite movie $favouriteMovie $n times"

  }


}
