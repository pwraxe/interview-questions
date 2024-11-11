1. What are the primary features of Kotlin?
-> Open Source, NPE, Coroutine, Interoperability, Consice, Extension lambda, and HOF, data class 


2. Explain val and var in Kotlin.


3. What is the difference between == and === in Kotlin?
== : structureal equality
===: refrantial equality


4. What are extension functions in Kotlin?
-> Class Function/member, 
-> written outside class, belong to class, 
-> extends functionality of class, 
-> without affect existing codebase


5. Explain Coroutines and why they're used.
-> Concurrancy Design Pattern
-> Writes code Asynchronous 
-> scope: GlobalScope, SuperviserScope, LifecycleScope, CoroutineScope, ViwModelScope, LifecycleScope
-> Scope gives job type object which control suspend function and coroutine, 
-> start coroutine by launch{}, and async{} scope,
-> launch for fire and forget, async returns Deferred object which extract data by await() 


6. How does Kotlin handle null safety?
-> safe call (?.)
-> Assetion (!!)
-> Elvis Operator (?:)
-> Let block (scope functions)


7. What are data classes in Kotlin?
-> primary purpose to hold data
-> require min 1 param in its constructor
-> compiler auto generate method to read class instance human readable format
-> it has copy method


8. What is a sealed class in Kotlin?
-> collection of subclass which restrict heirarchy of inheritance
-> All Heirarchy should declare in same file
-> sealed class can extend to other sealed class
-> compiler knows heirarchy of sealed classes at compile time


9. What is the purpose of lateinit in Kotlin?
-> lateinitialization | mutable property | work on non-nullable | initialized before use | Avoid UninitializedPropertyException 


10. Explain the purpose of `by lazy` in Kotlin.
-> It is delegation property 
-> it load its data in memory when first time access
-> it is immutable property and can work on nullable data


11. What is the apply scope function in Kotlin?
-> kotlin scope function 
-> gives this as current scope context
-> use to initilized and update object
-> access property and methods directly without dot operator


12. Explain the let function in Kotlin and its use case.
-> kotlin scope function
-> gives 'it' as current scope context
-> access properties and behaviour by it scope
-> it often work on nullable object or variable


13. What is a companion object in Kotlin?
-> Tie to class name hence act as static in java
-> access properties and methods directly by class name
-> it is singleton by default
-> only one companion object is allowd in single class and not even different name 


14. How does sealed class differ from an enum in Kotlin?
-> sealed class: has multiple data type, more complex state
-> enum class: has fix set of constants


15. What are inline functions in Kotlin, and when would you use them?
-> copy body at caller place
-> reduce overhead of function call, improve performance


16. What is the difference between object and class in Kotlin?
object: singleton by default | access without instance | cannot extend
class : non-singleton | access if instance | can be extend


17. What are Coroutines Scopes in Kotlin?
-> it returns job type object which control coroutine
-> it can start, pause, resume, cancel coroutine
-> coroutine runs under the scope like GlobalScope, SupervisorScope, CoroutineScope, LifecycleScope, ViewModelScope


18. Explain suspend functions in Kotlin.
-> normal function with suspend keyword
-> control by scopes,
-> can start, pause, resume, stop and cancel by scope
-> call from either scope or other suspend function 
-> can share data between suspend functinos


19. What is flow in Kotlin Coroutines?
-> it is stream of data flow, that continuously emit the values asynchronously
-> It has producer and consumer (emitter and collector)
-> Producer: continuously produce value and add to stram
-> Consumer: It used to consume data from the stream 
-> ColdFlow: It emits value only when it is collected (each collector has its own instance of flow)
-> HotFlow: It continues emitting value even if not collected (multiple collector share same emission)
-> ShareFlow: Allow multiple collectors to share the same emission (don't have initial value)
-> StateFlow: It holds a single updated state (it has an initial value), the collector has the latest value


20. What is delegation in Kotlin?
-> Delegation is allow to delegate property or behaviour to other class or object


21. What is an inline class in Kotlin?
-> inline class require only 1 paramenter in its constructor
-> Compiler does not create object at runtime and provide access at compile time
-> It save object creation and memory in heap


22. Explain higher-order functions in Kotlin.


23. What is the when expression, and how is it more powerful than switch in Java?
 

24. What is a type alias in Kotlin?
-> Provides alternative name for existing data type


25. Explain destructuring in Kotlin.
-> break object into varible


26. What are sealed interfaces in Kotlin?


27. How does Kotlin handle null safety?
-> Safe Call (?.)
-> Assertion (!!)
-> Elvis OPerator (?:)
-> Scope function (let, apply, also, with, run)


28. Explain withContext in Kotlin Coroutines.
-> Switch context of coroutine to specific dispacher


29. What is the purpose of the operator keyword in Kotlin?


30. How does Kotlin handle extension properties?
-> same as Extension function, it is Extension property
-> Written outside class but belongs to class



===================================================== OOPS



31. What are the four main principles of OOP?
-> Abstraction | Encapsulation | Inheritance | Polymorphism


32. Explain Encapsulation.
-> private class property and control them via public method of class


33. What is Inheritance in OOP?
-> Extending properties and behaviour of parent class into its child class
-> class need to open for extend


34. Explain Polymorphism and give an example.
-> Means Many-Forms
-> it works on 2 way, 1) Method overloading and Method overriding


