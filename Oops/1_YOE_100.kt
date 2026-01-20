1. What is OOP in Kotlin?
  - It is a fundamental paradigm that organizes code into "objects" representing real-world entities. 
  - These objects contain both data (state/properties) and behavior (methods/functions).


2. What are the four basic OOP principles? (A, E, I, P)
  - Abstraction: Hiding internal details and expose only nesesory part
  - Encapsulation: Privatising properties and expose them via read only methods
  - Inheritance: (Parent Child Relationship) Parent class extends to child to let reuse state and behaviour of parent class
  - Polymorphism: (Many-Form) Allow to override or overload methods in class


3. What is a class in Kotlin?
  - Class is blueprint of an object which has declaration of states and behaviour


4. How do you define a class in Kotlin?
  - by class keyword with class Name
  - `class Solution{ ... }`


5. What is an object in Kotlin?
  - Object is an instance of class which has actual states and behaviour


6. How do you create an object in Kotlin?
  - val car = Car()
  
  
7. What is a constructor in Kotlin?
  - It is special member function which use to create an object


8. What is the primary constructor in Kotlin?
  - Primary constructor is define at class header, and properties initialized instantly
  - Properties in primary constructor can be set private or public


9. What are secondary constructors in Kotlin?
  - Secondary constructor is special member function which use to initilized object of a class,
  - This written inside class and has constructor keyword and it requires primary constructor if primary exists


10. What is an init block in Kotlin?
  - It is use to initilized objects or states before constructor calls
  - It calls after primary constructor property initialized


11. What is encapsulation?
  - It restrict the direct access to preventing accidental modification
  - Its properties are private by default, and can be expose via public method of that class


12. How does Kotlin support encapsulation?
  - By Visibility Modifiers (Private, Public, Protected, Internal)
  - Immutable Variable declaration, which leads to read only properties
  - By genrating getter setter, it reduces boilerplate codes


13. What are the visibility modifiers in Kotlin?
  - In Kotlin we say, Visibility Modifiers
  - In Java we say, Access Modifiers
  - Those are: Pulic, Private, Protected, Internal


14. How do you make a property private in Kotlin?
  - you make a property private by using the private visibility modifier.
  

15. What is a getter in Kotlin?
  - It is a special function used to retrieve the value of a property
  - Kotlin automatics generates default getter property
  - You can customized by overriding get() method
  - It allow to create virtual property, that dont store data but calculate on the fly
  - if property define by val then only getter is generated


16. What is a setter in Kotlin?
  - It is special function which use to set new value to property
  - kotlin internally generates setter to set value for mutable property (Property which declare by `var`)
  - You have field identifier to set actual value to property to avoid recursion
  - By using custom setter, you can control setting value or modifying variable


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
  - It is one of the piller in OOPS
  - Inheriatance allow parent class to extends its properties and behaviour to child class
  - it defines IS-A relationship
  - Kotlin classes are final by default hence for inheritance class need to open to extend

  
20. How do you implement inheritance in Kotlin?
  - Every class in kotlin is final by-default, 
  - To achive Inheritance, we must open class to extend
  - It uses colon to extend Parent class to child class
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
  - classes and methods are final by default, mark them open to extend there behaviours
  - use open keyword in front of method name to override method in subclass


26. Can you override properties in Kotlin?
  - Yes we can, 
  - just open property to override


27. What is the `super` keyword in Kotlin?
  - super keyword use to call parent class member function or properties
  - super() is used to call a specific constructor of the parent class.
  - In case of multiple inheritance, it use to specify which  parent class method is calling, (to avoid Ambiguity)

  
28. Can Kotlin inherit from multiple classes?
  - No, it creates Ambiguity 


29. What is polymorphism?
  - Poly-Many, Morphism-Form
  - Its ability to take multiple form
  - Compile Time polymorphism: Method overloading
  - Runtime Polymorphism: Method overriding


30. What is method overriding?
  - When Parent class method writes in subclass with same function name and signature called overrides
  - A subclass providing its own implementation of a parent method


31. What is method overloading?
  - When single class has multiple methods with same name and different parameters, then function gets overloaded


32. How do you achieve polymorphism in Kotlin?
  - By method overloading and overriding


33. What is dynamic polymorphism in Kotlin?
  - It is also called as Runtime polymorphism, o
  - It achive through method overriding


