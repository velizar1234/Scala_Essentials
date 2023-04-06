package Lectures.part2OOP

import java.io.Writer

object OOP_Basics extends App {

  val person = new Person("John", 26)
  println(person.age) //if you add val or var you make the class parameter into a usable field
  println(person.x)
  person.greeting("Daniel")

  val counter = new Counter
  counter.increment().print
  counter.increment().increment().increment()   //apply the function three times
  counter.increment(10).decrement().decrement(5).print
}


//class parameters are not fields that you can access
class Person(name: String,val age: Int) {    //constructor
 //class body
  val x = 2

  println(1 + 3)

  //method
  def greeting(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //method overloading
  def greeting(): Unit = println(s"Hi, my name is $name")  //when method has no parameters "this" is implied, so this.name
  //referencing the class argument


  //multiple constructors/constructor overloading
  def this(name: String) = this(name, 0 )
  def this() = this("John Doe")       //auxiliary constructors are only used to alter and call the primary constructor
  //therefore they are impractical
}


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

  def copy(newYear: Int): Novel = new Novel(name, newYear,author)
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

   def increment()= new Counter(count + 1)   //immutability

   def decrement()= new Counter(count - 1)

  def increment(x: Int): Counter = {
    if(x <= 0) this
    else increment().increment(x - 1)
  }


  def decrement(x: Int): Counter = {
    if(x <= 0) this
    else decrement().decrement(x - 1)
  }

  def print = println(count)
}

