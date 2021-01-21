package aboutfunctions

fun main() {

    val l1 = { a: Int, b: Int, -> a + b }
    val l2: (Int, Int) -> Int = { numerator, i -> numerator + i }

    operator(10, 20, l1)
    operator(10, 20, l2)

}

