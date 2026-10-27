**1. What is a `Coroutine` in simple terms?**
- It is a lightweight thread that runs asynchronously on another thread without blocking the main thread
- Instead of blocking the whole thread while waiting for network or database tasks, it suspends (pauses) itself
- Once the work finishes, it wakes back up and continues where it left off.

----
**2. What does the `suspend` keyword actually do?**
- It tells the compiler, This function can take time, so pause it without blocking the main thread
- Under the hood, the compiler rewrites the function into a small `state machine` that tracks the progress using a hidden `continuation` callback
- Suspend functions can only be called from inside another suspend function or from inside a coroutine scope.

----

**3. What is the difference between `launch` and `async`?**
- `launch` is `fire and forget`. It starts a background task and returns a `Job` object. It does not return any data result.
- `async` is for when you need a result back. It returns a `Deferred<T>` object.
- You retrieve the final result of `async` by calling `.await()`.

----

**4. What is the difference between `Dispatchers.Main`, `IO`, and `Default`?**
- `Dispatchers.Main:` Runs on Android's UI thread. Use it strictly for `lightweight tasks` like updating views, showing dialogs, or changing text.
- `Dispatchers.IO:` Designed for waiting tasks like REST APIs, Room database queries, or reading local files. It can spin up many threads if needed.
- `Dispatchers.Default:` Designed for heavy CPU number-crunching like sorting huge lists, parsing large JSON files, or image editing.

----

**5. What is Structured Concurrency?**
- It means child coroutines are strictly bound to their parent scope's lifetime.
- If a parent coroutine is cancelled, all child background tasks stop automatically.
- It prevents memory leaks and background tasks from running forever after a screen closes.

----

**6. What is the difference between Job and SupervisorJob?**
- `Job:` If one child coroutine crashes, it cancels the parent, which immediately cancels all other siblings.
- `SupervisorJob:` If one child fails, its siblings keep running without interruption.
- This is why Android `viewModelScope` uses a `SupervisorJob`—so one failing network call won't kill your entire screen.

----

**7. What is `coroutineScope` vs `supervisorScope`?**
- `coroutineScope:` A suspending function that wraps multiple children. If one child throws an error, the whole scope fails immediately.
- `supervisorScope:` Also wraps children, but an error in child A does not cancel child B.
- Both wait for all their inner children to finish before completing.

----

**8. How does coroutine cancellation work?**
- `Cancellation` is cooperative, meaning a coroutine must check if it has been asked to stop.
- Standard functions like `delay()` and `yield()` check for cancellation automatically.
- If you run a heavy for loop, you must manually check `isActive` or call `ensureActive()`; otherwise, the loop won't stop.
- When a `job` is `cancelled`, its state changes to `"Cancelling"`, and standard suspending functions (like `delay` or `withContext`) will automatically throw a `CancellationException` to clean up resources.

----

**9. What does `withContext` do?**
- It switches the current coroutine to another dispatcher (e.g., from `Main` to `IO`), waits for the block to finish, and returns the result.
- It does not create a brand-new coroutine; it simply moves execution to another thread pool.
- It guarantees execution order remains linear, so you don't need messy nested callbacks.

----

**10. What does `NonCancellable` do?**
- Normally, when a coroutine is cancelled, you cannot call any suspend functions inside its finally cleanup block.
- Wrapping your cleanup code in `withContext(NonCancellable) { ... }` allows suspend functions to run even during cancellation.
- Use it strictly for critical cleanup tasks like closing sockets or deleting temporary files.

----

**11. What is a `CoroutineContext`?**
- It is an immutable, indexed set of element instances that define the behavior, execution thread, lifecycle, and error-handling rules of a coroutine.
- It is a collection of elements that control how and where a coroutine runs.
- It contains 4 main things: `Job` (lifecycle), `Dispatcher` (thread pool), `CoroutineName` (debugging name), and `CoroutineExceptionHandler` (error handling).
- You combine elements easily using the plus operator `(+)`, like `Dispatchers.IO + Job()`.
- You can think of it as a map-like collection where each element has a unique key.
- `val context = Dispatchers.IO + CoroutineName("MyWorker")`

