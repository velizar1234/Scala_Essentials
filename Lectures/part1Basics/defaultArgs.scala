package Lectures.part1Basics

object defaultArgs extends App {

  def tailFact(n: Int, acc: Int = 1): Int =  //giving the acc a value of 1 is a default value, same as in a constructor
    if(n <= 1)acc
    else tailFact(n - 1, n * acc)

  val factTen = tailFact(10, 2)  // the acc value is overwritten

  def savePicture(format: String = "jpg", height: Int = 1920, width: Int = 1080) : Unit = {
    savePicture(height = 800, width = 600, format = "pdf")
  }
}
