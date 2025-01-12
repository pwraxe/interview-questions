1. What are the components of an Android application?
-> (ABCS) Activity, Broadcast Receiver, Content Provider, Service, Intent


2. Explain the Activity lifecycle. 
-> Lifecycle is duration between creating till destroy
-> Activity is Android Component and It has its own lifecycle
-> Based on activity state and User inteaction, different overriden methods of an activty being called
-> onCreate, onStart, onResume, onPause, onStop, onRestart, onDestroy


3. What is a Fragment, and how does it differ from an Activity?
-> Fragment is reusable portion of UI, it has its own lifecycle
-> Fragment hosted either on activity or other fragment, and it can be used by different fragment and activity
-> Fragment can be mange dynamically by adding, removing, updating

DIFF
-> Activity is Complete Part of app and fragment is small part of app
-> Activity is independent and Fragment is dependent
-> Activity cannot re-used, Fragment can be reuse


4. What is the purpose of the AndroidManifest.xml file?
-> Its imp file in every android app
-> It gives overview about application
-> It provides info of app components, permission declared, harware requirements etc to System


5. What are Intents in Android?
-> Intent is messaging object which use to send, receive data between different application component
-> It also use to open other application, website and start application components from app
-> It has 2 types 1) Implicite Intent 2) Explicit Intent


6. Describe the difference between implicit and explicit intents.
-> Implicit: Define General Action | Open Website, and Installed app, Setting
-> Explicit: Define Components     | Open Activity, Start Service, Broadcast Receiver


7. What is a Content Provider, and when would you use one?
-> Content Provider is sharing app data with system and other application also get data from other application
-> When we want and send data to other application then CP is used


8. Explain the concept of Services in Android.
-> Service is use for long running application which runs at background without user interaction
-> Service is component which dont have UI but it continue runs even app close
-> Forground, Background, Bound Service


9. What is a Broadcast Receiver?
-> It is Android App core component, 
-> It received system event and broadcast to other appliacation or user like battery low, Connectivity, Network etc
-> It received intent from system or other applciation and broadcast to user and other application
-> Broadcast receiver activate application by performing task at background
-> Broadcast Receiver registered statically before android 8 and then BR can register dynamically


10. How can you store data locally in an Android application?
-> By SharePref, Roomdatabase or SQLite, File Management


11. What is the difference between a LinearLayout and a RelativeLayout?
-> LineraLayout arrange UI element in linear fashion either Vertically or Horizontally, and RelativeLayout arrange based on relation of adjustment
-> LinearLayout has Updated Version: LinearLayoutCompat, RelativeLayout is Deprecated


12. Explain the ViewGroup class.
-> It is special view which contains other views and define there layout


13. What are the different types of layouts available in Android?
-> LinearLayout, ConstraintLayout, RelativeLayout, GridLayout, TableLayout, CoordinateLayout, FrameLayout


14. How can you optimize the performance of RecyclerView?
-> ViewHolder Pattern, SetFixSize, Avoid NestedRecycling, EfficientLayout, Use of DiffUtils, Limit Image Size, ViewCaching


15. What is the difference between a RecyclerView and a ListView?
-> RecyclerView: Show Vertical, Horizontal, Grid | Better at Re-using View | Easy for Complex ui | Support animation | Good for large list
-> ListView: Show Only Vertical List | Not Better at re-suing View | difficult for complex ui | Difficult for complex ui | Not Support Animation | Good for small list


16. What are the advantages of using ConstraintLayout?
-> It is advance layout in android UI 
-> IT uses for flexible declaration of UI Element on Layout
-> It auto resize / adjust UI element on Different screens
-> UI Element in this layout adjust without requiring nested layout
-> Often Use in complex UI declaration


17. What is Data Binding in Android?
-> It is way to connect UI with directly data source
-> It does not require to find view by its id and it can directly access via binding object
-> data binding has extra tag called data tag which take object from dynamically and intialized UI element with actual data 
-> It reduces intialized data externally and auto reflect changes when object updates
-> UI elements or Viewgoup should be under layout tag
-> You can also take data from viewmodel


