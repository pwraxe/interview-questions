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
- A Fragment instance can outlive its UI layout (for example, when a Fragment is placed on the BackStack, its View is destroyed via  `onDestroyView`, but the Fragment instance remains alive).
- If you observe `LiveData/Flow` using the Fragment instance's lifecycle, multiple duplicate observers will pile up every time the user navigates back.
- Always pass `viewLifecycleOwner` when observing data inside a Fragment's UI.

----

**5. What is the difference between FragmentTransaction.add() and replace()?**
- `add()`: Stacks the new Fragment on top of the container while keeping the existing Fragment's View alive and visible underneath.
- `replace()`: Removes the existing Fragment (destroying its View) and places the new Fragment into the container.
- Use `add()` when keeping existing tab states alive; use `replace()` when swapping full screens.

----

#### B) Android Core Components & IPC - 4H

















