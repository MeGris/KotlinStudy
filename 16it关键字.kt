fun main() {

//    定义只有一个参数的匿名函数时，可以使用关键字it来表示参数名
//    缺点是当你需要传入两个参数时，it关键字就不能用了
    val blessingFunction : (String) -> String = {
        val holiday : String = "New Year"
        "$it, Happy $holiday"
    }

    println(blessingFunction("Laner"))
//    Laner, Happy New Year

}