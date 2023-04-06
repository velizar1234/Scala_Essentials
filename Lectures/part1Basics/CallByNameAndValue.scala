package Lectures.part1Basics

object CallByNameAndValue extends App {

  def calledByValue(x: Long): Unit = {
    println("by value:" + x)
    println("by value:" + x)
  }


  def calledByName(x: => Long): Unit = {   //the => operator here means that the value will be called BY NAME
    println("by value:" + x)
    println("by value:" + x)
  }

  calledByValue(System.nanoTime()) //the exact value of this expression is computed before the function evaluates
  calledByName(System.nanoTime())  //this expression is passes as it is, in real time, so both lines will be different
}
