
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            riskyTask()
        } catch (e: Exception) {
            println("Caught exception: ${e.message}")
        }
    }
    job.join()
}

suspend fun riskyTask() {
    delay(500L)
    throw RuntimeException("Something went wrong")
}
