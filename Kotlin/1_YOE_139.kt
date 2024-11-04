1. What is Kotlin?
-> Strinct typed programming language, 
-> developed by JetBrains 
-> Built on Top of Java
-> runs on JVM
-> fully interoperable with Java
-> Added Extra features, like Null Safty, Coroutines, Extension Functions, Concise,


2. What are the main features of Kotlin?
-> Null Safty
-> Coroutine for asynchronous programming
-> Extension Function, Lambda Function, Higher Order Function
-> Strictly Typed Programming Language
-> Consice
-> data classes
-> Fully Java interoperable
-> Open Source


3. data class in kotlin
-> data class is primarily used to hold the data
-> compiler auto generates member function to print data class instance to a readable format
-> data class created using data keyword 
-> This class has equals, toString, hashcode and copy method
-> Data class requiers min 1 param in its constructor


4. Extension Function
-> This is kotlin feature
-> This is a normal kotlin function but it is defined/declared outside the class but also a member of the class
-> Such function extends the functionality of the existing class
-> Such function/feature does not disturb the existing flow of feature or source code


5. Lamda Expression
-> This is an anonymous or Lamda function without a name
-> We can pass a lambda expression to other functions as a parameter 
-> Lambda expression can be assigned to a variable


6. Explain Kotlin Null Safty
-> Kotlin Does not support null by default,
-> Explicitly we have to make the value as null
-> Safe Call, Elvis, and Assertion are ways to handle null


7. What is the Elvis operator in Kotlin? ==> (?:)


8. Explain the concept of a companion object.
-> Companion Object is Directly tied to Class not an instance hence We can directly access method and class fields by class name
-> COmpanion Objects are Singleton by default
-> Only one COmpanion Object is allowed per class, Not even different name is allowed


9. What is a higher-order function?
-> The function which takes the normal function or lambda function as an argument and
-> The function which returns the normal function or lambda function as a result are called HOF
-> Lambda functions are frequently sent as an argument


10. What is the difference between val and var?


11. What are sealed classes in Kotlin?
-> Sealed class are declared using the sealed keyword before the class keyword
-> Sealed class is a collection of subclasses
-> Sealed class restrict the hierarchy of inheritance 
-> Compiler knows hierarchy of sealed class at compile time
-> Sealed class can extend to other sealed class
-> subclass of child sealed class can extend parent sealed class, subclass of parent sealed class
-> Selaed class are internally abstract


12. How are object and class different in Kotlin?
-> Class is the blueprint of an instance of that class
-> Object is use for creating a single instance of class it is a Singleton instance


13. What is the init block in Kotlin?
-> init is a block is use to initialise class properties
-> inti block called before class constructor


14. What is a lateinit property?
-> Lateinit is keyword in kotlin 
-> Use to declare a mutable variable in kotlin as a class property
-> We assure the compiler that the variable will be initialized late before accessing it


15. What is a backing field in Kotlin?
-> This is a getter and setter in kotlin, 
-> If we don't write get(), set(field) compiler will auto-generate internally
-> WE can customized get() set(field) in backing field


16. How do you create a singleton in Kotlin?
-> 2 Different ways to create Singleton
-> 1. By object keyword, 2. By companion object in class OR by Traditional Java Way (Like Room database instance)
 

17. What is destructuring in Kotlin?
-> To break the object into different variables at once
-> val (a,b) = Pair(10,20)


18. What is an inline function in Kotlin?
-> This is a normal function with inline keywords, 
-> inline function improves performance by reducing overhead function calls
-> inline function copy its body at caller place during compile time


19. What is the purpose of `with` in Kotlin?
-> `with` is the kotlin scope function
-> This takes an object as a receiver in its param
-> it returns `this` as scope context
-> Properties can be accessed without the dot operator
-> return type of `with` is based on the last line in the scope


20. What are Coroutines in Kotlin?
-> Coroutine is a concurrency design pattern
-> It helps the developer to write asynchronous code without blocking the main thread
-> We Can start the coroutine in 2 ways first by launch block and other by async block,
-> We can expect data back to the caller from async but not launch
-> async returns the Deferred object and gets data using the await method calling
-> Couroutine also has a suspend function, the same as the normal function with the suspend keyword
-> Launching coroutine returns Job Object where we can control coroutine 
-> We can start, pause, stop, and cancel the coroutine via the job object
-> Coroutine launch on Default dispatcher 


21. What is the difference between List, MutableList, and ArrayList?

22. How can you handle exceptions in Kotlin?


23. Explain the use of when expression in Kotlin.
-> When is the same as a switch case statement in Java
-> We can use when as an expression to return the result
-> We can use different types of conditions to when the expression
-> When has else condition instead of default in switch


24. What is a type alias in Kotlin?
-> This provides an alternative name for existing data types or function


25. What is smart casting in Kotlin?
-> Smart cast is a compiler that automatically casts an object 
-> After checking null in the if condition, the null variable will become a non-null variable


26.  What is a tail-recursive function in Kotlin?
-> To avoid stackoverflow errors in kotlin during the recursive function call
-> `tailrec` keyword is added at the function


27. What are generics in Kotlin?
-> Generics allowed to work with any datatype on method, classes or variable 
-> It checks compile-time type safety to work with different types of data


28. Explain the is and as operators in Kotlin.
-> `is` is a kotlin keyword and is used for type checking OR Condition Checking
-> `as` is a Kotlin keyword and is used for explicit type-casting


30. How do you make a function that accepts a variable number of arguments in Kotlin?
-> Use vararg in param


31. What are default arguments in Kotlin?


32. lateinit vs lazy


