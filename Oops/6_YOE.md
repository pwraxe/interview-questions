**1. What is the fundamental difference between a class and a data class?**  <br>
- A data class automatically generates equals(), hashCode(), toString(), copy(), and componentN() functions for destructuring. A standard class requires you to write these manually. <br>
- A primary constructor is mandatory in a data class, where Primary constructor is not mandatory in a normal class <br>
- A data class holds data, and a normal class holds an object. <br>

----

2. Why are Kotlin classes `final` by default?
- Primarily to enforce safe object-oriented design and to enable compiler optimization
- It aligns directly with the `'Effective Java' principle: Design and document for inheritance, or else prohibit it`:
- Unlike Java, in Kotlin developers are required to `open` a class to extend its properties and behaviour.
- When a class is final, the compiler knows its methods cannot be overridden. This permits the JVM to perform key runtime optimizations.
- `Devirtualization`: Eliminating virtual method overhead significantly increases execution speed and reduces memory footprint for performance-critical applications

----

3. Explain the initialization order of a Kotlin class.
- Primary constructor parameters.
- Property initializers and `init` blocks in the exact order they appear in the class body.
- Secondary constructors.

----

4. How does the init block relate to the primary constructor?
- The `init` block is not a separate constructor; it is literally the body of the primary constructor.
- The primary constructor cannot contain any code. The init block acts as the execution body for the primary constructor
- `Sequential Execution:` The order of execution strictly follows the top-down declaration order in the source file. Properties defined above the `init` block will execute first, and properties below the `init` block will no longer be available to the `init` block
- `Secondary Constructor Delegation:` The init block is guaranteed to execute before the secondary constructor executes.
