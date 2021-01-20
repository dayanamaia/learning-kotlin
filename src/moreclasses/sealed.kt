package moreclasses

sealed class Result {
    class Success(val message: String) : Result()
    class Error(val message: String, val errorCode: Int) : Result()
}

class Repo {
    fun execute() : Result {
        // return Result.Error("error")
        return Result.Success("okay")
    }
}

fun main () {
    val r1 = Repo()
    val result: Result = r1.execute()

    when (result) {
        is Result.Success -> {
            println("ok!")
        }
        is Result.Error -> {
            println("error!")
        }
    }
}