35. What is an Interface in OOP?
-> interface is contract that clases will implmented
-> interface is collection of abstract and non-abstract methods and property
-> Interface is get implemented and only those method tends to override which is declared, define method is optional to override


36. What is the difference between abstract class and interface?
-> abstract class: class can be abstract | collection of abstract and non-abstract methods and properties | class need to declare abstract if abstract method and properties delcared
-> interface: interface is abstract by default | collection of abstract and non-abstract method | no-need to write abstract externally


37. Explain Abstraction with an example.
-> HIding internal implementation and showing relevant info to user


38. What is method overloading?


39. What is method overriding?


40. Explain the concept of composition in OOP.
-> Like Dependency Injection
-> it is Has-A relationship
-> Class is depend on other class
-> class Car (val engine: Engine)
 
 
41. What is the difference between composition and inheritance?
-> inheritance: class extends
-> composition: class depends


42. What is encapsulation in OOP?


43. What is polymorphism in OOP?


44. What is an Abstract class, and how is it used?


45. What are access modifiers in OOP?
-> Public, Private, Protected, internal


46. What is a design pattern?



===================================================== ANDROID



47. What is Android?
-> Open Source Linux based Operating System
-> Mainly Designed for Small Scale Devices such as Mobile and tablet
-> Google Developed its framework of developing apps for Smartphones


48. What is an Activity in Android?
-> Android App Core Component
-> Provide window to display UI and handle touch events
-> Starting point of app, 
-> Own lifecycle, Activity stack and Launch modes


49. Explain the Activity Lifecycle.
-> Duration between creation to destroy
-> Activity has its own lifecycle
-> ActivityManager calls differeant overriden methods based on user input behaviour against app
-> It has onCreate() -> onStart() -> onResume() -> onPause() -> onStop() -> [onRestart()] -> onDestroy()


50. What is the purpose of onSaveInstanceState() and onRestoreInstanceState()?
-> onSaveInstanceState(): calls before destroy activity | save activity state from loosing | 
-> onRestoreInstanceState(): calls after activity recreate | retrived saved states from bundle object


51. What are Intents in Android?
-> Intents is messaging object which use to send data between different applicaiton component
-> Intent also use to request action from other app component
-> Intent often use to send data from activty, start service, start broascast receiver.


52. What is a Service in Android?
-> Android Core component
-> Service use to perform long running operation at background without user interface
-> Service run even app close
-> Need to stop manually
-> run on main thread


53. What is a Broadcast Receiver?
-> Android Core Component
-> It receives intent from Operating System 
-> It broadcast to USer or Other applicaiton
-> We can declare System and custom broadcast receiver


54. What are Content Providers in Android?
-> Core Component of Android App
-> It provide a way to share data to other application and take data from other application
-> It provide data in systamcatic way via query and projection


55. What is the difference between a Fragment and an Activity?
-> Fragment: Small UI part | Reusable 	  | Dependent     | Own Lifecycle | Dynamically Manage | Fragment Backstack
-> Activity: Complete UI | | Not Reusable | Not Dependent | Own Lifecycle | Statically Manage  | Activity Stack


56. Explain the Android Manifest file and its uses.
-> Main File on any android application
-> Provide overvidw of applciation to Operating system
-> It contains declaration of permission, h/w requirements, logo, app_name, app component like Activity, Service, Broadcast Receiver etc, Starting/Lauching Activity


57. What is ANR, and how can you prevent it?
-> ANR: Application Not Responding
-> When Main thread busy for long time then such dialong appear with crash
-> Perform Heavy operation on other thread, Use Coroutine, WorkManager or Service for heavy work
-> Keep thread light for small task


