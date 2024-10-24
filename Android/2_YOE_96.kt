1. What is the Android Architecture Component Library? List some of its main components.
-> It is set of libraries classes and function from which developer can create app easly and effectivly
-> Main Component: ViewMode, LiveData, Room, Paging, Fragment Component, WorkManager


2. Explain the role of ViewModel in MVVM architecture.
-> View <--> ViewModel <--> Model

3. How do LiveData and MutableLiveData differ?
-> LiveData is read/Immutable only class
-> MutableLive data is mutable in nature
-> LiveData is abstract class and MutableLiveData is child class of LiveData class


4. Why and when should you use a Repository pattern in Android?
-> When we have to take data from different data source then we can use Repository Pattern


5. What are Android WorkManager and its primary use cases?
-> WorkManager is schedule and manage different task in background
-> WorkManager gurantee will execute task in background
-> OneTimeWorkRequest, PeriodicWorkRequest | constraints | data send received from WM | Retrurn success and fail result


6. Describe the difference between onCreate() and onStart() in an Activity.
-> onCreate(): When activity created for first time
-> onStart(): WHen Activity about to visible


7. What is the role of ViewBinding and how is it different from findViewById()
-> ViewBinding and findViewById both are use to access views 
-> ViewBinding generates binding class so have direct access to views


8. What is the purpose of DataBinding and how is it different from ViewBinding?
-> DataBinding use to bind UI Component directly with data source
-> DataBinding allow two way binding, change in object will reflect in UI
-> ViewBinding generate classes which direct access to views in layout


9. Explain Coroutines in the context of Android.
-> explain coroutines 


10. What is an Android Service and how would you start it?
-> Service is core component in android
-> Service use to run long running task at background without user interface
-> It uses startService() methid to start


Activity, Fragment, and Lifecycle
===================================


11. Describe the Activity lifecycle in Android.
-> lifecycle | activity has its own lifecycle | methods | activity restart story



12. What are the primary differences between Activities and Fragments?
-> Activity: core comp | has lifecycle | not dependent | declare manifest
-> Fragment: !core comp| has lifecycle | dependent | no need to declare


13. How would you handle configuration changes in Android without recreating the Activity?
-> By overriding onSaveInstanceState(), and using ViewModel


14. Explain the role of onSaveInstanceState() and onRestoreInstanceState().
-> onSaveInstanceState: save state before activity destroy (called before destroy)
-> onRestoreInstanceState: when newly activity recreated (called after recreated)


15. What is the purpose of the FragmentManager?
-> Which manage lifecycle of fragment
-> manage backstack of fragment
-> Manage creation, change and destroy fragment


16. How do you pass data between two Fragments?
-> By Using Interface
-> By SafeArgs in Navigation component
-> By Shared ViewModel


17. When would you use startActivityForResult() and what alternatives are available in modern Android?
-> We starting activity for getting the result
-> When we want data/result back from lauched activity then we will use startActivityForResult
-> registerForActivityResult() using now a days behalf of deprecated startActivityForResult


18. What is the ViewModel’s role in maintaining UI-related data?
-> ViewModel survive config changes and retain ui related data even activity destroy


19. How would you manage the back stack of Fragments in an Activity?
-> When Fragment added , remove, change it maintain its entries in frament backstack
-> we use addToBackStack(), popupBackStack(), methods to work with fragment backstack


20. Explain the FragmentTransaction methods and their use cases.
-> add(), remove(), Replace(), commit(), 


UI Design and Layouts
======================

21. What is ConstraintLayout, and why would you prefer it over LinearLayout or RelativeLayout?
-> ConstraintLayout: allow to declare complex layout without nesting them, improve performance and take less memory | Auto resize for large sceeen
-> Linear and RelativeLayout 


22. How would you optimize UI performance in a complex layout?
-> reduce nested declaration of layout, 
-> Rich use of ConstraintLayout for complex ui and flexible for layout


23. Describe the RecyclerView and how it differs from ListView.
-> RecyclerView is advance listView in android
-> RecyclerView uses adapter for defining complex ui and define multiple layout of single item
-> RecyclerView allow to declare custom layout which easily inflated and set data to ui item
-? Custom Animation | Flexible Layout


24. What are ViewHolders in RecyclerView, and why are they essential?
-> IT use to hold refrances to views in recycler Item
-> They improve performance by avoiding repeat view lookup 


25. What is DiffUtil, and when should you use it in RecyclerView?
-> DiffUtils is data class which checks differance between two data set and and update only item which changed
-> DiffUtils is data class which use in recyclerView for updateing only data item if its equivalant data has been changed


26. What is a Custom View, and when should you create one?
-> CustomView is such view which does not come with android package, we need to create externally based on business requirements
-> CustomView can be create by extending view class and by overriding onDraw method


27. Explain how Adapter classes work in Android.
-> Adapter is intermediator between data and viwe layout, 
-> Adapter bind data to view


28. What is the role of the CoordinatorLayout?
-> CoordinateLayout is layout which manage behaviour of its childs
-> You also can customized behaviour of child views of coordinateLayout
-> It use for animating view, manage interaction between views for showing and hiding
-> It also use for animation purpose, 
-> When Complex UI elements wants to coordinate between each other then CoordinateLayout is used


29. What are Drawables, and how would you work with them programmatically?
-> Drawable is resource like image, vector, svg icon, shape
-> you can use drawable file statically and programmitically by setting icon, image to imageView, setting background


30. How do you support multiple screen sizes and densities in Android?
-> use resource qualifier (res/layout-mdpi, res/layout-hdpi, res/layout-xdpi)


