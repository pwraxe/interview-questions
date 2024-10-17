1. Android Components
-> Activity, Broadcast Receiver, Content Provider, Service, (Intent)

2. What is Activity?
-> Activity is one of android core component in android.
-> The Activity class is an important part of an application's overall lifecycle,
-> It provides windows to display ui components and handles user input such as touch or clicked events
-> It is also entry point of an app and Calls other activity
-> It also present as FullScreen and Floating Window
-> onCreate: Here you initialized activity, call setContentView with layout resouce file 
-> onPause: you deal with User Pausing active interaction with activity (ContentProvider holds data)
-> findViewById uses to retrive view to interact programmitically

-> Activities in System managed as activity stacks
-> Activity has 4 States
1) If activity is on foreground of screen then it is on top of activity stack and it is active and running
2) Partial Visibility of Activity
3) Activity is went to background, completly stopped/hidden, Still retains all states, sometimes kill by system if no longer visible and required memory
4) System can remove activity from stack by asing finish or kill its process, For reshow, activity completly restarted and retain all previous state


4. What is a service in Android?
-> Service is one of core component in andorid
-> Service use to perform long running background task without user interaction
-> Service can run at background even app close
-> Service run on main thread by default
-> Foreground service, Background Service, Bound Service
 
5. What is the use of Bundle in Android?
-> It is Container which use to store data in key-value pair in android
-> It use to store current state data (activity restoration on config change) and pass data to other activity and Fragment
-> It uses ArrayMap internally to store data in key-value pair

6. What is an Adapter in Android?
-> It is bridge between adapterView and underline data for that view.
-> It holds data and send it to adapter view
-> Adapter View receives data and send to different views 

7. What is AAPT?
-> Android Asset Packaging Tool
-> Tool that helps compile and package resources for Android apps

8. What is Android Debug Bridge(ADB)?
-> IT is command line tool 
-> It allows developers to control communication with emulator
-> It also allows developers to executes remote shell command

9. What is a Toast? Write its syntax.
-> Toast is message which pops up on screen
-> It display message regarding status of operation
-> Toast.makeText(ProjectActivity.this, "Your message here", Toast.LENGTH_LONG).show();


10. What is context?
-> Context is an abstract class whose implementation provided by Android System, 
-> Context provides access to an application's environment and resources.
-> Context calls application level operations such as lauch activity, start service, BR, receive intent


11. Explain the difference between Implicit and Explicit Intent.
-> Implicit Intent: This does not specify component name.
-> They declare general action to perform allows system to find appropriate action to handle intent.
-> Open Website, Open app
===
-> Explicit Intent: When you want to launch specific component in android app.
-> This defines exact class that will handle intent
-> Ex. Launch an activity, Service, Broadcast Receiver
-> Such component needs to declare explicitly in menifest to handle


12. What is ANR in Android?
-> Application Not Responding
-> This promt dialog when main thread in app unresponsive for long time to respond


13. Explain different launch modes in Android.
-> Standard: New Instance will create of same activity, [A|B|C|C|C
-> SingleTop: If New Instance is same which at top then no new will create else new Instance will create if not on top [A|B|C|B
-> SingleTask: If Instance is already in stack then remove all instance of top of that instance Ex. [A|B|C|D , Launch B, [A|B
-> SingleInstance: It launch in seperate task
[A|B|C , Lauch D, 
[D, Lauch E
[A|B|C|E


14. Activity Lifecycle
-> onCreate() -> onStart() -> onResume() -> onPause() -> onStop() -> onDestroy()


15. Explain the dialog boxes supported on Android.
-> AlertDialog, DatePickerDialog, TimePickerDialog, ProgressDialog

16. EXplain Android Platform Architecture (https://developer.android.com/guide/platform)
-> System/User Apps >> Java API Framework >> Native C/C++ Library (ART) >> HAL >> Linux Kernal (Drivers, Power Mngmnt)
UJNHL


17. What is AndroidManifest.xml file and why do you need this?
-> Android Manifest is an important file in andorid application 
-> It is declared in root directory.
-> It give information regarding application components, permissions, uses of hardwares
-> Component must be declare in menifest before it uses


18. What is an intent?
-> An intent is an abstract description of an operation to be performed
-> It is messaging object which use to request action from other component
-> It is also use to pass data between components, lauch activity, start service open website, open app, and communication between BR.
-> Two tyep of intent 1) Implicite Intent 2) Explicite Intent


19. What are broadcast receivers? How is it implemented?
-> It is core component of android application
-> It enable applications to receive intents that are broadcast by the system or by other applications.
-> When an event occurs, the broadcast receiver activates the app by performing a task or creating a status bar notification.
-> It listen system events such as BAttery, Connectivity, SMS, Custom BR from app or other app.
-> Broadcast contains action string that identify event. 
-> Broadcast receivers Was registered statically (Before android 8) by adding them to the Android manifest file.


20. What is the difference between Serializable and Parcelable? Which is the best approach in Android?
-> Both are interfaces
-> Both allows to serialised and deserialised object
-> Serializable is part of Java Standard Library and Parcelable is designed specifically for android
-> Slower: Serializable uses refection for serialized an deserialized, Custom serialized and Deserialized in Parcelable
-> Simpler: Serializable easy to implement where as Parcelable is complex

21. What are the differences between Service and Thread?
-> Service: 
	1) Android Component
   	2) Long running task
   	3) Manage by System
	4) Service has its own lifecycle
	5) Can interact with android component
	6) App kill service still running

   Thread:
   	1) Concurrent unit of execution 
   	2) Short running task
   	3) Manage By Devs
	4) Thread dont have its lifecycle
	5) Cannot interact with android component
	6) App kill Thread kill


