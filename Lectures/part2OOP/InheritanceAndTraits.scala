package Lectures.part2OOP

object InheritanceAndTraits extends App {
   //single - class inheritance = you can only extend one class at a time

  class Animal { //super class

    //keyword "private" will allow access to the value or method only to members of the same class
    //keyword "protected" allows access to inheriting classes but not outside them
    def eat(): Unit = println("Nom Nom Nom")

    val name = "Steve"
    val creatureType = "wild"
  }

  class Cat extends Animal {  //sub class
    def crunch() = {
      eat()
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch()

  //A sub class inherits the non private members from its super class



  //constructors
  //When extending a class, the class constructor must be called, however before the child constructor is called
  //the parent constructor needs to be called first
  class Person(name: String,age: Int) {
    def this(name: String) = this(name,0)
  }

  //Here a constructor is defined that tells the compiler where it can find the age, so we don't need to specify it
  class Adult(name: String,age: Int,idCard: String) extends Person(name)



  //OVERRIDING = when you create a value or method with the same signature as an existing one between a super class and a sub
  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType: String = "domesticated"
    override def eat(): Unit = {     //both values and methods can be overriden
      super.eat()
      println("crunch crunch")
    }

  }



  val dog = new Dog("K9")
  dog.eat()
  println(dog.creatureType)


  //type substitution     (broad sense: polymorphism)
  val unknownAnimal : Animal = new Dog("K9")
  unknownAnimal.eat()     //this will print "crunch crunch", because even tho its an animal type, it is instantiated as a Dog
  //the method that will be called will be the most overriden version, whenever possible
  println(unknownAnimal.name)

  //overRIDING vs overLOADING

  //super - a keyword, used when you want to call an overriden method from a parent class


  //preventing overrides
  //1. Use the keyword "final" on member - prevents a value or method from being overriden
  //2. Use "final" on the entire class - prevents other classes from extending to the final class
  //3. Seal the class - softer restriction, where you CAN extend classes in THIS FILE, but cannot in other files
  //uses the keyword "sealed"
}