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

5. What is the difference between a primary and a secondary constructor?
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

## Inheritance, Interfaces & Polymorphism