----

12. How does `CoroutineExceptionHandler` work?
- It acts like a global `try-catch` for uncaught exceptions in root coroutines.
- It only works when attached to a coroutine started with `launch` — never with `async`.
- For `async`, exceptions are stored inside the `Deferred` and thrown only when you call `.await()`.
- A `CoroutineExceptionHandler` acts as a global catch block for a coroutine hierarchy, but it only catches uncaught exceptions that are propagated up to a root job.
```
// 1. Define the handler at the root level
val errorHandler = CoroutineExceptionHandler { _, exception -> 
    println("Caught global exception: ${exception.message}") 
}

// 2. Attach to scope or root launch; won't catch if attached inside a child launch
val scope = CoroutineScope(Job() + Dispatchers.Main + errorHandler)
scope.launch { // Root coroutine
    throw RuntimeException("Network Failed") // Caught by errorHandler
}
```

----

**13. What is the difference between delay() and Thread.sleep()?**
- `delay()` suspends the coroutine, freeing up the underlying thread so other tasks can run on it.
- `Thread.sleep()` locks the entire OS thread completely; if called on the Main thread, the app will freeze and trigger an ANR.
- Hence Always use `delay()` inside coroutines.

----

**14. What is yield() in coroutines?**
- It pauses the current coroutine momentarily (for a while) to give other coroutines on the same thread a chance to run.
- It also checks if the coroutine was cancelled, making it an easy way to keep CPU-heavy tasks responsive.
- `yield()` is a cancellable suspending function in Kotlin Coroutines that pauses the current coroutine and temporarily releases the execution thread, allowing other waiting coroutines on the same dispatcher or thread pool to run

----
 
**15. What is the difference between GlobalScope and lifecycleScope / viewModelScope?**
- `GlobalScope`: Lives for the entire app process. It never dies on its own, easily causing massive memory leaks.
- `viewModelScope`: Automatically cancels all background jobs when the ViewModel is cleared.
- `lifecycleScope`: Bound to Activity/Fragment lifecycles and cancels when the UI component is destroyed.

----

**16. What is a Kotlin `Flow`?**
- A Flow is a `cold stream` that can emit multiple values sequentially over time.
- It is built directly on top of coroutines, giving you native backpressure and cancellation for free.
- It acts like a modern, lightweight, Kotlin-friendly replacement for `RxJava`.
- A Kotlin Flow is like a water pipe that delivers a steady stream of data over time.
- Instead of giving you a whole list of data at once, it calculates and sends one item at a time asynchronously,
- only producing data when someone is at the other end ready to catch it.

----
**17. What is the difference between a `Cold Stream` and a `Hot Stream`?**
- `Cold Stream (Flow):` Does nothing until a collector starts listening. (Only produced when a collector is receiving)
- `Hot Stream (StateFlow / SharedFlow):` Produces data even if nobody is listening (Collectors only receive data emitted while they are tuned in.)
- Flows created via `flow { ... }` are Cold; `StateFlow` and `SharedFlow` are Hot.

----

**18. What is `StateFlow` and when do you use it?**
- A hot stream that always holds a single, latest value in memory.
- It requires an initial value and will not emit duplicate consecutive values (it has built-in `distinctUntilChanged`).
- It is the standard replacement for `LiveData` in modern `Android architecture.`

----

**19. What is `SharedFlow` and when do you use it?**
- A hot stream meant for sending events or messages to multiple observers (like navigation, Toast alerts, or SnackBar events).
- It does not require an initial value.

----

**20. How do you convert a `cold Flow` to a `hot Flow`?**
- Use the `stateIn()` operator to turn it into a `StateFlow`.
- Use the `shareIn()` operator to turn it into a `SharedFlow`.
- Both operators require a `scope`, a starting policy (like `SharingStarted.WhileSubscribed(5000)`), and an initial value for state.