18. Explain the use of ViewModel in Android.
-> It is part of MVVM Architecture
-> It is responsible for maintaining seperation of concern
-> ViewModel is also responsinble for hold and manage UI related data and configuration changes,
-> It is responsible for provide updated data to UI


19. What is LiveData, and how is it used?
-> LiveData is observable data holder abstract class in Android which allow us to keep ui updated
-> LiveData provide observer which gives updated value when data changes
-> LiveData is lifecycle aware, It respect the other app compoents
-> LiveData attached to mutableLiveData hence When Data changes to MutableLiveData Live data reflect changes to its observer to update UI


20. What is the purpose of a LayoutInflater?
-> It use to convert XML Layout to View Object


21. Explain the MVP architecture pattern.
-> Model View Presenter
-> View <--> Presenter <--> Model


22. What is the MVVM architecture?
-> Model View ViewModel is Android Architecture Design Pattern which maintain seperation of concern
-> Model: Represend data and Business Login such as API Call, Database Operation
-> View: Represend UI Component that display data
-> ViewModel: Intermediate between View and Model, Use receive data from model and respond to View, It servive config change, holding UI related data


23. How do you implement dependency injection in Android?
-> Android Provide Dependency Injection Library such as Dagger Hilt and other like Coil


24. What is a Singleton, and how is it used in Android?
-> Singlton is Design Pattern which allows only one instance of an object
-> It use for share database instance and api call


25. What is a Repository pattern?
-> Using Repository Pattern you can create repository that manage all data resource
-> By Using Repository Pattern it allows to fetch data dynamically based on data availability
-> Repository implement Repository interface which allow to fetch data based on data availability


26. Explain the role of LiveData in MVVM.
-> LiveData is Crutial part in Android Architechture Design Pattern
-> It plays Important Role in holding data in ViewModel and When Data changes it reflect to observer which use to update UI with latest info
-> LiveData is readonly class


27. What is the difference between an Interface and an Abstract Class?
-> Interface: Collection of abstract methods | Declareation should implement | Method declaration and Init
-> Abstract Class: Collection of abstract and non-abstract methods | Declaration should implement to sub class | Method declare and init


28.What is a Builder pattern?
-> Builder pattern is design pattern in programming field which use to crete complex object
-> It is Part of Desing Pattern
-> IT use to create object in more flexible way
-> It creates object based on constraint


29. What is the purpose of the Adapter pattern?
-> It is structural Desing Patten which allow two different incompatible interface work togather
-> It act as bride between two different interfaces
-> It promote reusablity of existing code


30. How do you manage asynchronous tasks in Android?
-> By WorkManagert and Coroutine


31. What is Retrofit, and how is it used in Android?
-> Retrofit is type safe HTTP Client for android 
-> It use to make HTTP request and handle responce very efficiently
-> It allows developer to declare methods with retrofit annotation 
-> It supports parcing Gson, Moshi, library
-> It also comes with support of Interceptors


32. Explain the role of OkHttp in Android networking.
-> OkHttp is Effient HTTP Client which support HTTP and HTTP2 and Websocket
-> OkHttp is Popular HTTP Client for andoid which use to handle network request
-> OkHttp provides straitforword way to send and receive HTTP request
-> OkHTTP perform network operation on backfeound thread, SO main thread remain responsive
-> OkHTTP reuses connection to reduce latency and improve performance
-> OkHTTP supports response caching which soeedup loading time and save bandwidth
-> You can add Interceptor to modify request or response, allows logging and authentication


33. What is the difference between GET and POST requests?
-> GET: USe to get data from server
-> POST: Special use for sending data to server.


34.How do you handle API responses in Kotlin?
-> Retrofit has Response Class, That class can handle
-> Response class with give me success and fail state based on that I can apply try-catch block


35. What is Gson, and how is it used?
-> Gson is Google Library which use to change objet to Json and convert json to equivalant object
-> Retrofit uses Gson as GsonConverterFactory for sending json and receive json 


36. Explain the use of interceptors in OkHttp.
-> To modify request and response in Retrofit API call
-> To enable Logging of API request and response
-> To apply Authentication to api
-> Error Handling


37. What is the difference between a REST API and a SOAP API?
-> REST API is Representational State API
-> SOAP is Simple object transfer protocol
-> Rest Uses Json to send and received request
-> SOAP uses XML to send and received request


