Call Class Methods without creating an instance of that class
-> This will work ifff the class is open to extend
-> Extend open class to object class and create method in object class from that method call parent class methods (only public and protected)

open class Boss {
    fun show() {
        println("Boss Show")
    }
    protected fun other() {
        println("Other Boss")
    }
}

object Watcher: Boss() {
    override fun toString(): String {
        show()
        other()
        return super.toString()
    }

}

fun main() {
    Watcher.toString()
}
