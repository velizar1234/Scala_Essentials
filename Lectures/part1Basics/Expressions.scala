package Lectures.part1Basics

object Expressions extends App {

   val x = 1 + 2 // expression

  println(2 + 3 * 2)

  println(1 == x) // returns a boolean

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 //aVariables will equal 5
  //changing a variable is called a side effect



  //Instructions vs Expressions
  //Instructions - tell the computer what to do.(DO)
  //Expressions - something that has a value(VALUE)

  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 //IF EXPRESSION
  println(if(aCondition)5 else 3)

  var i = 0
  while(i<10) {
    println(i)
    i+=1
  }

  //Don't do loops
  //Everything in Scala should be an expressions, not an instruction!!!

  val aWierdValue = (aVariable = 3) //value is a Unit// Unit is equivalent to void
  //while loops return Units and are therefore called side effects

  //code blocks

  val codeBlock = {
    val y = 2
    val z = y + 2

    if(z < 2) "hello" else "goodbye"
  } //the value of the block is equal to the value of its last expression, in this case hello or goodbye



}
