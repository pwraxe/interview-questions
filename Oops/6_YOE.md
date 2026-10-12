**1. What is the fundamental difference between a class and a data class?** 
- A data class automatically generates equals(), hashCode(), toString(), copy(), and componentN() functions for destructuring. A standard class requires you to write these manually. <br>
- A primary constructor is mandatory in a data class, where Primary constructor is not mandatory in a normal class <br>
- A data class holds data, and a normal class holds an object. <br>

----

**2. Why are Kotlin classes `final` by default?**
- Primarily to enforce safe object-oriented design and to enable compiler optimization
- It aligns directly with the `'Effective Java' principle: Design and document for inheritance, or else prohibit it`:
- Unlike Java, in Kotlin developers are required to `open` a class to extend its properties and behaviour.
- When a class is final, the compiler knows its methods cannot be overridden. This permits the JVM to perform key runtime optimizations.
- `Devirtualization`: Eliminating virtual method overhead significantly increases execution speed and reduces memory footprint for performance-critical applications

----

**3. Explain the initialization order of a Kotlin class.**
- Primary constructor parameters.
- Property initializers and `init` blocks in the exact order they appear in the class body.
- Secondary constructors.

----

**4. How does the init block relate to the primary constructor?**
- The `init` block is not a separate constructor; it is literally the body of the primary constructor.
- The primary constructor cannot contain any code. The init block acts as the execution body for the primary constructor
- `Sequential Execution:` The order of execution strictly follows the top-down declaration order in the source file. Properties defined above the `init` block will execute first, and properties below the `init` block will no longer be available to the `init` block
- `Secondary Constructor Delegation:` The init block is guaranteed to execute before the secondary constructor executes.

----

**5. What is the difference between a primary and a secondary constructor?**
- A primary constructor is part of the class header
- A secondary constructor is part of the class body. This must delegate to the primary constructor directly/indirectly using the `this` keyword
-  In the primary constructor, declaring parameters with `val` or `var` automatically promotes them into class properties.
-  Secondary constructors cannot do this; they receive arguments and must manually assign them to properties declared inside the class body.
-  We can often see primary constructors in Android, but secondary seen by creating CustomViews

----

**6. What does @JvmOverloads do?**
- Instead of writing three separate secondary constructors for Java compatibility (e.g., when a Java-based SDK or layout inflator calls your class), a senior developer will use `@JvmOverloads` on a primary constructor with default values, letting the compiler generate the overloaded bytecode automatically.
- When you use default parameters in a Kotlin constructor/function, Java sees only a single signature. @JvmOverloads forces the Kotlin compiler to generate multiple overloaded Java methods for smooth Java-to-Kotlin interop.
```
class CustomButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr) {
    // If not using @JvmOverloads, you would write traditional secondary constructors here
}
```

----

**7. How does the `object` keyword implement the Singleton pattern?**
- Declaring `object MySingleton` creates a `thread-safe singleton` `lazily upon first access`.
- It cannot have constructors because it represents a single instantiated instance, not a blueprint.
- The compiler generates a `public final class` and creates a `private constructor` to prevent external instantiation. It then exposes a `public static final` field named `INSTANCE` that holds the single instance of the class

----

**8. What is a companion object and how does it differ from Java statics?**
- Kotlin has no `static` keyword; A `companion object` is an actual object instance tied to the class.
- A `companion object` is a true `singleton object instance` generated as an inner class of the host.
- Because it is a real object, a `companion object` can implement interfaces, extend classes, and be passed around as an argument to functions just like any other object.
```
class ImageLoader {
    companion object {
        const val CACHE_SIZE = 1024
        @JvmStatic fun clearCache() { }
    }
}
```
- `clearCache()` becomes a real `static method` on `ImageLoader` only because of `@JvmStatic`; otherwise, it's an instance method on the nested Companion singleton.

----

**9. How do you force a companion object method to be a true Java static method?**
- Annotate `@JvmStatic` to function of the `companion object`. (See Que. 8)

---- 

**10. How does the internal visibility modifier work?**
- `internal` makes a member visible anywhere within the same module (e.g., an Android Gradle module). It compiles down to public in Java but gets `name-mangled` to prevent external usage.
- `Name mangling` is a compiler or interpreter feature that automatically changes identifier names to unique strings to prevent naming conflicts

----

