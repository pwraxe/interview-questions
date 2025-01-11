==BASICS

1. What is Kotlin?

2. Why is Kotlin preferred over Java?
-> NPE, Concise code, Removes boilerplate codes, Interoperable

3. What are the key features of Kotlin?
-> NPE, Concide, HigherOrder, Extension, Lambda Functions, Coroutine, OS

4. What are Kotlin’s primary data types?
-> Byte, Short, Int, Long, Float, Double, Boolean, Char

5. What is the difference between var and val in Kotlin?
-> var: Mutable | val: Immutable

==OOP

6. What is an object in Kotlin?
-> Instance of that class which contains actual data and behaviour of that class

7. What are the types of constructors in Kotlin?
-> Primary and Secondary

8. Explain the data class in Kotlin.

9. What is the sealed class in Kotlin?
-> Restrict Inheritance Hierarchy, Compiler knows all hierarchy at compile time, sealed keyword, Should be in same file

10. What is the object keyword used in Kotlin?
-> Object is a Special keyword in kotlin 
-> It acts like a static in Java
-> We can directly access properties and methods directly object name
-> It is singleton by default
-> It is used to create singleton objects, declare anonymous classes and object expression

==FUNCTIONAL

11. What is a higher-order function in Kotlin?
-> A function that accepts and returns the lambda function

12. What is an extension function in Kotlin?

13. What is the lambda expression in Kotlin?
-> lambda function which can pass as arg or assign to a variable

14. What is the let function in Kotlin?
-> Let is scope function
-> Ideally it runs on nullable variable if it is not null
-> It cast the null variable to not null for data
-> It provides it as the current scope context

15. What are inline functions in Kotlin?
-> Copy the body of the inline function at the caller's place
-> It reduces calling the same function again and again
-> It improves performance and reduces memory occupation

==NULL SAFTY
16. How does Kotlin handle null values?
-> Kotlin does not support nullability by default
-> We have to make variables nullable explicitly
-> If we have a nullable variable then kotlin provides 4 different ways to handle null values
-> 1) Safe Call 2) Elvis Operator 3) Assertion 4) Let Block

17. What is the !! operator in Kotlin?
-> !! is an Assertion operator (Risky Operator)

18. What is the Elvis operator (?:) in Kotlin?
-> It is a short syntax to handle the null variable
-> If the nullable variable is not null then it returns as it else returns the default value
-> It is a more clean and concise way to handle nullable variable 

19. How can you handle null values using safe calls in Kotlin?
-> ?.

20. What is the purpose of letting in null safety?
-> Let is scope function which gives us `it` as the current scope context.
-> It executes a block of code only if the nullable variable is not null
-> It cast nullable to non-nullable to safely work on an object
-> It allows us to create weak references of an object


21. What are coroutines in Kotlin?
-> Concurrency Design Pattern, 
-> Writes Asynchronous code, w/o blocking main thread
-> Lauch Async,
-> suspend function


22. What is suspended in Kotlin?
-> can control (Start, Pause, Resume, Stop)
-> execute independently
-> call from the scope or other suspend function


23. What is the launch of Kotlin?
-> Launch is an Extension function of CoroutineScope
-> Use to create a new coroutine without blocking the main thread
-> It is fire and forgets the concept
-> We don't get results to return using the launch


24. What is async in Kotlin?
-> Async is the Extension function of CoroutineScope
-> Use to create a new coroutine without blocking the main thread
-> It is used when we want results back from a coroutine
-> It returns the Deferred type of object, use await to extract data from it


25. What is withContext in Kotlin?
-> It is a suspend function used to switch the context of the coroutine from one dispatcher to other
-> It can called from either coroutine scope or other suspend function
-> IT uses a dispatcher to switch the context

==KOTLIN COLLECTIONS

26. What is the difference between List and MutableList in Kotlin?
-> Both contain homo and heterogeneous element because both accept vararg
-> list is immutable hence we cannot add, remove or update elements from it, It is read-only.
-> mutableLits if mutable hence we can perform CRUD operation on it


27. How do you create an immutable list in Kotlin?
-> listOf()


28. How do you create a mutable list in Kotlin?
-> mutableListOf()


