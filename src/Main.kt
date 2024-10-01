/** OOP: Object-Oriented Programming */

fun main() {

    //create object
    // val myPhone = Phone()
    val myPhone = Phone("Apple", 64, 4000)
//    myPhone.brand = "Samsung"
//    myPhone.storage = 128
//    myPhone.batteryLife = 4000

    myPhone.makeCall("123-456-7890")
    myPhone.takePhoto()

    myPhone.brand = "Huawei"
  //  myPhone.batteryLife = 12324

}

//Define class
//class Phone(var brand: String, var storage: Int, var batteryLife: Int) {
//
//
//    //methods
//    fun makeCall(number: String) {
//        println("Calling $number from my $brand phone...")
//    }
//
//    fun takePhoto() {
//        println("Taking a photo with my $brand phone!")
//    }
//
//}

//Secondary constructor
/**class Phone(val brand: String) {
var storage: Int = 64
var batteryLife: Int = 3000

constructor(brand: String, storage: Int, batteryLife: Int) : this(brand) {
this.storage = storage
this.batteryLife = batteryLife
}

fun makeCall(number: String) {
println("Calling $number from my $brand phone...")
}

fun takePhoto() {
println("Taking a photo with my $brand phone!")
}

}
 */


//Visibility modifiers
class Phone(
    var brand: String,
    var storage: Int,
    private var batteryLife: Int
) {

    fun makeCall(number: String) {
        println("Calling $number from my $brand phone... Battery life: $batteryLife%")
    }

    fun takePhoto() {
        println("Taking a photo with my $brand phone!")
    }
}
