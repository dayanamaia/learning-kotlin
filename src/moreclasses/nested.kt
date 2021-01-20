package moreclasses

class Computer(val processrModel: String) {

    inner class Memory(val level: Int) {

        fun getMemory(): Int {
            println(processrModel)
            return 70
        }
    }
}

fun main() {
    val m1: Computer.Memory = Computer("Intel").Memory(8)
    m1.getMemory()
}