34. What is static polymorphism in Kotlin?
  - It is also known as Compile-time Polymorphism
  - It is primarily achieved through Function Overloading.


35. What is abstraction in Kotlin?
  - In Kotlin, abstraction is the concept of hiding complex implementation details and exposing only the essential features of an object.
  - It defines what an object does instead of how it does it.
  - It primarily achive by abstract classes and interface

  
36. How do you implement abstraction in Kotlin?
  - abstraction is implemented using abstract classes and interfaces. 
  - Both allow you to define blueprints that other classes must follow.
  - Abstract classes are used when you want to provide a common base with shared state (properties) and behavior for related classes


37. What is an abstract class in Kotlin?
  - Classes which declare using abstract keyword to class level
  - and if member and properties if abstract then class becomes abstract
  - It is partially implemented blueprint of a class
  - You cannot create instant of an abstract class, it should inherited
  - abstract class are open by default


38. How do you define an abstract class in Kotlin?
  - by using abstract keyword at class level
  - a class declared as abstract in Kotlin even if it contains no abstract methods or properties


39. What is an abstract method?
  - method which is declared as an abstract with no method implementation at abstract class
  - abstract class Solution {
      abstract fun primarySolution() 
  }
  

40. Can you create an instance of an abstract class?
  - No We cant create instant of abstract class, if we create then there is no implementation of abstract method
  - You cannot create a direct instance of an abstract class in Kotlin because it is considered an "incomplete" blueprint


41. Can an abstract class have a constructor in Kotlin?

42. What is the difference between an abstract class and an interface?

43. What is an interface in Kotlin?

44. How do you define an interface in Kotlin?

45. How do you implement an interface in Kotlin?

46. Can interfaces have properties in Kotlin?

47. Can interfaces have method implementations in Kotlin?

48. Can a class implement multiple interfaces in Kotlin?

49. What is a marker interface in Kotlin?

50. What is a sealed class in Kotlin?

51. How do you define a sealed class in Kotlin?

52. What is the advantage of using a sealed class?

53. What is delegation in Kotlin?

54. What is a data class in Kotlin?

55. How do you define a data class in Kotlin?

56. What is object declaration in Kotlin?

57. How do you create a singleton in Kotlin?

58. What is a companion object in Kotlin?

59. How do you declare a companion object in Kotlin?

60. What is the purpose of a companion object?

61. What is exception handling in Kotlin?

62. How do you throw an exception in Kotlin?

63. What is a `try-catch` block in Kotlin?

64. What is a checked exception in Kotlin?

65. What are generics in Kotlin?

66. How do you declare a generic class in Kotlin?

67. What is covariance and contravariance in Kotlin?

68. What are extension functions in Kotlin?

69. How do you declare an extension function in Kotlin?

70. What is an inline class in Kotlin?
-> It is a special type of class that wraps a single value in the class 
-> It has only a single value in its constructor
-> At compile time single value gets inline hence at run-time object is not created and memory saves.


71. What is type aliasing in Kotlin?

72. What is a backing field in Kotlin?

73. What is `lateinit` in Kotlin?

74. What is the difference between `val` and `var` in Kotlin?

75. What is `by lazy` in Kotlin?

76. How do you declare a `by lazy` property in Kotlin?

77. What is the difference between `lateinit` and `lazy` in Kotlin?

78. What is the `is` keyword in Kotlin?

79. What is smart casting in Kotlin?

80. What is a lambda expression in Kotlin?

81. What is the `it` keyword in Kotlin?

82. What are higher-order functions in Kotlin?

83. How do you define a higher-order function in Kotlin?

84. What is a closure in Kotlin?

85. What are inline functions in Kotlin?

86. What is the `NullPointerException` in Kotlin?

87. What are nullable types in Kotlin?

88. How do you declare a nullable type in Kotlin?

89. What is the `!!` operator in Kotlin?

90. What is the `?.` (safe call) operator in Kotlin?

91. What is the Elvis operator (`?:`) in Kotlin?

92. What are destructuring declarations in Kotlin?

93. What is the purpose of the `copy()` function in a Kotlin data class?

94. What is tail recursion in Kotlin?

95. What is Kotlin's `@JvmStatic` annotation?

96. What is Kotlin's `@JvmOverloads` annotation?

97. How does Kotlin handle memory management?

98. What is the difference between `==` and `===` in Kotlin?

99. What is reflection in Kotlin?

100. How do you access class metadata in Kotlin?

