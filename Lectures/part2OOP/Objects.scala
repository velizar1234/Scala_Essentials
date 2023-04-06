package Lectures.part2OOP

object Objects extends App {

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY//
  //You cannot use a field directly from a class, you have to use it from an instance of that class

  //One difference between an object and a class is that an object does not have parameters
  object Person {
    // "static"/"class" - level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    //factory method, because its sole purpose is to build instances of the certain type, by taking some arguments
    def apply(mother: Person, father: Person): Person = new Person("Bobby")
  }

  class Person(name: String) {
 //instance-level functionality

  }
  //The pattern of naming objects and classes with the same name and in the same scope is called COMPANIONS

  println(Person.N_EYES) //Using an object allows the use of fields directly from the object and not an instance of it
  println(Person.canFly)


  //Scala object is a SINGLETON INSTANCE
  //The object is it's own type (Person) and it is its only instance - that is why we don't need another instance to
  //use fields from that object

  val mary = Person
  val john = Person
  println(mary == john)     //this will return true because both values point to the same instance and the object is its only
                            //instance

  val person1 = new Person("Mary")
  val person2 = new Person("John")
  println(person1==person2)  //this will return false, because these are two DIFFERENT instances of a class

  val bobbie = Person(person1,person2)  //using apply method to invoke the instance


  //Scala Applications => it is a Scala object with:
  //def main(args: Array[String]): Unit
  //This is why we can run these applications, because the App object contains "main"
}
