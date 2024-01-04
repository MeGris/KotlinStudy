
fun main(args: Array<String>) {
val name : String = "Laner"
val age : Int = 22

// 写法一：$+变量名
println("我的名字叫 $name ，我今年 $age 岁")

// 写法二：${表达式}
println("是一名 ${if(age in 20..23) "大学生" else "高中生"}")

}