**Bonus: Why doesn't Kotlin have a `static` keyword?**
- Kotlin creators designed a language to be `fully object-oriented`, `cross-platform`, and `free of the architectural limitations` that the static keyword introduces in Java.
- In Java, `static` members belong to the class itself rather than instances. This means they cannot implement interfaces or be treated as real objects; Kotlin solves this
- Kotlin is `fully-fledged object-oriented`, so objects can extend classes and implement interfaces, whereas Java `static` can't do this.

----

**11. How does Kotlin's protected differ from Java's?**
- In Java, `protected` members are visible to subclasses and other classes in the same package.
- In Kotlin, `protected` is visible only within the class and its subclasses (no package visibility).

-----

**12. What is a "backing field" (field)?**
- A backing field is the actual underlying memory storage generated by the Kotlin compiler to hold a property's value, accessible inside custom getters or setters via the field identifier.
- Kotlin properties are not fields; they consist of a getter, a setter, and an optional backing field.
- When it's generated: If a property uses the default getter/setter, or if a custom getter/setter explicitly references the field keyword.
```
var score: Int = 0
set(value) {
    if (value >= 0) {
        field = value // 'field' points to the actual memory storage
    }
}
```
----

**13. What is a "backing property"?** 
- A `backing property` is a `design pattern` where a class uses a private mutable property (_property) for internal state management, but exposes it to the outside world as a public immutable property (property).
- It enforces encapsulation. It ensures external components can only observe state changes, not modify the state directly, preventing bugs and architectural leaks.
```
// 1. Private backing property - mutable internally
private val _uiState = MutableStateFlow<UiState>(UiState.Loading)

// 2. Public exposed property - read-only externally
val uiState: StateFlow<UiState> = _uiState.asStateFlow()
```

----

**14. How do you make a property readable publicly, but mutable only internally?**
- By making the setter private: var name: String = "" private set.
```
var name: String = ""
        private set
```

----

**15. What is the difference between `val` and `const val`?**
- `val` is a read-only property assigned at runtime.
- `const val` is a true compile-time constant that can only be a primitive type or a String, and must be declared at the top level or inside an object.

----

**16. What is the difference between `lateinit var` and `by lazy`?**
- `lateinit` is for `vars` that will be initialized later (often via Dependency Injection) and cannot be used with primitives.
- `by lazy` is for `vals` and initializes the property thread-safely on its first access.

----

**17. How does Kotlin handle multiple inheritance?**
- Kotlin avoids multiple inheritance of state (classes) to bypass the `Diamond Problem` but supports multiple inheritance of behavior through interfaces with default method implementations.
- Kotlin interfaces can contain executable code. When a class implements multiple interfaces that share conflicting method signatures, the compiler throws a `compile-time error`. 
- As a developer, we are forced to explicitly resolve the ambiguity by overriding the conflicting method and specifying which interface implementation to invoke using the super-qualified syntax `super<InterfaceName>.method()`
```
interface AnalyticsTracker {
    fun logEvent(name: String) {
        println("Analytics: Logging $name")
    }
}

interface CrashlyticsTracker {
    fun logEvent(name: String) {
        println("Crashlytics: Logging $name")
    }
}

// Class implementing both interfaces must resolve the conflict explicitly
class SyncManager: AnalyticsTracker, CrashlyticsTracker {

    override fun logEvent(name: String) {
        // Explicitly routing the execution path to both interfaces
        super<AnalyticsTracker>.logEvent(name)
        super<CrashlyticsTracker>.logEvent(name)
    }
}
```

---

**18. How do you resolve conflicts if two interfaces have the same default method signature?**
- You must override the method in the child class and explicitly specify which parent to call using `super<InterfaceName>.method()`.

---

**19. What happens if you define a property in a Kotlin interface?**
- When you declare a property inside a Kotlin interface, it is `stateless` by default.
- The compiler does not generate a backing field, meaning it cannot store values directly
- Interface properties cannot have backing fields (they cannot hold state). The implementing class must override the property, or the interface must provide a custom getter.
- Same as a default interface (interface with body which becomes optional to get override), the default properties also need to be overridden, but getter properties become optional to get override, and it is default accessible 
```
interface FeatureConfig {
    // 1. Abstract property: Implements must provide memory storage
    val apiKey: String

    // 2. Computed property: Stateless default implementation (No backing field)
    val isEnabled: Boolean
        get() = apiKey.isNotBlank()
}

// Senior Implementation
class ProductionConfig: FeatureConfig {
    // Allocates an actual backing field in memory for the interface contract
    override val apiKey: String = "prod_secret_key_123"

    // isEnabled is automatically available here without overriding it!
}
```

