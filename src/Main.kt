//FUNCTION IN KOTLIN

fun main() {
    greet()

    greet("Mawuli")
    greet("Daniel")

    val result = square(8)
    println(result)

    greetUser()
    greetUser("Mawuli")

    greet( "Mawuli", "Good morning!")
    greet(name = "Mawuli", message = "Good morning!")
    greet(message = "Happy coding", name = "Daniel!")

   val result2= square(5)
    println(result2)
}

/*
*
*
* fun functionName() {
    // function body
}
*/

fun greet() {
    println("Hello world!")
}

// parameters
fun greet(name: String) {
    println("Hello $name")
}


//return type
//fun square(number: Int): Int {
//    return number * number
//}


//default value
fun greetUser(name: String = "there") {
    println("Hello, $name")
}

//name arguement
fun greet(name: String, message: String) {
    println("$message, $name!")
}


//single-expression functions
fun square(number: Int) = number * number