58. What is an AsyncTask, and why is it used? (NO ANSWER)


59. How does ViewModel help in managing UI-related data?
-> ViewModel is Part of MVVM app architecture
-> ViewModel store data in Flow or LiveData which reflect changes in observer pattern to update ui
-> ViewModel is loose coupling so it survive configuration changes.


60. What is LiveData, and how does it work?
-> LiveData is abtract class whose implmentation provided by Operating System
-> It is Lifecycle aware data-holder class which reflect its changes to observer to update ui


61.What is the difference between Service and IntentService?
-> Service: 	  Use for Long Running Operation  | Run on Main Thread	  | Need to stop manually
-> IntentService: Use for Short running operation | Run on worker Thread  | Automatically Stop


62. Explain the role of Room Database in Android.
-> Room is abstract layer of Sqlite, and build on top of sqlite
-> Room is ORM (Object Relation Mapping) library that simplifies database access in android
-> Room provides compile time checks, type safty, and better integration with livedata and viemodel


63. What is WorkManager, and when would you use it?
-> Run task at background, gives guarantee to run
-> Create by 2 ways OneTimeWorkRequest and PeriodicWorkRequest
-> Add Constrains, and Send data to Worker Class, get Success and failure result and data from worker class


64. What is ProGuard, and why is it used?
-> Proguard is tool which shrink and optimized code, and removes useless resources 
-> Reduce app size and make difficult for reverse-engineering


65. How can you handle runtime permissions in Android?
-> by checkSelfPermissions()
-> onRequestPermissinResult()


66. What is Data Binding in Android?
-> It is Part of Android Jetpack component Library
-> it binds data to view
-> It removes findViewById call and access view id directly via binding object
-> Views defines under layout tag, and data tag takes data object initializer or viewmodel


67. What is View Binding, and how is it different from Data Binding?
-> VieWBinding is feature in android jetpack libray which bind view to data and its one way binding


68. Explain the purpose of Handler in Android.
-> Its use to update UI from background thread
-> It manage and execute code on specific thread
-> Operation that requires UI interaction from background thread
-> Handler allow task to run after an specify interval.
-> you can create message object and send in messaging queue
 

69. What are PendingIntents and their use cases?
-> PendingIntent is wrapper Intent 
-> It allow other app to execute pending task behalf of your app
-> Use with Notificaiton and Service


70. What is the use of RecyclerView, and how does it differ from ListView?
-> Advance version of ListView
-> Provide better performance, flexibility, define complex UI, supports animations, Reuse view, Layout Management


71. What is Jetpack in Android?
-> Jetpack is set of libraries which has classes and function which helps developer to write clean and maintainable code
-> It reduce boilerplate code and build robust apps
-> It includes WorkManager, RoomDatabase, ViewModel, LiveData, Pager, Navigation component, 


72. What are Android Architecture Components?
-> Jetpack componebt, AndroidX Library


73. What is a Broadcast, and how can it be used in Android?
-> Brodcast is system events which trigger from System and listen by any apps 


74. What is the MVVM Architecture in Android?
-> View <--> ViewModel<--> Model


75. How would you handle large lists efficiently in Android?
-> By Using RecycleView
-> By Using Paging Library


76. What is Dependency Injection, and how is it used in Android?
-> Dependency Injection is a way to provide instance of class and its dependecy class without recreating them 
-> Libraries like Hilt, Dagger use to generate code and provides dependecy


77. What are Flavors in Android, and why are they used?
-> Flavor is configuration in build system
-> It allows developwr to create multiple version of same app


78. What is the difference between Serializable and Parcelable?
-> Serializable: Java Interface    | Slow | can't customized
-> Parcelable  : Android Interface | Fast | can customized


79. How do you ensure backward compatibility in Android?


80. What is Room Database in Android, and what are its advantages over SQLite?
-> Abstract layer of sqlite, build top of sqlite
-> ORM (object relation mapping)
-> It better integrated with viewmodel and live data and repository pattern


81. What is the difference between getContext(), getActivity(), and requireContext() in a Fragment?
-> getContext(): if(fragment is attached) context else null
-> getActivity(): if(fragment is attached) activity else null
-> requireContext(): if(fragment attached) context else exception
-> requiredActivity(): if(fragment is attached) activity else exception


82. What is the Android Jetpack Navigation Component, and how does it work?
-> Navigation component is Manage Fragment Navigation.
-> It provides Navigation graph which defines route and navigation between multiple fragment along with passing data
-> It handle deep linking, Manage backstack


