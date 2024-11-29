Kotlin
	1. Rating to Kotlin and Java
	2. Why ratings of Kotlin is more than Java
	3. How many classes in Kotlin
	4. Explain Normal class vs inner class
	5. Explain Normal class vs data class
	6. What is data class in kotlin
	7. What is sealed class in kotlin
	8. How to check if the lateinit property is initialized or not
	9. What is `initialized` for checking lateinit property
	10. Lambda function vs HOF vs anonymous class
	11. write of HOF and Lambda Expression
	12. Explain flow
	13. Types of flow
	14. Which you use Stateflow, share low in project
	15. Livedata vs Flow
	16. How do you handle exceptions in coroutine
	17. Scope Functions
	18. Let vs run
	19. var val const
	20. lateinit vs lazy
	21. is lateinit initlized by null
  	22. Explain Coroutine
  	23. Launch vs async
	24. What is a safe cast
	25. Explain scope functions


Database
	1. How to Migrate Database

Activity
	1. What is the launch mode of the Activity
	2. Explain Single Task vs Single Instance
	3. Serializable Vs Parcelable
	4. XML Parsing?
	5. WorkManager
	6. Is there any case where the WorkManager fails?
	7. Limit of WorkManager
 	8. Activity Lifecycle
  	9. Activity 'A' is open and Activity 'B' is open then what will the situation of Activity 'A' and Which method gets override
  	10. I have 2 api and how do you call them parallelly?

MVVM
	1. What is MVVM
	2. is worked on Clean Architecture

OOPS
	1. Solid Principles explain each

Git
	1. How to resolve conflict
	2. What is Rebase
	3. what is reset

Jetpack compose
	1. How to call compose from XML Layout
	2. How to call XML layout from compose
	3. How will you Draw a triangle in compose

DI
  Which DI use?
	1. Provides Vs Inject (suggestion -> @Bind )
	2. SingletonComponent Vs ApplicationComponent
	3. Activity vs Fragment
	4. AndroidViewModel Vs ViewModel

========================================================
1. what will be the output of the code 

suspend fun test() {
	val j = viewModelScope.launch {
    		  delay(2000L)
        	println("TEST")
       	}
        j.join()
        println("TEST 2")
}
_______________________________________________________________
2. Will the following code will work? if not then how to make it workable 
class Sol {
    private lateinit var name : String? = null 
    fun ss () {
        name = ""
    }
}

_______________________________________________________________
3. What will be the output if a person is nullable and initiated object
person.let {
	println(person.name)
}

person.let {
	println(person.name)
}

person.run {
	println(person.name)
}

person.run {
	println(person.name)
}
