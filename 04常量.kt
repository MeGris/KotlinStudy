// const 修饰的变量才叫常量
// 编译时常量只能是常用的基本数据类型：String, Double, Int, Float, Long, Short, Byte, Char, Boolean
const val PI = 3.1415926 // 定义编译时常量

fun main(args: Array<String>) {

// const 不能修饰于局部变量
// error: modifier 'const' is not applicable to 'local variable'
// const val PI = 3.1415926

// 为什么const 常量只能定义在外面呢？
// 答：如果定义在函数内部的话，那就必须先调用函数才能编译const常量，这样何有编译时一说？

}

