1. What is OOP in Kotlin?
  - It is a fundamental paradigm that organizes code into "objects" representing real-world entities. 
  - These objects contain both data (state/properties) and behavior (methods/functions).


2. What are the four basic OOP principles? (A, E, I, P)
  - Abstraction: Hiding internal details and exposing only the necessary part
  - Encapsulation: Privatising properties and exposing them via read-only methods
  - Inheritance: (Parent Child Relationship) Parent class extends to the child to reuse the state and behaviour of the parent class
  - Polymorphism: (Many-Form) Allow to override or overload methods in a class


3. What is a class in Kotlin?
  - A class is a blueprint of an object that has a declaration of states and behaviour


4. How do you define a class in Kotlin?
  - by class keyword with class Name
  - `class Solution{ ... }`


5. What is an object in Kotlin?
  - An object is an instance of a class that has actual states and behaviour


6. How do you create an object in Kotlin?
  - val car = Car()
  
  
7. What is a constructor in Kotlin?
  - It is a special member function which use to create an object


8. What is the primary constructor in Kotlin?
  - Primary constructor is defined at the class header, and properties are initialized instantly
  - Properties in the primary constructor can be set private or public


9. What are secondary constructors in Kotlin?
  - Secondary constructor is a special member function which is used to initilized object of a class,
  - This is written inside a class and has a constructor keyword, and it requiresa  primary constructor if primary exists


10. What is an init block in Kotlin?
  - It is used to initialize objects or states before constructor calls
  - It calls after the primary constructor property is initialized


11. What is encapsulation?
  - It restricts direct access to prevent accidental modification
  - Its properties are private by default, and can be exposed via a public method of that class


12. How does Kotlin support encapsulation?
  - By Visibility Modifiers (Private, Public, Protected, Internal)
  - Immutable Variable declaration, which leads to read-only properties
  - By generating getter and setter, it reduces boilerplate codes


13. What are the visibility modifiers in Kotlin?
  - In Kotlin, we say, Visibility Modifiers
  - In Java, we say, Access Modifiers
  - Those are: Public, Private, Protected, Internal


14. How do you make a property private in Kotlin?
  - You make a property private by using the private visibility modifier.
  

15. What is a getter in Kotlin?
  - It is a special function used to retrieve the value of a property
  - Kotlin automatically generates a default getter property
  - You can customize by overriding the get() method
  - It allows creating virtual property that dont store data but calculates on the fly
  - If the property is defined by val, then only a getter is generated


16. What is a setter in Kotlin?
  - It is a special function which use to set a new value to a property
  - kotlin internally generates a setter to set the value for a mutable property (a property that is declared by `var`)
  - You have a field identifier to set the actual value to property to avoid recursion
  - By using a custom setter, you can control the setting value or modifying variable


17. How do you define custom getters and setters in Kotlin?
  - Custom Getter
  - val fullName: String
      get() = "$firstName $lastName"

  - Custom Setter
  - var age: Int = 0
      set(value) {
        if (value >= 0) field = value // 'field' updates the actual stored value
      }

      
18. What is the default visibility modifier in Kotlin?
  - The default visibility modifier in Kotlin is public.


19. What is inheritance?
  - It is one of the pillars of OOPs
  - Inheriatance allow parent class to extend its properties and behaviour to the child class
  - It defines an IS-A relationship
  - Kotlin classes are final by default, hence an inheritance class needs to be open to extend

  
20. How do you implement inheritance in Kotlin?
  - Every class in kotlin is final by-default, 
  - To achieve inheritance, we must open the class to extend
  - It uses a colon to extend Parent class to child class
  - open class Child: Parent() { ... }

  
21. What is the `open` keyword in Kotlin?
  - The open keyword is used to make classes, methods, or properties available for inheritance and overriding.


22. What is the `final` keyword in Kotlin?
  - The final keyword is used to prevent a class, method, or property from being inherited or overridden.


23. Can Kotlin classes be inherited by default?
  - No, they are final by default


24. How do you call the parent class's constructor in Kotlin?
  - For Primary constructor case: If the child class has a primary constructor, you pass the parameters directly to the parent's constructor after the colon.
  - For Secondary Constructor: If the child class uses a secondary constructor, you use the super keyword to initialize the parent class.


25. How do you override a method in Kotlin?
  - classes and methods are final by default, mark them open to extend their behaviours
  - use open keyword in front of the method name to override the method in a subclass


26. Can you override properties in Kotlin?
  - Yes, we can, 
  - just open the property to override


27. What is the `super` keyword in Kotlin?
  - super keyword used to call the parent class member function or properties
  - super() is used to call a specific constructor of the parent class.
  - In case of multiple inheritance, it is used to specify which  parent class method is calling (to avoid Ambiguity)

  
28. Can Kotlin inherit from multiple classes?
  - No, it creates Ambiguity 


29. What is polymorphism?
  - Poly-Many, Morphism-Form
  - Its ability to take multiple forms
  - Compile Time polymorphism: Method overloading
  - Runtime Polymorphism: Method overriding


