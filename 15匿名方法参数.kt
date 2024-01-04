fun main() {

    val blessingFunction : (String) -> String = { name ->
        val holiday : String = "New Year"
        "$name, Happy $holiday"
    }

    println(blessingFunction("Laner"))

}