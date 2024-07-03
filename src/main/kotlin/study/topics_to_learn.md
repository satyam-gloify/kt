If a class contains all types of Injection i.e constructor, field and method injection, dagger will inject all types in the following sequence :
* 		Constructor
* 		Field
* 		Method
- Inject
- @Singleton - is a design pattern that ensures a class has only one instance and provides a global point of access to that instance
-  @Component- makes Dagger create a graph of dependencies

		@Singleton
		@Component
		interface ApplicationGraph{
			fun userRepo() : UserRepository
			}
- @Inject - Let’s Dagger know how to create instances of this object

		
		Class UserRepository @Inject Constructor(
			private val localDataSource:UserLocalDataSource,
			private val remoteDataSource:UserRemoteDataSource){
			}
Now Dagger knows how to create an instance of UserRepository,
but it doesn't know how to create its dependencies
- 
- // @Inject lets Dagger know how to create instances of these objects
- Class UserLocalDataSource @Inject Constructor(){}
- Class UserRemoteDataSource @Inject Constructor(){} 
- When you build the project, Dagger generates an implementation of the ApplicationGraph interface for you
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- 
- Constraint layout 
- Localisation in arabic and English
- Theme change (theme RRO)
- Corooteens
- Suspend function
- 
- Function Reference Operator ::
- It keyword
- Function Types
- Lambdas
- DaggerAppComponent.builder().build()
- Dependency Injection 
- 
- fun fetchData(completion: (Result) -> Unit) { 
    - // Perform data fetching 
    - val result = fetchFromNetwork() 
    - completion(result) 
- }
- 
	// Usage: fetchData { result -> // Handle result }
https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary


What you'll learn
* Create a NavHost composable to define routes and screens in your app.
* Navigate between screens using a NavHostController.
* Manipulate the back stack to navigate to previous screens.
* Use intents to share data with another app.
* Customize the AppBar, including the title and back button.


- 
- Scope functions
Here is a short guide for choosing scope functions depending on the intended purpose:
* 		Executing a lambda on non-nullable objects: let
* 		Introducing an expression as a variable in local scope: let
* 		Object configuration: apply
* 		Object configuration and computing the result: run
* 		Running statements where an expression is required: non-extension run
* 		Additional effects: also
* 		Grouping function calls on an object: with



* 		How to define a function with lambda syntax.
* 		How to store functions in variables.
* 		How to pass functions as arguments to other functions.
* 		How to return functions from other functions.
* 		How to use nullable function types.
* 		How to make lambda expressions more concise.
* 		What a higher-order function is.
* 		How to use the repeat() function.
    * Unit keyword is like a void in lambda

———————
27-june
- OPEN keyword
- Var and val keyword
- Open class keyword
- Fun keyword
- Nested Class
- inner
- Primary and secondary constructor
- Super / Super@ClassName. / Super<ClassName>
- Class , init{}, field , set(v), get()
- lateinit
- @Inject
- object {}
- class InitOrderDemo(name: String) {
-     val firstProperty = "First property: $name".also(::println)
-     
-     init {
-         println("First initializer block that prints $name")
-     }
-     
-     val secondProperty = "Second property: ${name.length}".also(::println)
-     
-     init {
-         println("Second initializer block that prints ${name.length}")
-     }
- }
—————

open class Base(val name: String) {

    init { println("Initializing a base class") }

    open val size: Int = 
        name.length.also { println("Initializing size in the base class: $it") }
}

class Derived(
    name: String,
    val lastName: String,
) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {

    init { println("Initializing a derived class") }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}




ssr ejs | nextjs


Factory pattern
Solid principle 
 - kotlin
 - 
View holder 
——
Opps concept
DS,

For pillor of opps
Create one project 
Mvvm mvc
@module
What is the use of interface
Hash map

polymorphism



Hello
