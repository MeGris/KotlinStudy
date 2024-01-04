
fun main(args: Array<String>) {
/* 参数默认值 */
// 如果age不传参age会为默认值为20
userInfo("Laner")
// 如果age传参会覆盖掉原来的默认值20
userInfo("MaGris", 18)

/* 具名传参 */
//假如改函数有多个参数，害怕传错顺序的话可以使用具名传参
userInfo(age=21, name="jinyoo")

}

fun userInfo(name : String, age : Int = 20) {
    println("name: $name , age: $age")
}
