1. What is Jetpack Compose, and how does it differ from traditional View-based development?
-> It is morden and declarative ui toolkit that simplifies ui development by using kotlin code insted of traditional XML
-> It allows UI build in composable function


2. How would you create a simple UI using Jetpack Compose?
-> By defining composable function and using composable UI function like Text(), Button()


3. Explain the concept of @Composable in Jetpack Compose.
-> Composable is Annotation in Jetpack compose which makes normal function to composable function
-> Such function use to define composable UI


4. How do you manage state in Jetpack Compose?
-> By using remember function to store value across recomposition
-> By using ViewModel
-> By using LiveData
-> By using StateFlow


5. What are remember and mutableStateOf, and when would you use them?
-> remember: function which store and retain compose state even after recompose
-> mutableStateOf: create state variable which change state to recompose ui


6.What are some advantages of using Jetpack Compose?
-> Declarative UI, Dynamic UI, Less complexity, ...


7. How would you handle lists in Jetpack Compose?
-> LazyRow, LazyCol


8. What are Modifiers in Jetpack Compose, and how are they used?
-> Modifier is allow modify the UI element, set size, padding, circle, click event etc


9. How do you handle navigation in Jetpack Compose?
-> By NavHost and NavController, defines composable for navigating UI


10. How do you use animations in Jetpack Compose?
-> it provides verias type of animation to state, like animateDpAsState(), animateVisibility()