----

**21. What does `SharingStarted.WhileSubscribed(5000)` mean?**
- It keeps the upstream flow active as long as there is at least one active subscriber.
- When the app goes to the background and subscribers drop to zero, it waits 5 seconds before stopping upstream work.
- This 5-second buffer prevents unnecessary restarts during rapid screen rotations.

----

**22. What is the difference between `collect` and `collectLatest`?**
- `collect`: Processes every single emitted value one after another without skipping.
- `collectLatest`: If a new value arrives while the previous value is still being processed, it cancels the previous work and starts processing the new one immediately.
- Use `collectLatest` for search bars where you only care about the most recent query result.

----

**23. What does `flowOn()` do?**
- It changes the dispatcher for the upstream operations (everything written above `flowOn`).
- It does not affect the downstream collector (the code inside `collect`).
- It allows you to run expensive data fetching on `Dispatchers.IO` while collecting safely on `Dispatchers.Main`.

----

**24. What is the Flow `Context Preservation` rule?**
- The Context Preservation rule states that a Kotlin Flow always collects and emits its items within the exact same CoroutineContext (like a specific thread) that started it.
- The producer side (inside flow { ... }) is strictly forbidden from changing the thread internally using withContext();
- if you want to switch threads for the producer, you must use the .flowOn() operator instead.

```
// ❌ WRONG WAY: Violates Context Preservation (Will throw an IllegalStateException)
fun badFlow() = flow {
    withContext(Dispatchers.IO) { // DO NOT DO THIS inside flow blocks
        emit("Data") 
    }
}

//  RIGHT WAY: Uses .flowOn() to safely change the upstream producer thread
fun goodFlow() = flow {
    emit("Data") // Emits on Dispatchers.IO thanks to flowOn
}.flowOn(Dispatchers.IO) 

// Consumption: The data is collected on whatever thread the scope is running on (e.g., Main)
viewModelScope.launch(Dispatchers.Main) {
    goodFlow().collect { value -> println("Received $value on Main thread") }
}
```
----

**25. What is `callbackFlow` and why is it useful?**
- A flow builder designed to convert legacy listener/callback APIs (like Firebase, LocationManager, or sensor listeners) into a Flow.
- It keeps the channel open until you explicitly close it.
- You must call `awaitClose { ... }` at the end to clean up and unregister your listener when the flow is cancelled.
- A callbackFlow is a bridge that converts old, callback-based APIs (like listener interfaces) into modern, reactive Kotlin Flows.
- It is incredibly useful for wrapping asynchronous Android legacy systems—such as Firebase listeners, Location updates, or sensor API callbacks—into a stream that can be cleanly collected, paused, and canceled automatically using coroutines.
```
// Converting a traditional listener API into a reactive Flow stream
fun trackLocationUpdates(locationManager: LocationManager): Flow<Location> = callbackFlow {
    val listener = object : LocationListener {
        override fun onLocationChanged(loc: Location) {
            trySend(loc) // Sends location updates into the Flow stream safely
        }
    }
    locationManager.requestLocationUpdates(listener)

    // CRITICAL: Clean up and unregister the listener when the flow collection stops
    awaitClose { locationManager.removeUpdates(listener) }
}
```

----

**26. What is the difference between `flatMapConcat`, `flatMapMerge`, and `flatMapLatest`?**
- `flatMapConcat`: Waits for the inner flow to completely finish before starting the next one.
- `flatMapMerge`: Runs multiple inner flows concurrently at the same time.
- `flatMapLatest`: Cancels the previous inner flow whenever a new outer item arrives.

----

**27. What does the `combine` operator do?**
- Takes two or more flows and emits a new result whenever any of them emits an update.
- It always pairs the latest emitted values from all input flows.
- Perfect for screens that depend on multiple data sources (e.g., combining `userProfileFlow` and `cartItemsFlow`).

