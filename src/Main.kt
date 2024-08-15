/**
 *  Control Flow using Conditionals (if-else and when)
 */
fun main() {


    /**
     *1. Syntax of if Statement
     * ***********************
     *
     *   if (condition){
     *      body
     *   }
     */

    val age = 30
    if (age >= 18) println("You are eligible to vote!") else println("You are not eligible to vote!")


    val voterAge = 70
    if (voterAge >= 65) {
        println("You can vote and you are eligible for senior citizen discount!")
    } else if (voterAge >= 18) {
        println("You can vote but  you are not eligible for senior citizen discount!")
    } else {
        println("You can not vote and you are not eligible for senior citizen discount!")
    }


    /**
     * Syntax of if-else Statement
     * ***********************
     *
     *   if (condition){
     *      body1
     *   } else {
     *      body2
     *   }
     */


    val firstNum = 20
    val secondNum = 30
    val max = if (firstNum > secondNum) firstNum else secondNum


    println("The maximum is : $max")


    /**
     *2. Syntax of when Statement
     * ***********************
     *
     *   when (parameter){
     *     condition1 -> body1
     *     condition2 -> body2
     *     condition3 -> body3
     *   }
     */

    val trafficLightColor = "Purple"
    when (trafficLightColor) {
        "Red" -> {
            println("Stop")
            println("Blinking")
        }
        "Yellow" -> println("Go slow")
        "Green" -> println("Go")

        else -> println("Invalid color")
    }


    //when expression
    val action = when(trafficLightColor){
        "Red" -> "Stop"
        "Yellow" -> "Get ready"
        "Green" -> "Go"
        else -> "Invalid color"
    }

    println(action  )


}