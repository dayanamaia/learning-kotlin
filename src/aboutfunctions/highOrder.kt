package aboutfunctions

fun operator(x: Int, y: Int, op: (Int, Int) -> Int ): Int {
    return op(x, y)
}

fun sum (x: Int, y: Int) = x + y

fun multiply (x: Int, y: Int) = x * y

fun <T> Iterable<T>.paraCada(op: (T) -> Unit) {
    for (i in this) {
        op(i)
    }
}

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    list.forEach{ println(it) }

    val sumResult = operator(10, 20, ::sum)
    val multResult = operator(10, 20, ::multiply)

    println(sumResult)
    println(multResult)

    val strgList = listOf("test0", "test1", "tes2")
    strgList.paraCada { println(it) }
}
