
fun main(args: Array<String>) {
println(userInfo("Laner"))
/*
name: Laner , age: 20
kotlin.Unit
*/
}

fun userInfo(name : String, age : Int = 20) {
    println("name: $name , age: $age")
}