83. Explain deep linking in Android.
-> deep linking allow to navigate to activity and fragment from external resource by clicking on clickable link or URL
-> deep linking implement via explicite intent


84. What is a Content Resolver?
-> contentResolver is way to access data of differant application


85. What is ViewModelScope, and why is it important?
-> ViewModelScope tied to ViewModel
-> It is lifecycle aware 
-> Life of viewModelScope is limited to ViewModel
-> It launch coroutine and cancel when ViewModel is clear


86. What is a ViewModelFactory, and why is it used?
-> ViewModelFactory is use to create instance of viewmodel when viewModel needs parameter in its constructor
-> It’s essential when a ViewModel requires dependencies that need to be injected.


87. How would you manage large images efficiently in Android?
-> To handle large image we need external library like Glide and Picasso
-> These libraries load image asynchronously, handle image caching and transformation


88. Explain the Lifecycle of a Fragment in Android.
-> onAttach() -> onCreate() -> onCreateView() -> onViewCreated() -> onStart() -> onResume() -> onPause() -> onStop() -> onDestoryView() -> onDestroy() -> onDetach()


89. What is a Retrofit library, and what are its main features?
-> Retrogit is OKHTTP Client which effiently send and receives response
-> It build on Top of OkHttp hence it supports HTTP, HTTPS, WebSocket
-> Retrofit handle response in Response Class which has success and failure method also it provides status code
-> We can add interceptors for Logging, Authentication, SetTimeLimit, converter factory


90. How can you handle configuration changes in Android?
-> By onSaveInstanceState()
-> By ViewModel
-> Config changes in Android Menifest


91. Explain what is WorkManager and its advantages over AsyncTask.
-> For Guarantee work
-> OneTimeWorkRequest, PeriodicWorkRequest
-> Require subclass of worker and CoroutineWorker which has doWork function 
-> doWork function return success and failure response from background task
-> we can pass and received data from workManager
-> we can execute workManager based on constraints


92.How does Android handle multi-window support?
-> MultiWindow Support allow user to run two apps simulteniously
-> Developers can handle this by using android:resizeableActivity


93. What is Scoped Storage in Android? (XX)


94. What is a JobScheduler, and when would you use it?
-> This API uses to schedule different types of job against framework that will execute in app own process
-> This is android system service which helps manage background task efficiently (It is a way of scheduling task that your app will do)
-> Scheduling Job: you can create job and specify when to run
-> Job Management: System take cares of running this job at runtime
-> Handling Constrint: You can specify explicite condition when job should run
-> Batching: If multiple job is schedule then JobSchedular grp them togather and run at same time


95. Explain Android’s Doze Mode.
-> Doze mode is idle mode
-> It introduce in android 6.0
-> it reduce CPU and Network uses when Device is in doze mode
-> In this mode apps are restricted to use battery, network call, and backgroung task
-> This improves battery life


96. What is BroadcastReceiver vs LocalBroadcastManager?
-> BroadcastReceiver : It listen system or apps broadcast
-> LocalBroadcastManager?: It use to send broadcast within app (provide security and avoid unnessesory system resource)


97. What is Dagger and its role in Android development?
-> It is dependency Injection framework 
-> It generate code that provide dependency to other class by constructor and field injection


98. What is the difference between a Soft Reference and a Weak Reference in Android?
-> SoftRefrance: Object Stays long time | it has longer life   | Life depend on class instance, app instance
-> WeakRefrance; Object Stays short time | it has shorter life | Life depend on local Scope, local variable or method


99. How do you handle exceptions in Coroutines?
-> try-catch block
-> CoroutineExceptionHandler  for global error handling


100. What is a Snackbar, and how does it differ from a Toast?
-> Snackbar provides lightweight feedback message with option to add action and dismiss by swipe


===================================================== DESIGN PATTERN


101. Explain the Singleton Pattern with an example.
-> Only one instance of class in overall application
-> Database instance, network instance


102. What is the Factory Pattern?
-> Returns object of class based on input type 


103. Explain the Observer Pattern and its use case
-> In this pattern 2 thing plays imp role
-> Suject: It make changes and updates in data and send to observer
-> Observer: when data changes in varible observers get notified
-> Ex. SocialMedia, NewsApp, EvenHandling


104. What is the Decorator Pattern?
-> It allows to add extra functionality to object dynamically without changing its structure


105. Explain the Strategy Pattern with an example
-> This pattern allow to change behaviour of class or object at run time
-> single interface implemented by multiple classes
-> seperate class has interface inits param and its method change behaviour of interface method

 
