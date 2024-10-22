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
-> Use to declare a mutable variables in kotlin as a class property
-> We assure compiler that the variable will be late initialized before accessing it


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


19. What is the purpose of with in Kotlin?
-> `with` is the kotlin scope function
-> This takes object as a receiver in its param
-> it returns `this` as scope context
-> Properties can access without the dot operator
-> return type of `with` is based on the last line in the scope


20. What are Coroutines in Kotlin?
-> Coroutine is concurrency design pattern
-> It helps developer to write asynchronous code without blocking the main thread
-> We Can start the coroutine in 2 ways first by launch block and other by async block,
-> We can expect data back to the caller from async but not launch
-> async returns Deferred object and gets data using the await method calling
-> Couroutine also has suspend function same as the normal function with suspend keyword
-> Launching coroutine returns Job Object where we can control coroutine 
-> We can start, pause, stop, cancel the coroutine via the job object
-> Coroutine launch on Default dispatcher 


21. What is the difference between List, MutableList, and ArrayList?

22. How can you handle exceptions in Kotlin?


23. Explain the use of when expression in Kotlin.
-> When is the same as a switch case statement in java
-> We can use when as an expression to return the result
-> We can use different types of conditions to when the expression
-> When has else condition instead of default in switch


24. What is a type alias in Kotlin?
-> This provides an alternative name for existing data types or function


25. What is smart casting in Kotlin?
-> Smart cast is a compiler that automatically casts an object 
-> After checking null in the if condition null variable will become a non-null variable


26.  What is a tail-recursive function in Kotlin?
-> To avoid stackoverflow errors in kotlin during the recursive function call
-> tailored keyword is added at the function


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
-> class Account: Premium  (You can create object and save to Premium interface so account will change to premium)


