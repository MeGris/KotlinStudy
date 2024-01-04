fun main() {
//    变量的类型是一个匿名函数
//    和具名函数不一样，匿名函数不需要 return 关键字来返回数据
//    匿名函数会隐式或自动返回函数体最后一行语句的结果
    val blessingFunction : () -> String
    blessingFunction = {
        val holiday = "New Year."
        "Happy $holiday"
    }

//    另外一种写法
//    val blessingFunction : () -> String = blessingFunction = {
//        val holiday = "New Year."
//        "Happy $holiday"
//    }

    println(blessingFunction())
}