38. What is the purpose of a Query Parameter in HTTP requests?
-> Query Param use in Retrofit in APi calling 
-> Query param is use to send additional data in url along with body
-> Query usually call for filtering and re-source identify purpose


39. How do you handle errors in network calls?
-> Retrofit return response code in every api call
-> based on response code it will easy to handle errors 
-> also add try catch block where api call is takes place


--1Q left

41. What is SQLite, and how is it used in Android?
-> SQLite is lightweight database that embeded in android for storing structure data
-> It is relational database in android which stores data in tablar format
-> It uses MySQL internally to perform database operation
-> Sqlite is Deprecated and Room database using now a days


42. Explain the Room Persistence Library.
-> Room is Standard Library design by AndroidX 
-> Special Library which Use to store data in android os
-> Room is abstract layer of SQLite Database
-> It uses annotation at DAO, Database class, Table


43. What are the components of Room?
-> Entity, Database, DAO


44. How do you perform a database migration in Room?
-> 2 Ways of Migration in Room Database
1. Auto Migration
    -> add Param in @Database (autoMigrations = [AutoMigration(from = 1, to = 2, spec = MyDatabase.MyMigration::class)])
    -> Create a Nested class called `class MyMigration: AutoMigrationSpec` annotate with @RenameTable("MySQL Query ...")

2. Manual Migration

    -> val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("MySQL Query")
            }
        }

        When Creating Instance of Roomdatabase, just call
        Room.addMigration(MIGRATION_1_2).build()




        

45. What is SharedPreferences, and when would you use it?
-> SharePreferance is light weight way to store persistance data
-> It store data in key-value pair


48. What is the difference between Serializable and Parcelable?
-> Serializable: Java Interface  | Slower |   
-> Parcelable: Android Interface | Faster | 


49. Explain the concept of lazy loading in Android.
-> Lazy Intilization


50. How do you handle configuration changes in Android?
-> By SaveInstantState, By ViewModel, 


51. What are some best practices for managing background tasks in Android?
-> Using Service, WorkManager, Coroutine, 


53. What are the advantages of using Kotlin Coroutines for concurrency?
-> REsponsive, execute task, does not block main thread, No ANRs


54. Explain how to manage memory leaks in Android applications.
-> Avoid static refrance, Avoid object strong refrance, Avoiding long life of object
-> avoid context in paramer 
-> maximum privatizing fields


55.What is ProGuard, and why is it used?
-> shrinking, optimizing, improve app performance


56. What are some common security practices for Android development?


57. How can you optimize an Android application for performance?


58. What is the purpose of unit testing in Android?


60. What are the advantages of using Dependency Injection in Android?
-> DI is use to generate boilerplate code based on annotation
-> It is Dependency injection which provide dependency of object
-> It is singleton and Inject to constructor and field injection


Skipping Testing

71. What is Jetpack, and what are its main components?
-> ViewModel, LiveData, Observer, WorkManager, RoomDatabase, Fragment Navigation, Paging, Data Binding


72. Explain the Paging library in Android.
-> Paging is use to display large dataset into smaller chunks which improves performace

73. What is WorkManager, and how is it used?
-> WorkManager is use to perform task or operation at background
-> This work based on constraints
-> you can send and received data from worker class.
-> You can also observ workinfo by workmanager instance
-> To execute code at background we need to create subclass of Worker Class which accept context and param
-> It has 2 Types 1) OneTimeWorkRequest 2) PeriodicWorkRequest


74. What are the advantages of using Kotlin Flow?


75. What is the difference between Flow and LiveData?


76. How do you handle deep linking in Android?

77. What is a Custom View, and how do you create one?
-> Extend View Class and override onDraw Method


78. Explain the use of the Navigation component.

79. What are the benefits of using Kotlin DSL for Android development?

80. How do you manage different screen sizes and orientations in Android?

81. What is an APK, and how is it generated?

82. What is ADB, and how is it used in Android development?

83. Explain the purpose of the Gradle build system in Android.

84. What are the advantages of using Kotlin in Android development?

85. How do you optimize images in an Android app?

86. How do you handle user permissions in Android?

87. What is the role of an Activity's onSaveInstanceState() method?
