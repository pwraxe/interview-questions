1. Android Components
-> Activity, Broadcast Receiver, Content Provider, Service, (Intent)

2. What is Activity?
-> Activity is one of the android core components in android.
-> The Activity class is an important part of an application's overall lifecycle,
-> It provides windows to display UI components and handles user input such as touch or clicked events
-> It is also the entry point of an app and Calls other activity
-> It also presents as FullScreen and Floating Window
-> onCreate: Here you initialise the activity, call setContentView with a layout resource file 
-> onPause: you deal with User Pausing active interaction with activity (ContentProvider holds data)
-> findViewById is used to retrieve view to interact programmatically

-> Activities in the System managed as activity stacks
-> Activity has 4 States
1) If the activity is in the foreground of the screen then it is on top of the activity stack and it is active and running
2) Partial Visibility of Activity
3) Activity is going to background, completely stopped/hidden, Still retains all states, sometimes killed by system if no longer visible and required memory
4) The system can remove activity from the stack by using finish or kill its process, For reshow, the activity completely restarted and retains all previous state


4. What is a service in Android?
-> Service is one of the core components of android
-> Service used to perform long-running background tasks without user interaction
-> Service can run in the background even if the app closes
-> Service runs on the main thread by default
-> Foreground service, Background Service, Bound Service
 
5. What is the use of Bundle in Android?
-> It is a Container which used to store data in key-value pairs in android
-> It is used to store current state data (activity restoration on config change) and pass data to other activities and Fragment
-> It uses ArrayMap internally to store data in key-value pair

6. What is an Adapter in Android?
-> It is the bridge between the adapter view and the underlined data for that view.
-> It holds data and sends it to the adapter view
-> Adapter View receives data and sends it to different views 

7. What is AAPT?
-> Android Asset Packaging Tool
-> Tool that helps compile and package resources for Android apps

8. What is Android Debug Bridge(ADB)?
-> IT is command-line tool 
-> It allows developers to control communication with the emulator
-> It also allows developers to execute remote shell command

9. What is a Toast? Write its syntax.
-> Toast is the message which pops up on the screen
-> It displays a message regarding the status of the operation
-> Toast.makeText(ProjectActivity.this, "Your message here", Toast.LENGTH_LONG).show();


10. What is context?
-> Context is an abstract class whose implementation is provided by Android System, 
-> Context provides access to an application's environment and resources.
-> Context calls application-level operations such as launch activity, start service, BR, receive intent


11. Explain the difference between Implicit and Explicit Intent.
-> Implicit Intent: This does not specify the component name.
-> They declare general action to perform allowing the system to find the appropriate action to handle the intent.
-> Open Website, Open app
===
-> Explicit Intent: When you want to launch a specific component in an Android app.
-> This defines an exact class that will handle the intent
-> Ex. Launch an activity, Service, Broadcast Receiver
-> Such component needs to be declared explicitly in the manifest to handle


12. What is ANR in Android?
-> Application Not Responding
-> This prompt dialogue when the main thread in the app is unresponsive for a long time to respond


13. Explain different launch modes in Android.
-> Standard: A New Instance will create of the same activity, [A|B|C|C|C
-> SingleTop: If the New Instance is the same as at the top then no new will be created else new Instance will be created if not on top [A|B|C|B
-> SingleTask: If an Instance is already in the stack then remove all instances on top of that instance Ex. [A|B|C|D , Launch B, [A|B
-> SingleInstance: It launches in separate task
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


17. What is an AndroidManifest.xml file and why do you need this?
-> Android Manifest is an important file in the android application 
-> It is declared in the root directory.
-> It gives information regarding application components, permissions, uses of hardware
-> Component must be declared in menifest before it uses


18. What is an intent?
-> An intent is an abstract description of an operation to be performed
-> It is a messaging object used to request action from another component
-> It is also used to pass data between components, launch activity, start service open website, open app, and communication between BR.
-> Two type of intent 1) Implicit Intent 2) Explicit Intent


19. What are broadcast receivers? How is it implemented?
-> It is a core component of Android application
-> It enable applications to receive intents that are broadcast by the system or by other applications.
-> When an event occurs, the broadcast receiver activates the app by performing a task or creating a status bar notification.
-> It listen system events such as BAttery, Connectivity, SMS, and Custom BR from app or other app.
-> Broadcast contains an action string that identifies the event. 
-> Broadcast receivers Were registered statically (Before Android 8) by adding them to the Android manifest file.


20. What is the difference between Serializable and Parcelable? Which is the best approach in Android?
-> Both are interfaces
-> Both allow to serialised and deserialised object
-> Serializable is part of Java Standard Library and Parcelable is designed specifically for android
-> Slower: Serializable uses refection for serialized and deserialized, Custom serialized and Deserialized in Parcelable
-> Simpler: Serializable and easy to implement whereas Parcelable is complex

21. What are the differences between Service and Thread?
-> Service: 
	1) Android Component
   	2) Long-running task
   	3) Manage by System
	4) Service has its lifecycle
	5) Can interact with Android component
	6) App kill service still running

   Thread:
   	1) Concurrent unit of execution 
   	2) Short-running task
   	3) Manage By Devs
	4) Threads don't have their lifecycle
	5) Cannot interact with android component
	6) App kill Thread kill


