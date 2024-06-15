
import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        withTimeout(2000L) {
            longRunningTask()
        }
    } catch (e: TimeoutCancellationException) {
        println("Task timed out")
    }
}

suspend fun longRunningTask() {
    delay(3000L)
    println("Task completed")
}
