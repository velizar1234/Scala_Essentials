package Lectures.part1Basics

object stringOps extends App {

  val str: String = "Hello, I am learning Scala"

  //prints the character at that index
  println(str.charAt(2))

  //prints the characters in between those intervals
  println(str.substring(7,11))

  //takes a string and splits the original into an array, splitting it from the places where the input string exists
  println(str.split(" ").toList)

  //returns a true or false, depending if the string exists within the sentence
  println(str.startsWith("Hello"))

  //replaces a chosen char or string with another one
  println(str.replace(" ","-"))

  //changes all characters into upper or lower case
  println(str.toLowerCase())
  println(str.toUpperCase())

  //returns the length of the string
  println(str.length)


  val numberString = "2"
  val number = numberString.toInt

  println('a' +: numberString :+ 'z')   //prepend and append

  println(str.reverse) //this will reverse the whole sentence by characters, while keeping intervals

  //this will take the first n number of characters from the sentence
  println(str.take(2))

  //Scala - specific: String Interpolators

  //S - interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} this year"

  //F - interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  //raw - interpolators
  val escaped = raw"This is a \n newline"   //the backslash will not be detected. This will be printed literally
  println(raw"$escaped") //here the backslashes will be detected

}
