package aboutcollections

/*
*   List
*   Array
*   Set
*   Hashmap
* */

fun main() {

    val l1 = listOf(10, 8, 4, 2, 9, 32, 36) // immutable
    val l2 = mutableListOf("London", "Paris", "Helsinki", "Havana") // mutable
    val a1 = arrayListOf<String>() // mutanle

    val s1 = setOf(10, 20, 10) // sets are collections where repetition and order are ignored
    val s2 = mutableSetOf<Int>() // sets are collections where repetition and order are ignored

    val h1 = hashMapOf<String, String>(Pair("key", "value"), Pair("France", "Paris"))

    val m1 = mapOf<String, String>()
    val m2 = mutableMapOf<String, String>()


    l2.add("Valeta")
    a1.add("categoria")
    s2.add(10)
    s2.add(10)

    println(l1)
    println(l2)
    println(a1)

    println(s1.size)
    println(s2.size)
    println(h1)
    println(h1["France"])
}