22. What is the content provider? How it is implemented?
-> It is core component of android application
-> It is way for apps to share data with each other in safe and organized manner.
-> It allows to manage and share data between different application
-> It uses to share data between one app to other app.
-> It also use to access data from other app.
-> It uses standard query to perform operation (Diff. appls can easily interact)


23. What is the difference between compileSdkVersion and targetSdkVersion?
-> compileSdkVersion: It specifies Android SDK Version that your project uses compiling your app (Project uses this version to compile app)
-> targetSdkVersion: This is highest API version that your app is compatible with


24. What is JobScheduler?
-> This API uses to schedule different types of job against framework that will execute in app own process
-> This is android system service which helps manage background task efficiently (It is a way of scheduling task that your app will do)
-> Scheduling Job: you can create job and specify when to run
-> Job Management: System take cares of running this job at runtime
-> Handling Constrint: You can specify explicite condition when job should run
-> Batching: If multiple job is schedule then JobSchedular grp them togather and run at same time


25. Why is XML used for frontend development in Android? 
-> It is human and machine readable
-> Scalable
-> Simple to develop UI
-> XML is Lightweight language
-> Keeps UI and Logic seperate
-> Android studio strongly support xml layout, preview, and its ui
-> XML can define as resources like color, string, dimention, themes, icon.

 
26. What is the Dalvik Virtual Machine?
-> It provides the platform that runs java bytecode
-> This use to execute android application
-> DVM is Optimized for mobile devices and focus on memory and performance
-> JavaCode -> (JVM) -> ByteCode -> (DexCompiler) -> Dalvik Bytecode -> DVM

 
27. What is android runtime?
-> It is critical component in android operating system
-> It provides an environment where android application executes
-> It is responsible for managing lifecycle of and application, handle memory allocation, GC, provide essencial service like threading, networking, graphics


28. What’s Gradle and its usage in Android?
-> It is open source built automation tool that widely use for building android application 
-> It provides flexible way to define build confugaration and automate task such as building, testing packaging, deployment
-> It uses Groovy (or kotlin) DSL build script
-> It allows to declare dependency, libraries, plugin and android versions that your project rely on.
-> It allows to create different version of an app
Uses
-> Android uses, build.gradle file. 1) Project level for Global Setting, 2) App Level contains configuratin specific to module



29. What’s Fragment in android?
-> Fragment is re-usable portion of apps UI
-> Fragment manage and define its own layout
-> Fragment has its own lifecycle
-> Fragment must be hosted either activity or other fragment
-> Deviding UI into fragment makes easy to maintain and manage UI
-> Fragment can be add, replace, remove and you can keep the record in backstack that is manage by activity
-> Multiple instance of same fragment


30. Fragment Lifecycle
-> onAttach() -> onCreate() -> onCreateView() -> onActivityCreated() -> onStart() -> onResume() -> onPause() -> onStop() -> onDestroyView() -> onDestroy() -> onDetach()


31. What’s RecyclerView in Android & How it works?
-> It is part of android jetpack library and provides more advance and customizable way to display list
-> It used to display large dataset in scrollable list format
-> It is successor of GridView and ListView


32. What’s the Difference Between Intent and Intent filters?


33. Activity Vs Fragment

 
34. What’s Data Binding in Android?
-> It is Support Library, which binds UI Component to data sources
-> When data change, ui reflect changes instantly
-> Data Binding simplifies the process of connecting your UI to your data model
-> Data binding works well with ViewModel architecture promoting clr seperation of concern
-> You can bind to UI element, onClick event, list

