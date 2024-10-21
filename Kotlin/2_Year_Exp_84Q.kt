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
-> Instance of that class which contains actual data and behavious of that class

7. What are the types of constructors in Kotlin?
-> Primary and Secondary

8. Explain the data class in Kotlin.

9. What is the sealed class in Kotlin?
-> Restrict Inheritance Heirarchy, Compiler knows all heirarchi at compile time, sealed keyword, Should be in same file

10. What is the object keyword used for in Kotlin?
-> Object is Special keyword in kotlin 
-> It acts like a static in java
-> We can directly access properties and methods directly object name
-> It is singleton by default
-> It use to create singleton object, declare anonymous class and object expression
 
==FUNCTIONAL

11. What is a higher-order function in Kotlin?
-> A function which accept and return lambda function

12. What is an extension function in Kotlin?

13. What is the lambda expression in Kotlin?
-> lambda function which can pass as arg or assign to variable

14. What is the let function in Kotlin?
-> let is scope function
-> Ideally it run on nullable variable if it is not null
-> It cast null variable to not null for data
-> it provides it as current scope context

15. What are inline functions in Kotlin?
-> copy body of inline function at caller place
-> it reduce calling same function again and again
-> It improves performance and reduce memory occupation

==NULL SAFTY
16. How does Kotlin handle null values?
-> Kotlin does not support nullability by default
-> We have to make variables nullable explicitly
-> If we have nullable variable then kotlin provides 4 diff ways to handle null values
-> 1) Safe Call 2) Elvis Operator 3) Assertion 4) Let Block

17. What is the !! operator in Kotlin?
-> !! is Assertion operator (Risky Operator)

18. What is the Elvis operator (?:) in Kotlin?
-> It is short syntax to handle null variable
-> if nullable variable is not null then it return as it is else return default value
-> It is more clean and concise way to handle nullable variable 

19. How can you handle null values using safe calls in Kotlin?
-> ?.

20. What is the purpose of let in null safety?
-> Let is scope function which gives us `it` as current scope context.
-> It execute block of code only if nullable variable is not null
-> it cast nullable to non-nullable to safly work on object
-> It allows us to create weak refrance of an object


21. What are coroutines in Kotlin?
-> Concurrancy Design Pattern, 
-> Writes Asynchronous code, w/o blocking main thread
-> Lauch Async,
-> suspend function


22. What is suspend in Kotlin?
-> can control (Start,Pause, Resume, Stop)
-> execute independently
-> call from scope or other suspend function


23. What is launch in Kotlin?
-> Launch is Extension function of CoroutineScope
-> Use to create new corutine without blocking main thread
-> it is fire and forget concept
-> We dont get result return back using launch


24. What is async in Kotlin?
-> Async is Extension function of CoroutineScope
-> Use to create new corutine without blocking main thread
-> It use when we want result back from coroutine
-> It returns Defered type of object, use await to extract data from it


25. What is withContext in Kotlin?
-> It is a suspend function which use to switch context of coroutine from one dispatcher to other
-> It can called from either coroutine scope or other suspend function
-> IT uses dispacher to switch the context

==KOTLIN COLLECTIONS

26. What is the difference between List and MutableList in Kotlin?
-> Both contains homo and heterogenious element becoz both accept vararg
-> list is immutable hence we cannot add, remove or update element from it, It is read only.
-> mutableLits if mutable hence we can perform CRUD operation on it


27. How do you create an immutable list in Kotlin?
-> listOf()


28. How do you create a mutable list in Kotlin?
-> mutableListOf()


29. What is the difference between map and flatMap in Kotlin?
-> Map transform each element into another object
-> Flatmap convert elements into a single result 

fun main() {
    val l1 = listOf(1,2,3)
    val l2 = listOf("abc","def","ghi")
    val res1 = l1.flatMap { l2 } //["abc","def","ghi", "abc","def","ghi", "abc","def","ghi"]
    val res2 = l2.flatMap { l1 } //[1,2,3,1,2,3,1,2,3]
}


30. What is the purpose of filter in Kotlin?
-> Filter is use to extract elements from list based on given condition


==ANDROID SPECIFIC QUESTION
31. Why use Kotlin for Android development?
-> Concise, NPE Handler, Interoperable, Rich in Functions


32. What is the difference between lateinit and lazy in Kotlin?
-> lateinit: late initializatin, mutable, work only non-null variable,  
-> lazy: delegate property, immutable, work on nullable also


33. What is the purpose of companion object in Kotlin?
-> Creating Static like fields
-> Makeing class singleton

34. What is the purpose of @Parcelize in Kotlin?
-> @Parcelize is Android Annotation which makes data class Parcelable by generating boilerplate code