30. What is method overriding?
  - When a parent class method is written in a subclass with the same function name and signature called overrides
  - A subclass providing its own implementation of a parent method


31. What is method overloading?
  - When a single class has multiple methods with the same name and different parameters, then the function gets overloaded


32. How do you achieve polymorphism in Kotlin?
  - By method overloading and overriding


33. What is dynamic polymorphism in Kotlin?
  - It is also called Runtime polymorphism, or
  - It achieves this through method overriding


34. What is static polymorphism in Kotlin?
  - It is also known as Compile-time Polymorphism
  - It is primarily achieved through Function Overloading.


35. What is abstraction in Kotlin?
  - In Kotlin, abstraction is the concept of hiding complex implementation details and exposing only the essential features of an object.
  - It defines what an object does instead of how it does it.
  - It is primarily achieved by abstract classes and interfaces

  
36. How do you implement abstraction in Kotlin?
  - Abstraction is implemented using abstract classes and interfaces. 
  - Both allow you to define blueprints that other classes must follow.
  - Abstract classes are used when you want to provide a common base with shared state (properties) and behavior for related classes


37. What is an abstract class in Kotlin?
  - Classes that declare using the abstract keyword at the class level
  - and if member and properties are abstract, then the class becomes abstract
  - It is a partially implemented blueprint of a class
  - You cannot create instant of an abstract class, it should be inherited
  - abstract class are open by default


38. How do you define an abstract class in Kotlin?
  - by using an abstract keyword at the class level
  - a class declared as abstract in Kotlin even if it contains no abstract methods or properties


39. What is an abstract method?
  - A method that is declared as an abstract method with no method implementation at abstract class
  - abstract class Solution {
      abstract fun primarySolution() 
  }
  

40. Can you create an instance of an abstract class?
  - No, We cant create instant of an abstract class, if we create then there is no implementation of the abstract method
  - You cannot create a direct instance of an abstract class in Kotlin because it is considered an "incomplete" blueprint


41. Can an abstract class have a constructor in Kotlin?
  - We don't have instant of an abstract class, but we can havea  primary & secondary constructor of an abstract class.
  - Those need to be initialized as non-abstract properties or behaviour
  

42. What is the difference between an abstract class and an interface?
  - Abstract class: 
       = It can hold state using baking fields
       = It can have a primary and a secondary constructor
       = Supports single inheritance
       = Members can have different visibility modifiers (Private, Public, Protected, Internal)
       = It requires an abstract keyword to declare a class as an abstract class 
      
  - Interface:
       = It dont have states, they are declared properties
       = It dont have a primary and secondary constructor
       = IT supports multiple inheritance (multiple classes can implement a single interface)
       = Properties and methods are abstract by default and public too


43. What is an interface in Kotlin?
  - It is custom types that serve as a blueprint or contract to classes that follow.
  - properties and methods are abstract by default
  - In the latest kotlin version, methods can have a body, and such methods are optional to override
  - An interface that has a single abstract method can be declared as a `fun interface`.
  

44. How do you define an interface in Kotlin?
  - By using the interface keyword
  - interface HomeMap { ... }


45. How do you implement an interface in Kotlin?
  - By using the implement keyword next to the class name


46. Can interfaces have properties in Kotlin?
  - Yes, but without backing fields
  

47. Can interfaces have method implementations in Kotlin?
  - Yes, Interface has method implementation in kotlin
  

48. Can a class implement multiple interfaces in Kotlin?
  - Yes,

  
49. What is a marker interface in Kotlin?
  - An interface that does not have properties and behaviour


50. What is a sealed class in Kotlin?
  - A sealed class is a collection of subclasses that restricts the hierarchy of inheritance


51. How do you define a sealed class in Kotlin?
  - by using the sealed keyword


52. What is the advantage of using a sealed class?
  - Restricted Inheritance: It allows you to define which classes can extend
  - Compile-time Safety: The compiler knows all possible subclasses at compile time
  - Exhaustive Checks (No 'Else' needed): Compiler knows as subclasses, hence in conditional checks, like when no else needed
  - State Management: All subclasses have their own unique states (Properties). 


53. What is delegation in Kotlin?
  - Delegation is a design pattern that transfers ownership of an object to another object
  - A class cannot delegate the same interface to multiple objects because the compiler won't know which one to use.


54. What is a data class in Kotlin?
  - It is a special class that holds the state of the class, 
  - compiler auto-generates the following methods: copy(), componentN(),
  - Primary constructor must have min 1 parameter declared by var or val
  - A data class cannot be abstract, open, or sealed


55. How do you define a data class in Kotlin?
  - data class Solution {}
  
56. What is object declaration in Kotlin?
  - like static class (object Solution)

57. How do you create a singleton in Kotlin?
  - By object declaration
  - Traditional Java way
  - Companion object

58. What is a companion object in Kotlin?


59. How do you declare a companion object in Kotlin?
  - inside the class 
  