33. What is the difference between == and === in Kotlin?
-> == : data checks
-> ===: Ref Checks (2 obj points same ref)


34. What is the use of filter, map, and reduce in Kotlin collections?
-> filter is used for extracting elements from the list based on condition
-> map is used to transform objects into another format 
-> Reduce is used to combine results in a single unit


39. How do you declare an enum in Kotlin?
-> enum class Direction { E, W, S, N }


40. What is the difference between a fun interface and a regular interface?
-> fun interface is SAM (Single Abstract Method)
-> IT helps to write an anonymous function to Lambda Expression

41. What is a marker interface in Kotlin?
-> Marker interface is a special type of interface that doesn't have property and method declaration 
-> IT use to make class special for certain requirements 
-> interface Premium
-> class Account: Premium  (You can create an object and save to the Premium interface so the account will change to premium)

========================================================================================================================
 1. What is Kotlin?

2. How is Kotlin different from Java?

3. What are the basic data types in Kotlin?
-> Byte, Short, Int, Long, Float, Double, Char, Boolean, String

4. What are null safety features in Kotlin?

5. What is a data class in Kotlin?

6. How to declare a data class in Kotlin?

7. What is a companion object in Kotlin?

8. What is the difference between val and var?

9. What is the use of lateinit?

10. How to define a function in Kotlin?

11. What is an extension function?

12. What is an example of an extension function?

13. What are coroutines in Kotlin?

14. How do you create a coroutine in Kotlin?

15. What is suspend in Kotlin?

16. How to handle nulls in Kotlin using ?. operator?

17. What is the Elvis operator in Kotlin?

18. How to declare an array in Kotlin?

19. What is let in Kotlin?

20. How to iterate over a list in Kotlin?

21. What is a sealed class?

22. When to use a sealed class?

23. What is apply in Kotlin?

24. How do you define a singleton in Kotlin?
3 Ways 1) Traditional 2) object 3) companion object

25. What are higher-order functions in Kotlin?

26. What is inline in Kotlin?

27. Explain the lazy keyword in Kotlin.

28. What is a backing field in Kotlin?

29. What are the primary constructors in Kotlin?

30. How to create a secondary constructor in Kotlin?

31. What is the == operator in Kotlin?
-> == for structural equality

32. How does the when expression work in Kotlin?

33. What is the use of by keyword in Kotlin?
-> It use to property deligation and implement delegate pattern

34. What are destructuring declarations?

35. Example of destructuring declaration?

36. What is a lambda expression in Kotlin?

37. What is with in Kotlin?

38. How does forEach differ from a for loop?

39. What is a map in Kotlin?
-> collection of key-value pair

40. How to declare a map in Kotlin?

41. What is filter in Kotlin?

42. How to check if a variable is of a particular type? (is keyword)

43. What is the difference between List and Array?

44. What is the infix keyword in Kotlin?

45. How to convert a String to an Int in Kotlin? ("1".toInt())

46. What is enum in Kotlin?
-> It represent fix set of constants

47. How do you create an enum class?
enum class ClassName { C1, C2 ... }

48. What is a tailrec function?

49. What is a range in Kotlin?

50. What is a mutable list?

51. What is an init block in Kotlin?

52. How can you make a class open for inheritance in Kotlin? (by open keyword)

53. What is the purpose of the super keyword in Kotlin?

54. What is typealias in Kotlin?
It gives alternatives name to existing data type

55. Example of typealias?
-> typealias onClick = (Int,Int) -> Unit

56. What is a sealed interface?
-> It restrict which type can implement interface
 
57. How to declare a default value for a function parameter?

58. What are vararg parameters?

59. Example of a function with vararg parameter:
fun show(vararg nums: Int)

60. What is the difference between runBlocking and launch in coroutines?

61. What are nested and inner classes in Kotlin?
-> Inner class need object of outer class, nested dont
 
62. What is crossinline in Kotlin? (REDO)

63. What is the use of noinline in Kotlin?

64. How to create an abstract class in Kotlin?

65. What is the purpose of by lazy?

66. How to declare a constant in Kotlin?

67. What is the use of sealed in Kotlin?

68. What is inline property?

69. What is a unit in Kotlin?

70. What is the with function used for?

71. How to handle exceptions in Kotlin?

72. What is the use of the finally block?

73. What is the is keyword in Kotlin?

74. How to convert a MutableList to an Immutable List? (.toList())

75. What are @JvmStatic, @JvmOverloads, and @JvmField annotations?

76. What is the difference between suspend and blocking functions?

77. What is the default visibility modifier in Kotlin?(public)

78. How to convert a Kotlin String to a CharArray? ("aa".toCharArray())

79. What is the use of super in Kotlin constructors?

80. How to check if a list is empty?

81. What is the difference between let and run?

82. How to convert a String to List of characters?

83. What are infix functions?

84. How to use super with multiple interfaces having the same method?

85. What is a recursive function in Kotlin?

86. How to declare an immutable map in Kotlin?

87. What is the purpose of checkNotNull in Kotlin?

88. What is the use of as keyword in Kotlin?

89. How to concatenate strings in Kotlin?
 
90. What is the difference between throw and throws?

91. What is takeIf in Kotlin?

92. How to create a thread in Kotlin?

93. What are the types of collections in Kotlin?

94. What is destructuring in Kotlin?

95. What is the difference between == and === in Kotlin?
-> == : structure equality , === referanctial equality

96. How to convert a list to a set in Kotlin?
-> listOf(1, 2, 2, 3).toSet()

97. What is flow in Kotlin?
-> Stream of data asynchronusly

98. What is coroutineScope in Kotlin?

