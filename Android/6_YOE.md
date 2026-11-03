#### A) Activity & Fragment Lifecycles
----

**1. What is the real difference between onPause() and onStop()?**
- `onPause()`: The Activity is partially obscured (e.g., a permission dialog, multi-window mode, or incoming phone call alert) but still visible on screen.
- `onStop()`: The Activity is completely invisible to the user (e.g., another Activity opened or the home button was pressed).
- Heavy background releases (like database flushes or heavy animations) should happen in onStop(), while fast UI pauses belong in onPause().

----

**2. What happens to an Activity during a configuration change (like screen rotation)?**
- The Android OS completely destroys the existing Activity (`onPause` -> `onStop` -> `onDestroy`) and creates a fresh instance (`onCreate` -> `onStart` -> `onResume`).
- Non-retained UI state in variables is wiped unless preserved using `ViewModel` or `onSaveInstanceState()`.
- ViewModels survive this process because their lifecycle is bound to the `ViewModelStoreOwner`, not the individual Activity instance.

----
**3. What is the difference between `ViewModel` and `onSaveInstanceState()`?**
- `ViewModel`: Retains large objects (lists, domain models) in memory during configuration changes, but gets wiped if the OS kills the process due to low memory.
- `onSaveInstanceState()`: Retains tiny data (IDs, text inputs, scroll positions <= 50 KB) in a Parcelable bundle that survives both configuration changes and OS process death.
- For complete state restoration, use `SavedStateHandle` inside your `ViewModel` to combine both benefits.

----
**4. Why does a Fragment have two separate lifecycles (`Lifecycle` vs `ViewLifecycle`)?**
- A Fragment has two separate lifecycles because a Fragment's view can be destroyed and recreated multiple times while the underlying Fragment instance remains alive.
- If you observe `LiveData/Flow` using the Fragment instance's lifecycle, multiple duplicate observers will pile up every time the user navigates back.
- Always pass `viewLifecycleOwner` when observing data inside a Fragment's UI.

----

**5. What is the difference between FragmentTransaction.add() and replace()?**
- `add()`: Stacks the new Fragment on top of the container while keeping the existing Fragment's View alive and visible underneath.
- `replace()`: Removes the existing Fragment (destroying its View) and places the new Fragment into the container.
- Use `add()` when keeping existing tab states alive; use `replace()` when swapping full screens.

----

#### B) Android Core Components & IPC - 4H

**6. What are the four main application components in Android?**
- `Activity:` The UI window where users interact with the app.
- `Service:` A background work component without a user interface (e.g., music playback or file sync).
- `Broadcast Receiver:` A component that listens for system-wide or app-level broadcast events (like airplane mode or custom alerts).
- `Content Provider:` A component that securely shares structured data across different app processes (e.g., reading device contacts).

---- 

**7. What is an Intent and what are the two main types?**
- An Intent is an asynchronous messaging object used to request an action from another component.
- Explicit Intent: Specifies the exact destination class name (e.g., `Intent(context, ProfileActivity::class.java)`), used within your own app.
- Implicit Intent: Declares a general action to perform (e.g., `Intent.ACTION_VIEW` with a web URL), allowing the OS to pick an appropriate app to handle it.

----

**8. What is an `IntentFilter?`**
- An expression declared in the `AndroidManifest.xml` that specifies the types of implicit intents a component can handle.
- It filters incoming intents based on `action`, `category`, and `data` type.
- For Android 12+, any component with an intent filter must explicitly define `android:exported="true"` or `"false"` for security.

----

**9. What is IPC (Inter-Process Communication) and how does Android do it?**
- IPC allows two completely separate application processes on the phone to safely send data to each other.
- Android implements IPC at the Linux kernel level using the high-speed Binder driver with shared memory.
- High-level abstractions like AIDL (Android Interface Definition Language) and `Messenger` build on top of Binder.

----

10. What is AIDL and when should you use it?
- AIDL (Android Interface Definition Language) lets you define an interface that client apps and a remote Service agree on to talk to each other across processes.
- It generates Java code that automatically parcels and unparcels arguments across process boundaries.
- Use it only when multiple separate apps need to access a multi-threaded service simultaneously; otherwise, standard `Messenger` or `Bound Service` is simpler.

----

## Services & Background Execution










