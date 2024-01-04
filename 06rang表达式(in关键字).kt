const val age : Int = 4
const val num : Int = 20
fun main(args: Array<String>) {
    if(age in 0..3) // 0 ≤ age ≤ 3
    println("婴幼儿")
    else if(age in 4..12) // 4≤ age ≤ 12
    println("少儿")
    else
    println("未知")
    
    if(num !in 20..40)
    println("num 不在20至40范围之内")
}

