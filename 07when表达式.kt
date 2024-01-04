
fun main(args: Array<String>) {

val school = "高中"

// when 表达式(相当于switch case)
val level = when(school){
    "学前班" -> "幼儿"
    "小学" -> "少儿"
    "初中" -> "青少年"
    else -> {
        println("未知")
    }
}

println(level)
/*
未知 kotlin.Unit
*/

}

