##### SOLID Principle 
- Solid principles are 5 Rules, which help to write better code
- It makes code understandable, changes and fixes
---

### S: Single Responsibility Principle (SRP)
- Class and function should have to do only one thing, 
- If you have two different tasks, you should do them in two different places.
- Ex. Single Class with 2 functions having different use cases (task)
- Ex. Message has two things to do 1) creating and sending 
```
class CreateMessage {
    fun createMessage() {
        println("Message has been created")
    }
}
class SendMessage {
    fun sendMessage(){
        println("Message has been sent")
    }
}
```

---

### O: Open/Close Principle (OCP)
- Design a class in a such way that they can open for extending new features but close for modification
- Extension Function (Open for Extension, Close for Modification)
- Ex-2 interface implemented to multiple classes, If a new class wants to implement, it can be. old code wont affect for this
```
interface SendMessage {
    fun send(message: String)
}

class EmailMessage: SendMessage {
    override fun send(message: String) {
        println("Sending Email: $message")
    }
}

class SmsMessage: SendMessage {
    override fun send(message: String) {
        println("Sending Sms: $message")
    }

}
class NotificationMessage: SendMessage {
    override fun send(message: String) {
        println("Sending Notification: $message")
    }
}
```

---

### L: Liskov Substitution Principle (LSP)
- If one class inherits from another, we should use the child class instead of the parent class without any issue
- Mean: Parent Class and Child class have the same class signature then you can assign a child class object to the parent class instance
- Ex1. ``` val parentClass: Parent = ChildClass() ```
- Ex2. Instead of extending the class, create an interface and declare methods and allow the child class to implement the interface
- Note: if the child class and parent class have a little bit of different signatures then LSP won't work here

```
//EXAMPLE - 1
open class Message {
    open fun sendMessage(msg:String) {}
}

class SmsMessage: Message() {
    override fun sendMessage(msg: String) {
        println("Sending SMS")
    }
}

class EmailMessage: Message() {
    override fun sendMessage(msg: String) {
        println("Sending Email")
    }
}

fun main() {
    val message: Message = SmsMessage()
    message.sendMessage("")
    
    val message: Message = EmailMessage()
    message.sendMessage("")
}
```

```
EXAMPLE - 2

interface Message {
    fun send(msg: String)
}

class SmsMessage: Message {
    override fun send(msg: String) {
        println("Sending SMS")
    }
}

class EmailMessage: Message {
    override fun send(msg: String) {
        println("Sending Email")
    }
}

fun main() {
    //Way 1
    val smsMessage = SmsMessage()
    smsMessage.send("SMS")
    
    //Way 2: Assign Child Class object to Parent Class instance
    val message: Message = EmailMessage()
    message.send("Email")
}
```
---

### I: Interface Segregation Principle (ISP)
- We should avoid big and messy interfaces, instead, we should create small interfaces that do only one thing at a time
- Ex. Avoid multiple fun in the same interface, instead create an interface with a single method

```
//class can only implement an interface that needs to, it won't implement the unnecessary interface
interface SmsService {
    fun sendSms()
}

interface EmailService {
    fun draftEmail()
}

class SmsMessage: SmsService {
    override fun sendSms() {
        println("Doing sending SMS only")
    }
}

class EmailMessage: EmailService {
    override fun draftEmail() {
        println("Drafting Email")
    }
}
```
---

### D: Dependency Inversion Principle (DIP)
- Small Part of code should not depend on big classes, Insted both classes depend on abstraction (Like Interface, abstract class), We should write code that easy to change
- Ex. multiple classes implement single interface, new class received interface instace and calls interface method
 
```
interface SendMessage {
    fun send(message: String)
}

class EmailMessage: SendMessage {
    override fun send(message: String) {
        println("Sending Email: $message")
    }
}

class SmsMessage: SendMessage {
    override fun send(message: String) {
        println("Sending Sms: $message")
    }

}
class NotificationMessage: SendMessage {
    override fun send(message: String) {
        println("Sending Notification: $message")
    }
}

class Message(private val sendMessage: SendMessage) {

    fun notifyUser(message: String) {
        sendMessage.send(message)
    }
}

fun main() {

    Message(EmailMessage()).notifyUser("Hello from Email")
    Message(SmsMessage()).notifyUser("Hello from SMS")
    Message(NotificationMessage()).notifyUser("Hello from Notification")
}
```
