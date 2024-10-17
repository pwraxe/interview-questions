1. What is Kotlin?

2. How does Kotlin handle null safety?

3. What are data classes in Kotlin?

4. What are the key differences between val and var in Kotlin?

5. What are extension functions in Kotlin?

6. Explain the concept of smart casts in Kotlin.
-> Kotlin automatically cast an object to its type by checking with `is` keyword
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

17. What is the apply functio	n in Kotlin?

18. Explain the use of companion objects in Kotlin.

19. What is the purpose of the lateinit keyword in Kotlin?

20. What is a typealias in Kotlin?

21. How does Kotlin ensure interoperability with Java?
-> Build top of Java, Compiled to Java, Calling kotlin from java and vice-versa

22. How do you handle checked exceptions from Java in Kotlin?
-> Kotlin dont have checked exception, 

23. How are SAM (Single Abstract Method) interfaces handled in Kotlin?
-> It Converts Single interface method into lambda expression when anonymously overriden

24. What is the @JvmStatic annotation in Kotlin?
-> JVMStatic Method in companion object direct call from class name from java
-> Non JVMStatic method in companion object can call through companion object name
-> JavaClass.jvmMethod_In_Kotlin_CompanionObj(),
-> JavaClass.CompanionObjName.nonJvmMethod_In_Kotlin_CompanionObj()


25. How does Kotlin treat null coming from Java code?
-> Platform Type: Kotlin dont know variable in java is null or not, it allow us to use that variable without strictly checking nullable type
-> Nullability: If java return nullable type then Kotlin auto cast variable to nullable, if not then non-null variable 


26. How does Kotlin handle memory management?
-> Kotlin has non-nullable and immutablility feature can helps us to prevent memory leaks
-> Kotlin handles the memory management Primary through JVM GC,
-> Auto Garbage Collection: Kotlin runs on JVM and uses GC for auto memory allocation and deallocation, reduces chances of memory leak.
-> Object Allowcation: Object allowcate in heap, JVM manage this memory to auto allocate and deallocate object, 
-> Generational Garbage Collection: This seperate object by there age, young obj collected freq then old obj
-> Referance Type: Kotlin Provides diff. Ref. type, Strong Ref, Weak Ref, Soft Ref. this ref. allowed devlopers to control life of objects
-> Null Safty: Kotlin prevent from NPE, which can lead to resource leak.
-> Native Memory Management: For Kotlin, memory handles differently using combination of ARC (Auto Ref. Counting) and Manual Memory Management


27. What is the difference between lazy and lateinit in Kotlin?
-> Lazy is delegate property to initialized variable at run time after first time access.
-> Lazy run on LazyThreadSafeMode.NONE by default


28. What is inline reified type in Kotlin?
-> When we pass info to generic function to access at run time but at compile time info is erased, 
-> To retain that info we use reified keyword in function

29. How do Kotlin coroutines manage threads?
-> Coroutine manage thread without blocking main or other thread
-> They can switch between threads by Dispatchers (Main, IO, Default, Unconfied)

30. How do you perform multithreading in Kotlin?


31. Explain Dispatchers.IO and Dispatchers.Main in Kotlin.


32. What are channels in Kotlin coroutines?
-> Channel is same as BlockingQueue, BlockingQueue put element and take it, Channel is send and received it 
-> Channel is two types 1) Unbuffered  2) Buffered
-> UnBuffered Channel: 
-> It is part of producer and consumer pattern
-> Channel is way of comminication berween different coroutine
-> Buffer Channel allows to send certain no of message before suspend sender

33. What is a suspend function and how does it differ from a regular function?

34. What are ranges in Kotlin?


 

What is heap memory?

 
