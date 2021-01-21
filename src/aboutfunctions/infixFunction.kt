package aboutfunctions

class Person(val name: String) {
    infix fun isName(value: String): Boolean {
        return value == name
    }
}

infix fun Int.isHalfOf (value: Int) = value / 2 == this

fun main() {
    10.isHalfOf(20)
    10 isHalfOf 20

    val person1 = Person("Dayana")
    person1 isName "Dayana"

}