----


**28. What does the `zip` operator do?**
- Pairs values from two flows one-to-one in order (1st with 1st, 2nd with 2nd).
- If flow A emits faster than flow B, flow A waits until flow B catches up.
- Emits only as many items as the shorter of the two flows.

----

**29. What is `Backpressure` in Kotlin Flow?**
- A situation where the producer emits data much faster than the consumer can process it.
- In Flow, backpressure is handled automatically by suspending the producer until the consumer is ready.
- You can customize this behavior using operators like `.buffer()`, `.conflate()` (drops intermediate values), or `.collectLatest()`.

----

**30. What is a `Channel` in Kotlin?**
- Think of it as a pipe to send data between different coroutines (one coroutine sends, another receives).
- While Flow streams data to observers, a Channel delivers each piece of data to one receiver only.
- Channels are hot and useful for task queues or one-off event pipelines.

----

**31. What is an `inline` function?**
- It tells the compiler to copy the function's actual code directly into the place where it is called, instead of making a standard method jump.
- It eliminates the memory overhead of allocating anonymous class objects for lambdas passed into the function.
- Use it primarily on functions that accept lambda parameters.

----

**32. What is `noinline`?**
- Used when an `inline` function accepts multiple lambdas, but you want to exclude one of them from being inlined.
- The non-inlined lambda can then be stored in a variable or passed around to other functions.
- Syntax: `inline fun doWork(block1: () -> Unit, noinline block2: () -> Unit)`.

----

**33. What is `crossinline`?**
- Used on a lambda parameter inside an `inline` function when that lambda will be executed inside another context (like an inner object or runnable).
- It prevents the caller from writing a "`non-local return`" (`return`) that would mistakenly exit the outer calling function.
- It protects your code from accidental premature exits.

----

**34. What is a "`Non-Local Return`"?**
- In Kotlin, writing `return` inside an inlined lambda exits the entire enclosing function, not just the lambda itself.
- This is only possible because the lambda code is inlined directly into the parent function.
- In standard `non-inlined` lambdas, non-local returns are banned (you must use qualified returns like `return@forEach`).

----

**35. What is the memory cost of a normal Lambda in Kotlin?**
- For non-inlined functions, every lambda creates a new Java object instance (an implementation of `Function0`, `Function1`, etc.) behind the scenes.
- If called inside a loop, it generates high garbage collection (GC) pressure by constantly creating short-lived objects.
- Marking higher-order utility functions with `inline` avoids this memory overhead entirely.

----

**36. What does `@JvmField` do?**
- By default, Kotlin creates private fields with public getters and setters in bytecode.
- `@JvmField` tells the compiler to generate a plain, public Java field without any getters or setters.
- It improves Java-Kotlin interop performance and is often required by libraries like Parcelable or JUnit rules.

----

**37. What does `@JvmStatic` do?**
- Applied to functions or properties inside a `companion object` or `object`.
- It forces the compiler to generate a true `static` method/field in the compiled Java class.
- Without it, Java code has to call `MyClass.Companion.myMethod()` instead of `MyClass.myMethod()`.

----

**38. What does `@JvmSynthetic` do?**
- Marks a method or field so it remains invisible to Java code, while remaining fully visible to Kotlin.
- It is useful for library authors to create clean Kotlin-only APIs without cluttering autocomplete for Java consumers.
- Compilers also use it to hide synthetic helper methods.

----

**39. What is `Primitive Boxing` and how does Kotlin handle it?**
- Kotlin doesn't have primitive keywords like `int` or `boolean`; you write `Int` and `Boolean`.
- If a variable is non-nullable (`Int`), the compiler uses the fast primitive `int` in bytecode.
- If it is nullable (`Int?`) or used in generics (`List<Int>`), it is boxed into an `Integer` object, adding small memory overhead.

----

