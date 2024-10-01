/**
 * NULL SAFETY
 */

fun main() {

    // Nullability
//    var name :String = "Mawuli"
//   // name = null
//    var username :String?  = null
//     username = "John"
//    username = null


    /** Safe call (?.) */
//    var name : String? = "John"
//    print(name?.length)

    /** Elvis Operator (?:) */
//    var name: String? = null
//    val length = name?.length ?: 0
//    println(length)


    /** Non-null assertion (!!) */

//    var name:String? = "Mawuli"
//    println(name    !!.length)


    /** let scope function (let) */
//    var name: String? = null
//    name?.let { println("hello $name") }


    /** run scope function (run) */
    var name :String? = "mawuli"
    val result = name?.run{
        "Welocome, $this!"
    } ?: "Name is missing"
    println(result)


}