Networking and APIs

31. How would you make a network request using Retrofit?
-> Add Dependecy > Sync
-> Declare Methods in interface
-> Declare Retrofit Object

Interface
Retrofit Object
create<Interface>()
enque()


32. What is OkHttp and why is it often used with Retrofit?
-> It is HTTP client which support HTTP, HTTP2 and Websocket
-> It is use to handle network request
-> It work on worker thread so main thread remain responsive
-> we can use interceptor, authentication, logging as well


33. Explain how you would manage background tasks and network calls using Kotlin Coroutines.
-> Kotlin Coroutine provides different Dispatchers such as Main, IO, Default, Unconfied,
-> Dispatcher.IO use for network related operation any background task,


34. What are some strategies to handle slow network connections in Android apps?
-> Show Loader, Use Retrofit Timeout setting, retry fail request, display message related to.


35.How do you implement caching with Retrofit?
-> Caching support in OkHTTP, which use to store chaching data in file 
-> Take file instance, and create Cache object with specified size
-> It uses file to store cache data along with custom size in MB

36. What is the purpose of the @Query annotation in Retrofit?
-> Passing Extra information in URL to Server such as get data from id
-> @Query annotation uses in function parameter which align to end of URL
-> Query annotation uses in GET Method 


37. What are the main differences between Volley and Retrofit?
-> Retrofit: Square | return Json object or array | more easier to work with data
-> Volley: Google | return json string | complex to work on object


40. What is the purpose of RESTful APIs, and how do you consume them in Android?
-> RESTful API design to use HTTP methods for CRUD operation, 
-> Consume them by making network request
 

Jetpack Compose (if experienced with Jetpack Compose)
========================================================

41. What is Jetpack Compose, and how does it differ from traditional View-based development?
-> It is morden and declarative ui toolkit that simplifies ui development by using kotlin code insted of traditional XML
-> It allows UI build in composable function


42. How would you create a simple UI using Jetpack Compose?
-> By defining composable function and using composable UI function like Text(), Button()


43. Explain the concept of @Composable in Jetpack Compose.
-> Composable is Annotation in Jetpack compose which makes normal function to composable function
-> Such function use to define composable UI


44. How do you manage state in Jetpack Compose?
-> By using remember function to store value across recomposition
-> By using ViewModel
-> By using LiveData
-> By using StateFlow


45. What are remember and mutableStateOf, and when would you use them?
-> remember: function which store and retain compose state even after recompose
-> mutableStateOf: create state variable which change state to recompose ui


46.What are some advantages of using Jetpack Compose?
-> Declarative UI, Dynamic UI, Less complexity, ...


47. How would you handle lists in Jetpack Compose?
-> LazyRow, LazyCol


48. What are Modifiers in Jetpack Compose, and how are they used?
-> Modifier is allow modify the UI element, set size, padding, circle, click event etc


49. How do you handle navigation in Jetpack Compose?
-> By NavHost and NavController, defines composable for navigating UI


50. How do you use animations in Jetpack Compose?
-> it provides verias type of animation to state, like animateDpAsState(), animateVisibility()


Database and Storage
=====================

51. Explain Room and its benefits over SQLite.
-> It is part of android jetpack library, use to store data locally
-> Room is abstract layer over SQLite, it is lightweight, build on top of SQLite
-> Room uses annotation to define Entities and Database singleton object


52. How would you define a one-to-many relationship in Room?


53. What are Data Access Objects (DAO) in Room, and why are they important?


54. What are SharedPreferences, and when would you use them?
-> Use to store user preferances, it store data in key-value pair
-> It uses xml file to storr and xml tag same as string


55. How would you encrypt data stored in SharedPreferences?
-> Use EncryptedSharedPreferences
-> It encrypt key and value using android keystore system


56. What is the use of Content Providers?


58. Explain how to use LiveData with Room database.


Third-Party Libraries and Dependency Management
==================================================

61. What is Gradle, and how is it used in Android development?


62. How would you add a third-party library to your Android project?


63. What is Dagger Hilt, and how does it simplify dependency injection in Android?


64. Explain the role of Glide or Picasso in image loading.


65. How would you implement logging in your Android app?


66. What is the benefit of using Gson or Moshi for JSON parsing?
-> Thse provides simple ways to parse data from json to kotlin object and vice-versa


67. How would you use Retrofit and Moshi together in an Android app?
-> Define instance, pass it as converter to addConverterFactory()


68. What is Lottie, and when would you use it in Android development?




Performance and Optimization
============================

81. How would you improve the performance of an Android app?
-> Optimized UI layout, aboid memory leaks, minimum size images, lightweight background task, only required resources, proguard


82. What are memory leaks, and how would you prevent them?


83. How do you manage background tasks efficiently in Android?
-> WorkManager for Differable task
-> Coroutine for Lightweight Concurrancy
-> JobSchedular PeriodicTask

84. What is APK size optimization, and how would you achieve it?


85. What are some techniques to improve app startup time?
-> Delay heavy initialization
-> lazy loading for data
-> avoid complex ui on screen 


88. How do you handle offline scenarios in an Android app?
-> Room, share pref, WorkManager Sync data


89. What is the role of vector graphics, and why should you use them in Android apps?


91. What is Android Jetpack, and why is it recommended?

92. Explain the differences between implicit and explicit Intents.

93. How would you handle localization in your Android app?

95. What is a BroadcastReceiver, and when would you use it?

96. How do you handle push notifications in Android using Firebase Cloud Messaging (FCM)?
-> Setup firebase, USe FCMService, use token to send message to device