35. What is the purpose of @JvmStatic in Kotlin?
-> Direct Access of method in kotlin who annotate with @JvmStatic from JavaCode 

==ADVANCE CONCEPT
36. What is Kotlin DSL?
-> Domain Specific Language
-> Learn More

37. What is inline with noinline parameters?
-> inline: works on HOF, reduce function call, copy body at caller place
-> noinline: some param of HOF mark as noinline

38. What is the reified keyword in Kotlin?
-> To retain data info at runtime
-> It uses with inline keywork (inline function)
-> generic param erased info at compile time, to retain we use reified
-> fun <reified T> todo(t:T) {}


39. What are type aliases in Kotlin?
-> creating alternative name for existing data type


40. What are destructuring declarations in Kotlin?
-> Seperating data into variable


41. What is a range in Kotlin?
-> sequence of values from start to end and its define by .. operator

42. What is the difference between == and === in Kotlin?
==: Structural Equality, ===: Refrancial Equality

43. What is when in Kotlin?
-> condition statement in kotlin similar to switch in java

44. Explain by keyword in Kotlin.
-> It use to deligation or delate the property
-> Implementation of interface to another object using by
-> Transfer ownership to anather object


43. How do you declare a singleton in Kotlin?
-> 3 Ways to Declared singleton
-> 1)Traditinal Way (Privatizing constructor) 2)object class 3) companion object
 

44. What is the use of apply in Kotlin?
-> Object config, Object modification, return object


45. How do you handle exceptions in Kotlin?
-> try-catch-finally

46. What is an infix function in Kotlin?
-> such function removes dot and parenthesis at caller place of object

47. What is the use of is keyword in Kotlin?
-> It use to check data-type of variable or object
-> It checks whether variable or object is instance of certain type or not
-> It helps to smartcast object


48. How do you create an array in Kotlin?
-> intArrayOf(), charArrayOf(), floatArray(), arrayOf(), listOf()


49. What is a lazy property in Kotlin?


50. How does Kotlin handle type casting?
-> Handle by 
-> as for Explicite cast
-> is for Smart cast
-> as? safe cast


51. What is to in Kotlin?
-> It is use to create pair of 2 values
-> It is use to create map entry


52. How do you handle null pointers in Kotlin?
4 ways, Safe call, Assertion, Elvis, Let


53. What is backing field in Kotlin?
-> getter setter in kotlin 
-> It use when want to customized getter and setter in kotlin
 

54. Explain lateinit in Kotlin.

55. What is the difference between mapOf and mutableMapOf?

56. Explain sealed classes and their use cases.

57. What are generic types in Kotlin?

58. How do you iterate over a map in Kotlin?
-> for((k,v) in map) || map.forEach {..}

59. Explain Kotlin Flow.
-> it is stram of data flow, that continuasly emot the values asynchronously
-> It has producer and consumer
-> Producer: continusly produce value and add to stram
-> Consumer: It use to consume data from stream 
-> ColdFlow: It emit value only when it collected (each collector has own instance of flow)
-> HotFlow: It continue emitting value even not collect (multiple collector share same emittion)
-> ShareFlow: Allow multiple collector to share same emission (dont have initial value)
-> StateFlow: It holds single updated state (it has initial value), collector has latest value


60. How to create a thread in Kotlin?
-> By Thread class or by coroutine


61. What is typealias in Kotlin?
-> refer 39


62. What are companion objects in Kotlin?

63. How do you create a singleton class in Kotlin?

64. What is deferred in Kotlin coroutines?

65. Explain suspend function with an example.

66. What is the difference between join and await in Kotlin coroutines?
-> join: block thread until operation is complete | use on thread    | not returns
-> await: suspend coroutine, wait in other thread | use on coroutine | return Deferred


67. How do you handle concurrency in Kotlin?
Coroutine

68. What is a Job in Kotlin coroutines?
-> it is cacellable task with lifecycle, 
-> it control suspend function

69. Explain the use of super keyword in Kotlin.

70. What is type projection in Kotlin?

71. What are tail-recursive functions in Kotlin?
-> tailrec | inc stack size

72. What is coroutineScope in Kotlin?

73. How do you convert a Kotlin List to an Array?
-> toTypedArray()

74. Explain the concept of delegation in Kotlin.
-> It allows one object deligate responsibility to anather objec
-> it implemented using `by` keyword


75. What is const in Kotlin?
-> compile time constant, used with val


76. What is with function in Kotlin?


77. What is the purpose of runBlocking in Kotlin?
-> use to start coroutine 
-> it block main thread until its completion


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
-> This class also called a value class
-> The main purpose of this class is to use less memory and improve the performance
-> Inline class have only a single param in the primary constructor