29. What is the difference between map and flatMap in Kotlin?
-> Map transforms each element into another object
-> Flatmap convert elements into a single result 

fun main() {
    val l1 = listOf(1,2,3)
    val l2 = listOf("abc","def","ghi")
    val res1 = l1.flatMap { l2 } //["abc","def","ghi", "abc","def","ghi", "abc","def","ghi"]
    val res2 = l2.flatMap { l1 } //[1,2,3,1,2,3,1,2,3]
}


30. What is the purpose of the filter in Kotlin?
-> Filter is used to extract elements from the list based on a given condition


==ANDROID SPECIFIC QUESTION
31. Why use Kotlin for Android development?
-> Concise, NPE Handler, Interoperable, Rich in Functions


32. What is the difference between lateinit and lazy in Kotlin?
-> lateinit: late initialization, mutable, work only non-null variable,  
-> lazy: delegate property, immutable, work on nullable also


33. What is the purpose of a companion object in Kotlin?
-> Creating Static like fields
-> Makeing class singleton

34. What is the purpose of @Parcelize in Kotlin?
-> @Parcelize is an Android Annotation that makes data class Parcelable by generating boilerplate code


35. What is the purpose of @JvmStatic in Kotlin?
-> Direct Access of method in kotlin who annotate with @JvmStatic from JavaCode 

==ADVANCE CONCEPT
36. What is Kotlin DSL?
-> Domain Specific Language
-> When you have to solve Domain Specific problems then you use DSL
-> By Using Kotlin Language Feature (Lambda Expression, Extension Feature, infix etc.) you make your code more readable and more expressive for specific task 
-> Ex. creating config file, Building UI Layouts, define complex workflow


37. What is inline with noinline parameters?
-> inline: works on HOF, reduce function call, copy body at caller place
-> noinline: some param of HOF mark as noinline

38. What is the reified keyword in Kotlin?
-> To retain data info at runtime
-> It uses with inline keyword (inline function)
-> generic param erased info at compile time, to retain we use reified
-> fun <reified T> todo(t:T) {}


39. What are type aliases in Kotlin?
-> Creating an alternative name for the existing data type


40. What are destructuring declarations in Kotlin?
-> Separating data into variable


41. What is a range in Kotlin?
-> sequence of values from start to end and it is define by .. operator

42. What is the difference between == and === in Kotlin?
==: Structural Equality, ===: Refrancial Equality

43. What is when in Kotlin?
-> condition statement in kotlin similar to switch in java

44. Explain by keyword in Kotlin.
-> It is used for delegation or delegate the property
-> Implementation of the interface to another object using by
-> Transfer ownership to another object


43. How do you declare a singleton in Kotlin?
-> 3 Ways to Declared Singleton
-> 1)Traditional Way (Privatizing constructor) 2)object class 3) companion object
 

44. What is the use of apply in Kotlin?
-> Object config, Object modification, return object


45. How do you handle exceptions in Kotlin?
-> try-catch-finally

46. What is an infix function in Kotlin?
-> such function removes dot and parenthesis at caller's place of the object

47. What is the use of is keyword in Kotlin?
-> It uses to check the data type of a variable or object
-> It checks whether a variable or object is an instance of a certain type or not
-> It helps to smart cast object


48. How do you create an array in Kotlin?
-> intArrayOf(), charArrayOf(), floatArray(), arrayOf(), listOf()


49. What is a lazy property in Kotlin?


50. How does Kotlin handle typecasting?
-> Handle by 
-> as for Explicite cast
-> is for Smart cast
-> as? safe cast


51. What is to in Kotlin?
-> It is used to create a pair of 2 values
-> It is used to create map entry


52. How do you handle null pointers in Kotlin?
4 ways, Safe call, Assertion, Elvis, Let


53. What is the backing field in Kotlin?
-> getter setter in kotlin 
-> It is used when want to customise getter and setter in kotlin
 

54. Explain lateinit in Kotlin.

55. What is the difference between mapOf and mutableMapOf?

56. Explain sealed classes and their use cases.

57. What are generic types in Kotlin?

58. How do you iterate over a map in Kotlin?
-> for((k,v) in map) || map.forEach {..}