**40. What is a `tailrec` function?**
- A modifier for recursive functions that prevents `StackOverflowError`.
- If the recursive call is the very last operation in the function, the compiler rewrites the recursion into a standard fast `while` loop in bytecode.
- It gives you clean recursive code with the performance of a loop.
 
----

**41. How do you choose between the 5 Scope Functions (`let`, `run`, `apply`, `also`, `with`)?**
- `apply`: Context is this; returns the object. Best for object configuration (e.g., configuring `Intent` or `TextView`).
- `also`: Context is it, returns the object. Best for side-effects like logging or printing without altering the object.
- `let`: Context is it; returns the lambda result. Best for null-checks (`?.let`) or transforming a value.
- `run`: Context is this; returns the lambda result. Best for computing a result on an object or grouping code.
- `with`: Context is this, returns lambda result. Non-extension function used to run multiple operations on a non-null object without repeating its name.

----

**42. What is the difference between `Iterable` (List) and `Sequence`?**
- `Iterable` (Eager): Every operator (like `map` or `filter`) creates a brand-new intermediate collection in memory right away.
- `Sequence` (Lazy): Processes items one-by-one through the entire pipeline only when a terminal operator (like `toList()`) is called.
- For small lists, standard collections are faster; for huge lists (thousands of items) with multiple transforms, `Sequence` saves significant memory.

----

**43. What is Operator Overloading?**
- Kotlin lets you give custom behavior to standard mathematical or logical operators (+, -, *, ==) for your own classes.
- You do this by marking a function with the `operator` keyword using specific reserved names (e.g., `operator fun plus(...)`).
- Example: defining `operator fun plus` on a `Money class` so you can write `val total = moneyA + moneyB`.

----

**44. What are `Infix` Functions?**
- Functions marked with `infix` that can be called without using dots and parentheses.
- They must be member functions or extension functions and must take exactly one parameter.
- Common examples: `"key" to "value"` (used in creating Maps) or `5 downTo 1`.

----

**45. What is a Platform Type (`T!`)?**
- A type that comes from Java code where nullability annotations (`@Nullable` or `@NonNull`) are missing.
- The Kotlin compiler displays it with a single exclamation mark (e.g., `String!`).
- Kotlin cannot check its nullability at compile time, so treating it as non-null can cause a `NullPointerException` at runtime if Java returns `null`.

----

**46. What is the Elvis Operator (`?:`) and how does it evaluate?**
- It returns the expression on its left if it is not null; otherwise, it executes and returns the right side.
- The right side is evaluated lazily (only if the left side is actually null).
- You can safely use `return` or `throw` on the right side: `val name = user.name ?: return`.


----

**47. What is `Smart Casting` and when does it fail?**
- If you check a type with `if (x is String)`, Kotlin automatically casts `x` to `String` inside the `if` block without manual casting.
- It fails if the variable is a mutable public property (`var`), because another thread or getter could change the value between the check and the usage.
- To fix this failure, copy the mutable property into a local `val` before running the is check.

----

**48. What is the difference between `==` and `===`?**
- `==` (Structural equality): Checks if the contents/values are equal by calling .equals().
- `===` (Referential equality): Checks if both references point to the exact same object location in memory.
- For primitives, `===` checks if the raw values are identical.

----

**49. What does the `typealias` keyword do, and does it affect runtime?**
- It gives an alternative, readable name to an existing complex type (e.g., `typealias ClickListener = (View, Int) -> Unit`).
- It does not create a new type; it simply acts as an alias.
- There is zero runtime performance overhead because the compiler swaps it back to the original type during compilation.

----


**50. What is the difference between Kotlin's `const val` and Java's `static final`?**
- Both compile to static final fields, but `const val` in Kotlin is strictly inlined at the call site at compile time.
- `const val` can only be applied to primitives and Strings, and must reside at the top level or inside an `object`.
- Normal `val` fields can hold complex objects and are evaluated at runtime, whereas `const val` is burned directly into bytecode.




