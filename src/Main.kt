/**
 * COLLECTIONS: Array vs Lists
 */

fun main() {
    /** 1. Arrays in Kotlin */

    // create arrays


    val fruits = arrayOf<String>("Banana", "pawpaw", "orange", "guava")

    var age = 24

    var scores = arrayOf<Int>(90, 59, 69, 100, 88)

//print(scores)

    //accessing element in array
    val mark = scores[2]
    println(mark)

    println(scores[4])


    //updating value of element
    scores[3] = 98

    println(scores[3])


    /** 2. List in Kotlin */


    //immutable list - read-only operations

    //create immutable list
    var rainbowColors = listOf("Red", "Blue", "Violet", "Green", "Yellow", "Purple", "Pink")

    //accessing element
    println(rainbowColors[3])

//    rainbowColors.remove("")

    //mutable list
    val daysOfWeek = mutableListOf("Monday", "Tuesday", "Wednesday")

    //Before
    println("Before")

    for (day in daysOfWeek) {

        println(day)
    }

    //access
    // println(  daysOfWeek[1])

    //adding items
    daysOfWeek.add("Friday")
    daysOfWeek.remove("Monday")
    daysOfWeek.removeAt(2)

    println("After")
    for (day in daysOfWeek) {

        println(day)
    }


//Size
    val numOfItems = scores.size
    println("Number of items: $numOfItems")

    //iterate collection
     daysOfWeek.forEach{ day ->
         println(day)

     }

    //contains
 val isAvailable =    daysOfWeek.contains("Tuesday")
    println(isAvailable)




}