59. Explain Kotlin Flow.
-> it is stream of data flow, that continuously emit the values asynchronously
-> It has producer and consumer
-> Producer: continuously produce value and add to stram
-> Consumer: It used to consume data from the stream 
-> ColdFlow: It emits value only when it is collected (each collector has its own instance of flow)
-> HotFlow: It continues emitting value even if not collected (multiple collector share same emission)
-> ShareFlow: Allow multiple collectors to share the same emission (don't have initial value)
-> StateFlow: It holds a single updated state (it has an initial value), the collector has the latest value


60. How to create a thread in Kotlin?
-> By Thread class or by coroutine


61. What is typealias in Kotlin?
-> refer 39


62. What are companion objects in Kotlin?

63. How do you create a singleton class in Kotlin?

64. What is deferred in Kotlin coroutines?
 -> It is a Job Object
 -> It promises that it will provide results later in future
 -> Use await() to get result

65. Explain the suspend function with an example.

66. What is the difference between join and await in Kotlin coroutines?
-> join: block thread until the operation is complete | use on thread    | not returns
-> await: suspend coroutine, wait in other thread | use on coroutine | return Deferred


67. How do you handle concurrency in Kotlin?
Coroutine

68. What is a Job in Kotlin coroutines?
-> It is a cancellable task with a lifecycle, 
-> it controls the suspend function

69. Explain the use of the super keyword in Kotlin.

70. What is type projection in Kotlin?

71. What are tail-recursive functions in Kotlin?
-> tailrec | inc stack size

72. What is coroutineScope in Kotlin?

73. How do you convert a Kotlin List to an Array?
-> toTypedArray()

74. Explain the concept of delegation in Kotlin.
-> It allows one object to delegate responsibility to another object
-> it is implemented using the `by` keyword


75. What is const in Kotlin?
-> compile-time constant, used with val


76. What is with function in Kotlin?


77. What is the purpose of runBlocking in Kotlin?
-> use to start coroutine 
-> it blocks main thread until its completion


78. Explain the use of Dispatchers in Kotlin coroutines.


79. How do you declare an abstract class in Kotlin?


80. Explain the difference between let and run in Kotlin.


81. What are visibility modifiers in Kotlin?
-> Public, Private, Protected, Internal


82. What is crossinline in kotlin 
-> Crossinline is a modifier used with lambda parameter in inline function to prevent non-local returns 
-> Suppose you have a return in lambda function which is being passed as a param to the inline function
-> then return statement will return from local to parent function
-> but we wrote return just to exit lambda function, In such case, we use crossinline in inline function args
-> IMP: crossinline is useful when we need to write a return statement in lambda else no need for lambda


83. What is noinline
-> When lambda function calls from inline function kotlin auto makes that inline 
-> If we don't want then we can specify lambda args as noinline


84. What is an inline class in kotlin 
-> inline class in kotlin is a special type of class used to wrap data
-> This class is also called a value class
-> The main purpose of this class is to use less memory and improve the performance
-> Inline class has only a single param in the primary constructor
 
-> It is a special type of class that wraps a single value in class 
-> It has only a single value in its constructor
-> At compile time, a single value gets inline hence at run-time object is not created.


85. What is the difference between open and final in Kotlin?
-> Every class is final by default
-> Open keyword allows us to extend the class to its subclass


86. What is the difference between Any and Unit in Kotlin?
-> Any is the root class of the kotlin hierarchy similar to the Java Object class
-> Unit is function default return type if not specified same as void in Java


87. What is a primary constructor in Kotlin?
-> Primary constructors are used to initialized Object
-> It declares at the class header with an optional constructor keyword
-> Class properties are auto-initialized at the time of object creation
-> It also acts as getter and setter


88. Explain the use of it in Kotlin.
-> It is a single parameter optional name of the lambda expression


89. What is covariance and contravariance in Kotlin?
Answer:
Covariance: When a generic type can accept a subclass.
Contravariance: When a generic type can accept a superclass.
Answer: Covariance (out) allows a type to be more specific (subtypes), while contravariance (in) will enable it to be more general (supertypes).

interface Producer<out T> {
    fun produce(): T
}

interface Consumer<in T> {
    fun consume(item: T)
}
