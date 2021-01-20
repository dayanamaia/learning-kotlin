package moreclasses

import java.lang.Exception

class Car(val model: String, val maxSpeed: Int) {
    var currentSpeed: Int = 0
        set(value) {
            if (value > maxSpeed) {
                throw Exception("speed higher than allowed")
            } else {
                field = value
            }
        }

    get() {
        return field
    }

}

fun main() {
    val c1 = Car("fusca", 110)
    c1.currentSpeed = 80

    println(c1.currentSpeed)
    println(c1.model)
}