package chapter060708

import chapter060708.test.Emp

// 面向对象
// Scala是一个完全面向对象的语言
object Scala01_Object {
    def main(args: Array[String]): Unit = {

        // 创建类的对象
        val user: User = new User()

        // 调用对象的属性或方法
        user.usrName = "hsuhau"
        println(user.usrName)

        val ttt = new Emp
    }
}

class User {

    // 类的主体内容 ==> 类体

    // 声明属性
    var usrName: String = _

    var age: Int = _

    def login(): Boolean = {
        true
    }
}
