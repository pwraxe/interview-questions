1. What is the difference between an abstract class and an interface in Java?

2. What is the difference between the “==” operator and the “.equals()” method in Java?
-> == check object refrance, .equals() check value
 
3. What is the difference between a lateinit property and an initialized property in Kotlin?


4. What is the difference between a HashSet and a TreeSet in Java?
-> hashSet: unordered set of unique elements
-> treeset: order set of unique element

5. What is a companion object in Kotlin?

6. What is the difference between a class and an object in Kotlin?

7. What is a functional interface (sAM conversion) in Java?

8. What is the difference between a private and a protected method in Java?

===================================================================================

1. What are the key Android app components?

2. What is an Activity in Android?

3. What is a Fragment in Android?

4. What is a Service in Android? 

5. What is a Broadcast Receiver in Android?

6. What is a Content Provider in Android?

7. What is the lifecycle of an Activity in Android?

8. How do you pass data between Activities in Android? (Via intent)

9. What is the purpose of a Bundle in Android?

10. What is the difference between a Service and an IntentService in Android?
-> Service: 1) Long Running Task | 2)Parent Class of IntentService | 3) Work on Main Thread | 4) Required Manual Stop 
-> IntentServiec: 1) Short Running Task | 2) SubClass of Service | 3) Work on Worker thread | 4) Automatically stops itself


11. What is the difference between a View and a ViewGroup in Android UI development?
-> View: Single UI Element
-> ViewGroup: Collection of UI Elements and Other ViewGroup


12. What is the purpose of XML-based layouts in Android UI development?
-> 1) Lightweight | 2) Human & M/C Readable | 3) Highly Supportive in Android | 4) Devs can seperate UI Design from App Logic


13. How do you create a custom View in Android?
-> Extend View Class and overriding onDraw() method, Defining tag in xml


14. How do you handle different screen densities in Android UI development?
-> mdpi, hdpi, xhdpi, xxhdpi,


15. What is a RecyclerView in Android UI development?
-> Replacement of List and GridView, Customizable View, Multiple Layout View, Reuse same ui for next dataset


16. What are some common UI components in Android?
-> TextView, EditText, ImageView, CheckBox, RadioButton


17. What is the purpose of the “match_parent” attribute in Android XML layouts?

 
18. What are some common UI design principles for mobile apps?
-> Simplicity, Consistency, Feedback, Affordance, Discoverability
Simplicity ====================> : UI should be clear and simple
Consistency ===================> : Color, Font, Icons should be the same in all overall
Instant Feedback or Speed =====> : App should be quick in response of user input and faster in execution
Responsiveness ================> : App should be responsive for all device and orientation
User Control ==================> : Give Control to user on app Ex. Button Click, Back Navigation, Change Settings
Accessibility =================> : App should be accessible for all user including disables and Visually impaired, Support screen reader
Touch-Friendly UI Elements ====> : Make UI Component large enough that make clickable ex. 48 x 48 dp
Seamless Onboarding ===========> : Keep quick onboarding of user, allow skip for unnecessary information which they can fill later
Animations ====================> : Use animation to enhance user experience


19. How can you improve the performance of an Android app’s UI?
-> Uses of Lint Tool | By Reducing Layout Heirarchi | Using RecyclerView | Optimizing Animation and Transition | Using SVG instead of Image

Optimize Layouts          : Avoid deeply nested layouts, and nested scroll, as they slows render ui
Efficient Use of Views    : Reduce No of Views, Use RecycleView for Large Dataset,
Optimize Images           : Avoid large images for loading, Use Glide and Picasso for Image loading and caching, USe SVG at possible
Avoid UI Thread Blocking  : Avoid the task that block the main UI, use background task and service
Memory Management         : Avoid Memory Leaks, Using tools like LeakCanary, and Avoid unnecessary Object Creation
Profile and Monitor Performance: Use Android Profiler to check CPU uses and Memory consumption


20. What is the purpose of the “dp” (density-independent pixel) unit in Android?
-> dp use to specify dimention to UI element which is independent to device screen


21. What is the purpose of a ViewStub in Android?

22. How do you handle different screen sizes in Android?
-> layout-small, layout-large and layout-xlarge 


23. What is Model-View-ViewModel (MVVM) architecture.
-> MVVM (Model View, ViewModel) Architecture
-> It is Design by Google Android to maintain seperation of concern
-> It has 3 component: 1) Model (data classes, business logic) | 2) View (UI) | 3) ViewModel: Interface between Model and View

24. How do you implement the MVVM architecture in an Android app using Jetpack? 
-> We use following component in MVVM Architecture 
-> LiveData: Lifecycle aware observable data holder which reflect changes in observable pattern
-> ViewModel: It Store and Manage UI Related Data, communicate model component and handle config changes
-> DataBinding: IT binds to data source in ViewModel and eleminate use of findviewById()


25. What is dependency injection and how does it improve app architecture?
-> It manage dependency between objects
-> Insted of getting object of class directly, DI provides us object of that class
-> It uses annotation to generate code that provide Dependency to other class
-> It is DAG (Directed Asyclic Graph)
-> It is fully static and compile time dependecy injection
-> 1) Constructor Injection 2) Field Injection


26. Can you explain how the Repository pattern works in Android app development?
-> It manage data from different source (Local, Remote, File, ...) in single place
-> It provides abstrat layer to easy swap between diffrent resources

==========================================================================================

27. What is Retrofit and how does it work?
-> Retrofit is type safe HTTP Client for android 
-> It use to make HTTP quest and handle responce very efficiently
-> It allows developer to declare methods with retrofit annotation 
-> It supports parcing Gson, Moshi, library
-> It also comes with support of Interceptors


28. What is Room and how is it used for data persistence in Android?
-> Room is Part of Android Jetpack library and use to store data locally
-> It is abstract layer of SQLite, and it is lightweight, build top of SQLite
-> It allows to perform query operation
-> Room uses annotation to define Entities and Database singleton object


29. What is the difference between synchronous and asynchronous network requests in Android?
-> synchronous Network execute on Main thread
-> Asynchronous Network execute on Worker thread without blocking main thread


30. What is the difference between REST and SOAP APIs?
-> REST (Representational State Transfer) | LightWeight | Json | HTTP Methods
-> SOAP (Single Object Access Protocol) | Heavyweight | XML | No HTTP Methods

31. What is JSON? How is it used in Android app development?
-> Javascript Object Notation | Send and Received Data from Server | Serialized and Deserialized | Sharing Object between app components
