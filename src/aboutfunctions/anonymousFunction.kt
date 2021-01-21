package aboutfunctions


fun main() {
    operator(1, 2, fun (n1: Int, n2: Int): Int {
        val sum = n1 + n2
        println("total: $sum")

        return sum
    })
}

