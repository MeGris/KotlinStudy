fun main() {

//    无参匿名函数的类型推断写法
    val blessingFunction = {
        val holiday = "New Year"
        "Happy $holiday"
    }

    println(blessingFunction())
//    Happy New Year

//    有参匿名函数的类型推断写法
    val userInfo = {name: String, age: Int ->
        "name: $name, age: $age"
    }

    println(userInfo("Laner", 22))
}