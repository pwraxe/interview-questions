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


Database
	24. How to Migrate Database

Activity
	25. What is the launch mode of the Activity
	26. Explain Single Task vs Single Instance
	27. Serializable Vs Parcelable
	28. XML Parsing?
	29. WorkManager
	30. Is there any case where the WorkManager fails?
	31. Limit of WorkManager
 	32. Activity Lifecycle
  	33. Activity 'A' is open and Activity 'B' is open then what will the situation of Activity 'A' and Which method gets override
  	34. I have 2 api and how do you call them parallelly?

MVVM
	35. What is MVVM
	36. is worked on Clean Architecture

OOPS
	37. Solid Principles explain each

Git
	38. How to resolve conflict
	39. What is Rebase
	40. what is reset

Jetpack compose
	41. How to call compose from XML Layout
	42. How to call XML layout from compose
	43. How will you Draw a triangle in compose

DI
  Which DI use?
	44. Provides Vs Inject (suggestion -> @Bind )
	45. SingletonComponent Vs ApplicationComponent
	46. Activity vs Fragment
	47. AndroidViewModel Vs ViewModel

========================================================
48. what will be the output of the code 

suspend fun test() {
	val j = viewModelScope.launch {
    		  delay(2000L)
        	println("TEST")
       	}
        j.join()
        println("TEST 2")
}
_______________________________________________________________
49. Will the following code will work? if not then how to make it workable 
class Sol {
    private lateinit var name : String? = null 
    fun ss () {
        name = ""
    }
}

_______________________________________________________________
50. What will be the output if a person is nullable and initiated object
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
