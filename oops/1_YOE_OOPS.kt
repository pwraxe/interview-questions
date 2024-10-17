1. What is a class in Kotlin?
-> Blueprint of of creating of an object which has properties and behaviour.
OR
-> Class is blueprint of creating an object that encapsulate data and behaviour.


2. What is a object in Kotlin?
-> Object is instance of class which creates behavior of class

3. Explain the primary constructor in Kotlin.
-> This is default constructor in kotlin
-> It use to create object of class 
-> Paramter are optinals while creating object
-> Parameter in primary constructor often initialized class variable.
-> Such constructor appear at header of class
-> We can also create primary constructor inside class like java constructor


4. What is a secondary constructor in Kotlin?
-> This use to create object of class with different parameter
-> Such constructors provides additional ways to initilised class or creating object when primary constructor is not sufficient
-> Param is compalsary in this constructor as primary is not sufficient
-> We can write multiple secondary constructors by different argument
-> such constructors are created by constructor keyword.

5. What are properties in Kotlin?
-> Instance variable in class

6. What are methods in Kotlin?
-> function inside the class which define behaviour of class 

7. What is an interface in Kotlin?
-> interface is the collection of declaration of abstract methods and properties.
-> It defines implementation for class
-> methods can be declare and define in interface
-> Declared method need to override and define method optional
-> properties only can declare
-> Interface cannot store state thats why its diff. from abstract class


9. What is inheritance in Kotlin?
-> Inheritance is one of the piller in oops. 
-> When class extends its properties and behaviour to its child class without modifiying them.
-> only public and protected function call get called from child, not private
-> method and class should be mark open to extend and override resp.


10. What is the open keyword in Kotlin?
-> Every class is final by default
-> To extend class, its properties and behaviour that must be open 
-> When class open, it can extend to subclass 
-> when variable and method is open it can overriden to subclass

11. What is super in Kotlin?
-> Super keyword is use to call parent class method before child class method
-> super keyword is helps to access superclass method and properties


12. What is the difference between val and var?

13. What is polymorphism in Kotlin?
-> Poly=Many, Morphism=Form
-> Single class having multiple method having same name with different parameter called polymorphism
-> 1. CompileTime Polymorphism (Method overloading)
-> 2. Run time polymorphism (Method overriding)


14. Explain method overloading in Kotlin.

15. Explain method overriding in Kotlin.


16. What is encapsulation in Kotlin?
-> Encapsulation is state of hiding data or restrict the access of data and exposing them via internal method
-> controlling prohibited/restricted data thriugh public method of class 
-> Ex. private bankBalance variable can access/controlled via public method
 

18. What is abstraction in Kotlin?
-> Abstraction is hide complex implementation of class and expose nesessory functioanlity.
-> abstract class define by abstract keyword
-> if class contains abtract method then class becomes abstract class


19. What is constructor delegation in Kotlin?
-> calling primary constructor from secondary constructor using `this` keyword


20. Explain the use of init block in Kotlin.


21. What is the difference between an abstract class and a sealed class?
-> abstract class: this class has abstract method without body, this can be inherited any class, open by default.
-> sealed class: collection of classes including abstract one


22. What is a nested class in Kotlin?
-> class inside class called nested class
-> internal class dont have inner ketword and it can be acces as OuterclassName.InnerClassName


23 What is an inner class in Kotlin?
-> inner class is class inside other class
-> inner class can access by object of outer class.

24. What is visibility modifier in Kotlin?
-> Public, Private, Protected, internal


25. What is the internal modifier in Kotlin?
-> The internal modifier makes the class or member visible only within the same module.


26. What is a companion object extension function?
-> companion object extension function is same as Extension function
-> this function is accessible outside the class as companion object of class
Ex. class Solution {
	companion object {}
}
fun Solution.Companion.show() {}




===============================================
Abstraction
Encapsulation
Inheritance
Polymorphism



Why cant create Object of interface 
Why cant create Object of abstract class
abstract class Vs interface

 
