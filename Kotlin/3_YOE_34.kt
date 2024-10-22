1. What is Kotlin?

2. How does Kotlin handle null safety?

3. What are data classes in Kotlin?

4. What are the key differences between val and var in Kotlin?

5. What are extension functions in Kotlin?

6. Explain the concept of smart casts in Kotlin.
-> Kotlin automatically casts an object to its type by checking with `is` keyword
-> if(object is String) { /*auto casted*/ }

7. What is a sealed class in Kotlin?

8. Explain higher-order functions in Kotlin.

9. What are lambdas in Kotlin?

10. What is the difference between == and === in Kotlin?

11. How does Kotlin handle default arguments?

12. What is destructuring in Kotlin?

13. Explain inline functions in Kotlin.

14. What are coroutines in Kotlin?

15. How do you handle exceptions in Kotlin?

16. What is the with function in Kotlin?

17. What is the apply function in Kotlin?

18. Explain the use of companion objects in Kotlin.

19. What is the purpose of the lateinit keyword in Kotlin?

20. What is a typealias in Kotlin?

21. How does Kotlin ensure interoperability with Java?
-> Build top of Java, Compiled to Java, calling Kotlin from java and vice-versa

22. How do you handle checked exceptions from Java in Kotlin?
-> Kotlin don't have checked exception, 

23. How are SAM (Single Abstract Method) interfaces handled in Kotlin?
-> It Converts a Single interface method into lambda expression when anonymously overridden

24. What is the @JvmStatic annotation in Kotlin?
-> JVMStatic Method in the companion object direct call from class name from java
-> Non-JVMStatic method in companion object can call through companion object name
-> JavaClass.jvmMethod_In_Kotlin_CompanionObj(),
-> JavaClass.CompanionObjName.nonJvmMethod_In_Kotlin_CompanionObj()


25. How does Kotlin treat null coming from Java code?
-> Platform Type: Kotlin doesn't know variable in Java is null or not, it allows us to use that variable without strictly checking the nullable type
-> Nullability: If Java returns a nullable type then Kotlin auto cast variable to nullable, if not then the non-null variable 


26. How does Kotlin handle memory management?
-> Kotlin has non-nullable and immutability features can help us to prevent memory leaks
-> Kotlin handles the memory management Primarily through JVM GC,
-> Auto Garbage Collection: Kotlin runs on JVM and uses GC for auto memory allocation and deallocation, reducing the chances of memory leak.
-> Object Allocation: Object allocated in heap, JVM manage this memory to auto allocate and deallocate an object, 
-> Generational Garbage Collection: This separates objects by their age, younger obj collected freq than old obj
-> Reference Type: Kotlin Provides diff. Ref. type, Strong Ref, Weak Ref, Soft Ref. this ref. allowed developers to control the life of objects
-> Null Safty: Kotlin prevents NPE, which can lead to resource leaks.
-> Native Memory Management: For Kotlin, memory is handled differently using a combination of ARC (Auto Ref. Counting) and Manual Memory Management


27. What is the difference between lazy and lateinit in Kotlin?
-> Lazy has delegated property to initialized variable at run time after first-time access.
-> Lazy run on LazyThreadSafeMode.NONE by default


28. What is the inline reified type in Kotlin?
-> When we pass info to a generic function to access at run time but at compile time info is erased, 
-> To retain that info we use reified keyword in a function

29. How do Kotlin coroutines manage threads?
-> Coroutine manage thread without blocking main or other thread
-> They can switch between threads by Dispatchers (Main, IO, Default, Unconfined)

30. How do you perform multithreading in Kotlin?


31. Explain Dispatchers.IO and Dispatchers.Main in Kotlin.


32. What are channels in Kotlin coroutines?
-> Channel is the same as BlockingQueue, BlockingQueue puts an element and takes it, and Channel is sent and receives it 
-> Channel is two types 1) Unbuffered  and 2) Buffered
-> UnBuffered Channel: 
-> It is part of producer and consumer pattern
-> Channel is way of communication between a different coroutine
-> Buffer Channel allows sending a certain no of messages before suspending the sender

33. What is a suspend function and how does it differ from a regular function?

34. What are the ranges in Kotlin?


 

What is heap memory?

 