22. What is the content provider? How it is implemented?
-> It is the core component of Android application
-> It is a way for apps to share data in safe and organized manner.
-> It allows to manage and share data between different application
-> It is used to share data between one app to another app.
-> It is also used to access data from another app.
-> It uses a standard query to perform an operation (Diff. apps can easily interact)


23. What is the difference between compileSdkVersion and targetSdkVersion?
-> compileSdkVersion: It specifies the Android SDK Version that your project uses to compile your app (the Project uses this version to compile the app)
-> targetSdkVersion: This is the highest API version that your app is compatible with


24. What is JobScheduler?
-> This API is used to schedule different types of jobs against a framework that will execute an in-app own process
-> This is an Android system service that helps manage background tasks efficiently (It is a way of scheduling tasks that your app will do)
-> Scheduling Job: you can create a job and specify when to run
-> Job Management: The system take care of running this job at runtime
-> Handling Constraint: You can specify explicit conditions when the job should run
-> Batching: If multiple job is scheduled then JobSchedular grp them together and run at the same time


25. Why is XML used for frontend development in Android? 
-> It is human and machine-readable
-> Scalable
-> Simple to develop UI
-> XML is a Lightweight language
-> Keeps UI and Logic separate
-> Android studio strongly supports XML layout, preview, and its UI
-> XML can be defined as resources like colour, string, dimensions, themes, icons.

 
26. What is the Dalvik Virtual Machine?
-> It provides the platform that runs Java bytecode
-> This used to execute Android application
-> DVM is Optimized for mobile devices and focuses on memory and performance
-> JavaCode -> (JVM) -> ByteCode -> (DexCompiler) -> Dalvik Bytecode -> (DVM) -> ART

 
27. What is Android runtime?
-> It is a critical component in Android operating system
-> It provides an environment where Android application executes
-> It is responsible for managing the lifecycle of an application, handling memory allocation, GC, provide essential service like threading, networking, graphics


28. What’s Gradle and its usage in Android?
-> It is open source built automation tool that is widely used for building Android application 
-> It provides a flexible way to define build configuration and automate tasks such as building, testing packaging, deployment
-> It uses Groovy (or kotlin) DSL build script
-> It allows you to declare dependencies, libraries, plugins and Android versions that your project rely on.
-> It allows to creation of different versions of an app
Uses
-> Android uses, build. gradle file. 1) Project level for Global Setting, 2) App Level contains configuration specific to the module



29. What’s Fragment in Android?
-> Fragment is a re-usable portion of app UI
-> Fragment manage and define its own layout
-> Fragment has its own lifecycle
-> Fragment must be hosted either activity or other fragment
-> Dividing UI into fragments makes it easy to maintain and manage UI
-> Fragment can be added, replaced, and removed and you can keep the record in the back stack that is managed by the activity
-> Multiple instances of the same fragment


30. Fragment Lifecycle
-> onAttach() -> onCreate() -> onCreateView() -> onActivityCreated() -> onStart() -> onResume() -> onPause() -> onStop() -> onDestroyView() -> onDestroy() -> onDetach()


31. What’s RecyclerView in Android & How it works?
-> It is part of the Android jetpack library and provides a more advanced and customizable way to display a list
-> It used to display large datasets in scrollable list format
-> It is the successor of GridView and ListView


32. What’s the Difference Between Intent and Intent filters?


33. Activity Vs Fragment

 
34. What’s Data Binding in Android?
-> It is Support Library, which binds UI Component to data sources
-> When data changes, ui reflects changes instantly
-> Data Binding simplifies the process of connecting your UI to your data model
-> Data binding works well with ViewModel architecture promoting clear separation of concern
-> You can bind to UI elements, onClick events, list


35. What is ViewModel
-> It is an Android architecture pattern
-> It acts as a bridge between View (UI Layer) and Model (Data Layer)
-> Primary purpose to manage ui related data
-> It is attached to the Activity or Fragment Lifecycle hence it survives configuration changes
-> It provides data to view using binding or Jetpack compose