----

**20. Can an abstract class implement an interface without implementing its methods?**
- Yes, because an abstract class is an incomplete blueprint,
- It can inherit the interface contract and pass the responsibility of implementing those methods down to the first concrete subclass.
- An abstract class is `50% normal class` and `50% interface`; hence, implementing an `interface` and a `normal class` does not give me an error
```
interface OldSol {
    fun doThis()
}
open class LegacySol {
    fun doThis() {
        println("❌ This has not been done.")
    }
}
abstract class NewSolution: OldSol, LegacySol() {
    fun doneThis() {
        println("✅ This has been done.")
    }
}
```
----

**21. What is the difference between Any and Any?**
- The difference between `Any` and `Any?` comes down to Kotlin's root type hierarchy and nullability constraints:
-  I map this directly to `Java Interoperability` and `Generics`, because `Any?` is the true equivalent of `Java's Object`, because a Java object reference can always be `null`
- `Any` is the root of all non-nullable types: Every `class` in Kotlin implicitly inherits from `Any`; it cannot hold a `null` value in it.
- `Any?` is the absolute root of the entire Kotlin type hierarchy: It represents the combination of `Any` + the `null` literal. A variable of type `Any?` can hold absolutely `anything—any object instance`, primitive wrapper, or null.

----

**22. What is the `Nothing` type?**
- `Nothing` is a special type at the absolute bottom of the type hierarchy.
- `Nothing` is a subclass of every class in Kotlin. It represents a value that never exists. It is used as the return type for functions that always throw an exception or loop infinitely.
- `Nothing` has no instances and can never hold a value at runtime.
- The `null` literal in Kotlin doesn't have a concrete type out-of-the-box. When you declare `val x = null`, the compiler implicitly infers its type as Nothing?.
- • Nothing is incredibly useful when dealing with covariant generics (out T). Ex. Kotlin's standard library defines `EmptyList` as `List<Nothing>`. Because Nothing is a subtype of every other type, a `List<Nothing>` can be safely cast into expecting a `List<String>`, `List<Int>`, or any custom object without causing type mismatches.

----

- ℹ️ Info: In computer science type theory, there is a concept called a Bottom Type (often represented by the symbol ⊥ or "falsum").
- ℹ️ Nothing does not complete the function and throws an exception; Unit lets the function return control back to the caller

----
23. Can you override a `val` with a `var` in a subclass?
- Yes, Kotlin permits overriding a parent `val` property with a child `var` property.
```
open class Parent {
    open val bankName = "RBI"
    open var accountBal = 0
}
class Child: Parent() {
    //✅ Changing parent `val` to `var` in child class
    override var bankName: String = "SBI"
    
    //❌ If the parent wants to change the value, then we cannot keep it constant
    //Error Message: Val-property cannot override var-property public open var accountBal: Int defined in Parent
    override val accountBal: Int = 1000
}
```

----

**24. What are Anonymous Inner Classes in Kotlin?**
- They are created using object expressions
- Unlike Java, Kotlin object expressions can implement multiple interfaces.
```
interface Word {
    fun onWordCheck(isValid: Boolean) 
}
//Anonymous Inner Classes in Kotlin
val isSuccess = object : Word {
    override fun onWordCheck(isValid: Boolean) {
        //Check Word : $isValid
    }
}
```

---- 

**25. When should you use a `sealed class` instead of an `enum class`?**
- Enums contain exactly one instance of each constant.
- Sealed classes allow subclasses to have multiple instances, different parameters, and entirely different state shapes, making them perfect for representing complex UI States (e.g., Loading, Success(data), Error(exception)).
- Use `Enum` when you are modeling standard data configurations or fixed types
- Use `Sealed Class` when you are modeling `business domain` behaviors, `states`, or events that flow through your `Architecture` (e.g., UiState, NavigationEvent, WebSocketMessage).

----

**26. What are sealed interfaces and why were they introduced?**
- `Sealed interfaces` are restricted interfaces whose implementations must be declared within the same compilation unit and package.
-  Since Kotlin 1.5, they serve as the exact structural equivalent of sealed classes but carry all the native behavioral benefits of standard interfaces.
-  TODO: Research and add more answers here ............




