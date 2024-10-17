1. What is Kotlin?
-> Strinct typed programming language, 
-> developed by Jetbrain 
-> Built on Top of java
-> runs on JVM
-> fully interoperable with java
-> Added Extra feature, like Null Safty, Coroutines, Extenstion Functions, Concise,


2. What are the main features of Kotlin?
-> Null Safty
-> Coroutine for asynchronus programming
-> Extension Function, Lamda Function, Higher Order Function
-> Strictty Typed Programming Language
-> Consice
-> data classes
-> Fully Java interoperable
-> Open Source


3. data class in kotlin
-> data class is primary used to hold the data
-> compiler auto generates member function to print data class instance to readable format
-> data class created using data keyword 
-> this class has equals, toString, hashcode and copy method
-> Data class requiers min 1 param in its constructor


4. Extenstion Function
-> This is kotlin feature
-> This is normal kotlin function but it is define / declare outside the class but also member of the class
-> Such function is extends the functionality of exisiting class
-> Such function / feature does not disturb the existing flow of feature or source code


5. Lamda Expression
-> This is anonymous or Lamda function without name
-> we can pass lambda expression to other function as paramer 
-> Lambda expression can be assigned to variable


6. Explain Kotlin Null Safty
-> Kotlin Does not support null by default,
-> explicitly we have to make value as null
-> Safe Call, Elvis, Assertion are ways to handle null


7. What is the Elvis operator in Kotlin? ==> (?:)


8. Explain the concept of companion object?
-> Companion Object is Directly tied to Class not an instance hence We can directly access method and class fields by class name
-> COmpanion Object are Singleton by dfault
-> Only one COmpanion Object is allowed per class, Not even different name is allowed


9. What is a higher-order function?
-> The function which takes normal function or lambda function as an argument and
-> The function which returns normal function or lambda function as result are called HOF
-> Lambda function are frequent send as argument


10. What is the difference between val and var?


11. What are sealed classes in Kotlin?
-> Sealed class are declared using sealed keywork before class keyword
-> Sealed class is collections of subclasses
-> Sealed class restrict the heirarchi of inheriance 
-> Compiler knows heirarchi of sealed class at compile time
-> Sealed class can extends to other sealed class
-> subclass of child sealed class can extends parent sealed class, subclass of parent sealed class
-> Selaed class are internally abstract


12. How are object and class different in Kotlin?
-> Class is blueprint of instance of that class
-> Object is use for creting single instance of class its is Singleton instance


13. What is the init block in Kotlin?
-> init is block is use to initilaized class properties
-> inti block called before class constructor


14. What is a lateinit property?
-> Lateinit is keyword in kotlin 
-> Use to declare mutable variable in kotlin as class property
-> We assure compiler that variable will be late intialized before accessing it


15. What is a backing field in Kotlin?
-> This is a getter and setter in kotlin, 
-> If we dont write get(), set(field) compiler will auto generate internally
-> WE can constomized get() set(field) in backing field


16. How do you create a singleton in Kotlin?
-> 2 Different ways to create Singleton
-> 1. By object keyword, 2. By companion object in class OR by Traditional Java Way (Like Room database instance)
 

17. What is destructuring in Kotlin?
-> To break object into different variables at once
-> val (a,b) = Pair(10,20)


18. What is an inline function in Kotlin?
-> This is normal function with inline keyword, 
-> inline function improves performace by reducing overhead function calls
-> inline function copy its body at caller place during compile time


19. What is the purpose of with in Kotlin?
-> `with` is kotlin scope function
-> this takes object as receiver in its param
-> it returns `this` as scope context
-> properties can access without dot operator
-> return type of `with` is based on last line in scope


20. What are Coroutines in Kotlin?
-> Coroutine is concurrancy design pattern
-> It helps developer to write asynchronus code without blocking main thread
-> We Can start coroutine in 2 ways first by launch block and other by async block,
-> we can expect data back to caller from async but not lauch
-> async returns Diferred object and get data using await method calling
-> Couroutine also has suspend function same as normal function with suspend keyword
-> Launching coroutine returns Job Object where we can control coroutine 
-> we can start, pause, stop, cancel coroutine via job object
-> Coroutine lauch on Default dispathcher 


21. What is the difference between List, MutableList, and ArrayList?

22. How can you handle exceptions in Kotlin?


23. Explain the use of when expression in Kotlin.
-> When is same as switch case statement in java
-> We can use when as expression to return result
-> We can use different types of condition to when expression
-> When has else condition instead of default in switch


24. What is a typealias in Kotlin?
-> This provides alternative name for existing data type or function


25. What is smart casting in Kotlin?
-> Smart cast is compiler automatically cast object 
-> after checking null in if condition null-variable will becomes non-null variable


26.  What is a tail-recursive function in Kotlin?
-> To avoid stackoverflow error in kotlin during recursive function call
-> tailrec keyword is added at function


27. What are generics in Kotlin?
-> Generics allowed to work with any datatype on method, classes or variable 
-> It check compile time type safty to work with different type of data


28. Explain the is and as operators in Kotlin.
-> `is` is kotlin keyword and use for type checking OR Condition checking
-> `as` is Kotlin keyword and use for explicite type casting


30. How do you make a function that accepts a variable number of arguments in Kotlin?
-> Use vararg in param


31. What are default arguments in Kotlin?


32. lateinit vs lazy


33. What is the difference between == and === in Kotlin?
-> == : data checks
-> ===: Ref Checks (2 obj points same ref)


34. What is the use of filter, map, and reduce in Kotlin collections?
-> filter is use for extracting elements from list based on condition
-> map is use to transform object into other format 
-> reduce is use to combines result in single unit


39. How do you declare an enum in Kotlin?
-> enum class Direction { E,W,S,N }


40. What is the difference between a fun interface and a regular interface?
-> fun interface is SAM (Single Abstract Method)
-> IT helps to write anonymous function to Lambda Expression


