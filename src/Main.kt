/**
 *  Operators and Expression
 */


fun main() {

//OPERATORS
    val total = 100 + 50 // literal values
    val result = 20 + total // variable

    /**
     *  TYPES OF OPERATORS
     *  ---------------------
     *  1. Arithmetic operators
     *  2. Assignment operators
     *  3. Comparison operators
     *  4. Logical operators
     */

    /**
     * KOTLIN ARITHMETIC OPERATORS
     *  Addition (+):        Adds two numbers.
     *  Subtraction (-):     Subtracts one number from another.
     *  Multiplication (*):  Multiplies two numbers.
     *  Division (/):        Divides one number by another.
     *  Modulo (%):          Returns the remainder of a division.
     *
     */


    val applePrice = 20
    val orangePrice = 4
    val fruitPrice = applePrice + orangePrice
    println(fruitPrice)

    val differencInPrice = applePrice - orangePrice
    println(differencInPrice    )

    val remainder = applePrice % orangePrice
    println(remainder)

    /**
     * KOTLIN ASSIGNMENT OPERATOR
     *    =   Assign values to variables
     */












    /**
     * KOTLIN COMPARISON OPERATORS
     *  Equal to (==) ==
     *  Not equal to (!=)
     *  Greater than (>)
     *  Less than (<)
     *  Greater than or equal to (>=)
     *  Less than or equal to (<=)
     */


    val person1Age = 25
    val person2Age = 30

    val check = person1Age == person2Age
    println(check)
    val check1 = person1Age != person2Age


    // println("Is person 1 the same age as person 2? ${person1Age == person2Age}")          // false
    //  println("Is person 1 not the same age as person 2? ${person1Age != person2Age}")      // true
//    println("Is person 1 older than person 2? ${person1Age > person2Age}")                // false
//    println("Is person 1 younger or the same age as person 2? ${person1Age <= person2Age}") // true







    /**
     *  KOTLIN LOGICAL OPERATORS
     *   And (&&) - Returns true if both statements are true
     *   Or (||) - Returns true if one of the statements is true
     *   Not (!) - Reverse the result, returns false if the result is true
     */

    val isSunny = true
    val isWeekend = false

    println("Should I go outside? ${isSunny && isWeekend}")  // false
    println("Can I stay inside? ${!isSunny || !isWeekend}")  // true



    //String template
    //    $

    val language = "Kotlin"
    val human = "Einstein"
    println("Hello ${person1Age + person2Age}! Can we be friends?")

    val tax = 4+7

    println("Hello world!")

}