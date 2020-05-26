package chapter02

/**
 * 变量
 */
object Scala01_Var {

    // 在方法的外部声明的变量如果采用val关键字，等同于使用final修饰
    val sex: String = "男"

    def main(args: Array[String]): Unit = {
        // java 局部变量
        // int i = 10;

        // scala 声明变量
        //
        // var 变量名称 : 变量类型 = 变量的值
        // var name: String = "hsuhau"
        // scala声明变量必须显式的初始化
        // name = "hsuhau"

        var age: Int = 10
        age = 20

        //        var c: Char = 'C'
        //        var b: Boolean = false

        //使用val声明的变量的值无法修改
        val name: String = "hsu"
        //        name = "cool"
    }
}
