1. What are the main principles of OOP?
-> Abstraction: Hiding Complex reality and exposing nesessory parts
-> Encapsulation: Privatizing properties and reading or update through public methods in class
-> Inheriance: Extend existing class to subclass to inherite properties and behaviour of parent class
-> Polymorphism: Single class having multiple same method name with different param


2. Explain the concept of classes and objects.
-> Class: class is blueprint of instance of class
-> Object: object is instance of class which can access properties and methods


3. What is inheritance? How is it implemented in Kotlin?
-> Inheritance allows class to extends its property and behaviours to other class 
-> Class need to open before extends to further


4. What is polymorphism? Give an example in Kotlin. X 2 

5. What is encapsulation? Why is it important?


6. What is abstraction? How is it different from encapsulation?
-> abstraction hides complex implementation details and shows only essential feature
-> Think of abstract Bank Class Example

abstract class Bank {
	abstract fun getBalance(): Double
	fun getAccNo(): String { return "1234" }
}

class SBI: Bank {
	private val isValidUser: Boolean 	
	override fun getBalance(): Double {
		val acc = getAccNo()
	}
}


7. What is an interface in Kotlin? How is it different from abstract classes? X 2
-> Interface is collection of abstract methods and properties that should be implemented
-> Declared Body of method in interface is optional to override in kotlin 


8. How does Kotlin support multiple inheritance?
-> through interface

9. How do you inherit a class in Kotlin?
-> opening class for extends


10. Explain method overriding in Kotlin with an example.
-> when structure of method in parent class is same as in child class then it called method overriding
-> interface method, abstract method, open method 


11. What is the purpose of the super keyword?


12. How do you define and implement an interface in Kotlin?


13. Can a Kotlin class implement multiple interfaces?
-> YES


14. What is the purpose of default methods in Kotlin interfaces?
-> default method = method in interface having body
-> default method optional to override


15. Can an abstract class in Kotlin have a constructor?
YES, 


15.5 Why abstract class cant crete object
-> Abstract class in incomplete, as it also contains abstract method


16. What is method overloading? Provide an example in Kotlin.
-> Single class contains different method with same name with diff. param called overloading


17. What is operator overloading in Kotlin? Give an example.
-> Kotln allows operator to overload by define certain function using operator keyword.

18. Can constructors be overloaded in Kotlin? How?
-> YES


19. What are variance annotations in Kotlin (in, out)? How do they work with generics?
-> out is used for covarient types (type can be subtype of other)
-> in is used for contraverient (It uses generics to manage type safty)
