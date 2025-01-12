1. Explain the Android Design principle 

-> Simplicity: UI Should be clear and Simple OR User Friendly
-> Consistency: Color, Font, and Icons should be the same overall
-> Feedback: When the user interacts with UI Element it should be responsive by sound or animation so the user knows the input is worked
-> Efficient: App should be fast and responsive
-> Accessibility: App should be accessible for all users including disables and Visually impaired, Support screen reader
-> Seamless Onboarding: Keep quick onboarding of users, allow skip for unnecessary information which they can fill later
-> Animations: Use animation to enhance user experience
 
=================================================================================================================================

2. What is or Explain Android Backend Service 

-> The backend service works in the background to perform tasks that the user doesn't directly see but still need to happen.
-> Task Management: background service handles important tasks such as sending data to the server, downloading file, save user pieces of information etc.
-> Keeps Things Running: Even App close, background service can keep running at the background
-> Data Communication: It connects app to cloud where data is stored, 
Ex. Keep Location Updated, Keep Device Updated, Syncing Device Etc.

=================================================================================================================================

3. What is or Explain Android Framework 

NOTE: Where Framework, there Android App Component, UI Component, Jetpack component etc
-> Android Framework is a set of tools and libraries that developers use to build good Android apps
-> Structure for Apps: Framework Provides the Basic Structure of Android applications, it defines how things work
-> Prebuild Component: Framework includes Prebuild Component so developers don't need to create them from scratch
-> Simplifies Development: Developers do not need to worry about low-level things like memory and hardware, Framework does that fora the  developer at his end
-> Handles Key Tasks:
	- UI: Framework provides a way How app to look and respond to the user
	- Data Storage: Framework provides way how to save and retrieve info
	- Networking: Framework provide a way how send and receive info over the network
	- Device Hardware: Framework provides way to interact with Hardware like camera, Bluetooth, Sensor, wifi etc


=================================================================================================================================

Explain Android SDK

-> Android SDK is a Software development kit for the Android Software Ecosystem that has comprehensive development tools
-> In SDK Management in Android Studio you will find 3 Tabs 1) SDK Platform 2) SDK Tools 3) SDK Update

-> It is Set of Tools that developers require to develop android application
1. Tools for Building Apps: Android Studio and Compiler
2. Libraries: It is a pre-written piece of code that the developer uses instead of creating from scratch
3. Android Emulator:
4. Debugging Tools: Debugger, and Logcat
5. Documentation
6. Build Tools:


=================================================================================================================================


Explain Android Security in detail

-> Android Security is all about protecting Devices, apps, data from unauthorized access or harmful activities
-> Android Security make sure App and its data will be protected from malware and hackers

1. Regular Software Updates
	- Android regularly releases security updates to fix any bugs or weaknesses in the system.

2. Malware Detection
	- Android OS has a Malware Detection Feature that detect malware in android devices and notify users about it

3. Encryption
	- Android OS Encrypt and protect your data stored in your device, 
	- Data is scrumble in such way that only authenticated person witha  valid password and PIN can decrypt it
 
4. Biometric Security (Fingerprint/Face Unlock)

5. Google Play Protect
	- Google Play Prevent users from installing apps which did not verify by google play console or prevent to install such apps as they might harm your devices

6. App Sandboxing: 
	- Each Android app runs in its own private space, called a sandbox.
	- Android OS isolates each app to protect them, and OS gives them a Unique ID (UID) to each app create a level sandbox

7. App Permission: Make sure app is trusted before giving permission

8. Two-factor authentication (2FA)
	- This is extra later of security, which prevents hacker from accessing your data or unauthorized logging,

9. Remote Wipe and Find My Device


=================================================================================================================================


Explain Android Performance in detail
-> High performing Android apps mean to run smoothly, response quickly, does not slow-down or crashed

1. Device Performance: How efficiently device is performing well in the different task (CPU, RAM, Battery)
2. App Performance: The good Performance of an app is determined by (Smooth UI/UX, Fast Loading, Memory usage, CPU Usage)
3. Optimization: (App Optimization, background Optimization)
4. Network Performance: Slow N/W, slow response, Android API provides to fast response (Use of Wifi, Caching Data, )
5. Performance Monitoring Tools (Android Profiler, Logcat)
6. Good Practices for Better Performance (Clear Cache, Limit Background Apps, Disable Unused Apps, Regular Software Updates)


=================================================================================================================================


Tell me about memory management in Android
-> Memory refers in Android to RAM in the Device which use to run Android apps and different system resources
1. Memory Management in Android 
	- Foreground Process = Apps in Foreground uses most of the memory as it has high-priority
	- Background Process = Not in High Priority | Use some memory as app running in background | System can kill if more memory required
	- Cache Process = These are apps that are not running but stored in memory | Make app open fasters | System can kill if more memory required

2. GC
	- Memory Heap = Every app run in its own memory heap
	- Low Memory Killer = When the Device running out of memory, the OS kills the background Process to free up space
	- Out of Memory (OOM) Errors = When the App uses more memory than available then OS throw OOM

3. Best Practices for Developers to Manage Memory Efficiently
	- Avoid Memory Leaks:
	- Use Efficient Data Structures:
	- Optimize Bitmap Usage:
	- Recycle Views and Resource
	- Use the Android Profiler

4. Memory Management for Users
	- Close Unnecessary Apps
	- Clear App Cache
	- Use Lighter Versions of Apps
	- Uninstall Unnecessary Apps:

5. Tools for Monitoring Memory Usage
	- Android Profiler
