/** Data classes */

fun main() {

    //1. toString()
    val myUser = User("Mawuli", 30)
    println(myUser.toString())

    //2. equals()
    val user1 = User("Mawuli", 35)
    val user2 = User("Mawuli", 35)

    println(user2 == user1)

    //3. hashCode()


    //4. copy()
    val updatedUser = user1.copy(age = 26)

    println(updatedUser) // Output: User(name=Alice, age=26)

    DatabaseConnection.connect()


    //companion object
    val result = MathUtil.square(4)
    println(result)
}

data class User(val name: String, val age: Int)

object DatabaseConnection {
    fun connect() {
        println("connected to the database!")
    }
}


class MathUtil {
    companion object {
        fun square(x: Int): Int {
            return x * x
        }
    }
}
