/** OOP: Inheritance */

fun main() {


}

open class Phone(val brand: String, var batteryLife: Int) {

    open fun makeCall(number: String) {
        println("Calling $number from $brand phone...")
    }
}

//class SmartPhone(brand: String, batteryLife: Int, val operatingSystem: String) : Phone(brand, batteryLife) {
//
//    fun installApp(appName: String) {
//        println("Installing $appName on $brand smartphone with $operatingSystem.")
//    }
//}

class FeaturePhone(brand: String, batteryLife: Int) : Phone(brand, batteryLife) {

    fun sendTextMessage(number: String, message: String) {
        println("Sending '$message' to $number from $brand feature phone.")
    }
}


//class SmartPhone(
//    brand: String, batteryLife: Int, val operatingSystem: String
//) : Phone(brand, batteryLife) {
//
//    override fun makeCall(number: String) {
//        println("Making a VoIP call to $number using $operatingSystem on a $brand smartphone.")
//    }
//
//    fun installApp(appName: String) {
//        println("Installing $appName on $brand smartphone with $operatingSystem.")
//    }
//}


//Abstract class
abstract class Device(val brand: String) {

    abstract fun powerOn()

    fun info() {

        println("This is a $brand device.")

    }
}

class Tablet(brand: String) : Device(brand) {
    override fun powerOn() {
        println("Powering on the $brand tablet.")
    }

}

// Interfaces
interface Chargeable {
    fun charge()
}

class SmartPhone(
    brand: String, batteryLife: Int,
    operatingSystem: String
) : Phone(brand, batteryLife), Chargeable {

    override fun charge() {
        println("Charging the $brand smartphone.")
    }
}
