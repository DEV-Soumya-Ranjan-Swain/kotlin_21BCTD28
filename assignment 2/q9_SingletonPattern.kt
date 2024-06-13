
object DatabaseConnection {
    init {
        println("DatabaseConnection created")
    }

    fun connect() {
        println("Connected to database")
    }
}

fun main() {
    val connection1 = DatabaseConnection
    val connection2 = DatabaseConnection
    
    connection1.connect()
    connection2.connect()
}