60. What is the purpose of a companion object?
    - Properties and methods that belong to the class instead of the class instance
  
61. What is exception handling in Kotlin?
    - Abnormal flow of execution that is handled by a try{} catch{} block


62. How do you throw an exception in Kotlin?

63. What is a `try-catch` block in Kotlin?

64. What is a checked exception in Kotlin?
  - Kotlin does not have checked exceptions

65. What are generics in Kotlin?
  - It allow to write code that allows different data types, represented as <T>

  
66. How do you declare a generic class in Kotlin?
  - class Box<T>(val item: T)
  - fun <T> printItem(item: T) { ... }

  
67. What is covariance and contravariance in Kotlin?
  - Covariance (out keyword): Covariance means you can use a Subtype where a Supertype is expected. It makes class producer
  - Contravariance (in keyword): It means you can use a Supertype where a Subtype is expected.It makes the class a Consumer. It can only "take" (receive) the type T as an argument, but it cannot return it.
  // Covariant: Can only return T
  interface Producer<out T> {
      fun produce(): T
  }
  
  // Contravariant: Can only take T as input
  interface Consumer<in T> {
      fun consume(item: T)
  }

68. What are extension functions in Kotlin?
  - Extension functions allow you to add new functions to an existing class without modifying its source code or inheriting from it.
  - Such a function is written outside the class, but has a part of the class
  - It extends the behaviour of the class, 
  - It can be added as a plugin to the class without creating an extra instance of the class, and it does not affect existing functionality


69. How do you declare an extension function in Kotlin?
  fun String.removeFirstChar(): String {
      return this.substring(1)
  }
    
70. What is an inline class in Kotlin?
-> It is a special type of class that wraps a single value in the class 
-> It has only a single value in its constructor
-> At compile time single value gets inline hence at run-time object is not created and memory saves.
@JvmInline
value class Solution(val value: Int)


71. What is type aliasing in Kotlin?
  - Providing alternative name to existing data type (typealias)
  - typealias OnError = (message: String, code: Int) -> Unit
  - fun fetchData(errorHandler: OnError) { ... }


72. What is a backing field in Kotlin?
  - getter and setter 
  
73. What is `lateinit` in Kotlin?
  - late initialization
  
74. What is the difference between `val` and `var` in Kotlin?
  - val : immutable property
  - var : mutable property

  
75. What is `by lazy` in Kotlin?
  - It is a delegate property, its preinitilized but loaded in memoryy when first time calls

76. How do you declare a `by lazy` property in Kotlin?

77. What is the difference between `lateinit` and `lazy` in Kotlin?

78. What is the `is` keyword in Kotlin?

79. What is smart casting in Kotlin?
  - Kotlin compiler automatically handles type casting for you.
  - use of `is` keyword

80. What is a lambda expression in Kotlin?
  - It is annonymous function which has no name but returns results
  - { a:Int, b:Int -> a-b }

  
81. What is the `it` keyword in Kotlin?
  - a single parameter inside a lambda expression


82. What are higher-order functions in Kotlin?
  - a function which take other function as a parameter called HOF
  - fun onSubmit(onClick:() -> Unit) {
      onClick ()
    }

  
83. How do you define a higher-order function in Kotlin?
  - fun onSubmit(onClick:() -> Unit) {
      onClick ()
    }
  
84. What is a closure in Kotlin?
  - A lambda or an anonymous function can access and modify variables that are defined outside its own scope.
fun main() {
    var counter = 0 // Variable in the outer scope
    val increment: () -> Unit = {
        counter++ // The lambda accesses and modifies 'counter'
        println(counter)
    }

    increment() // Output: 1
    increment() // Output: 2
    increment() // Output: 3
}



85. What are inline functions in Kotlin?
  - Compiler copy block of code of the inline function to the caller's place instead of jumping to the function's place


86. What is the `NullPointerException` in Kotlin?
  

87. What are nullable types in Kotlin?
  - `?` makes property nullable

  
88. How do you declare a nullable type in Kotlin?
  - var name: String? = null

89. What is the `!!` operator in Kotlin?
  - non-null assertion operator

90. What is the `?.` (safe call) operator in Kotlin?

91. What is the Elvis operator (`?:`) in Kotlin?
  - It checks for a nullable field; if null, then return the default one
  - name ?: "Dummy Name"

92. What are destructuring declarations in Kotlin?
  - Destructuring allows you to "break apart" an object into multiple variables in a single line
  - class Person(name: String, age:Int)
  - val (name, age) = Person("AAA","21")

  
93. What is the purpose of the `copy()` function in a Kotlin data class?
  - To update only a specific field/property of the data class
  
94. What is tail recursion in Kotlin?
  - to avoid Stackoverflow, tailrec is used

95. What is Kotlin's `@JvmStatic` annotation?

96. What is Kotlin's `@JvmOverloads` annotation?

97. How does Kotlin handle memory management?

98. What is the difference between `==` and `===` in Kotlin?

99. What is reflection in Kotlin?

100. How do you access class metadata in Kotlin?




