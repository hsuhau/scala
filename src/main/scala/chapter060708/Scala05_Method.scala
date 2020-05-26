package chapter060708

// 类的方法
// 所谓的方法，其实就是类中声明的函数，所以声明方式和函数是一样
object Scala05_Method {
    def main(args: Array[String]): Unit = {
        // 创建对象
        val user = new User05
        val str = user.+("xxxxx")
//        user + "xxxxx"
//        1.to(5)
//        1 to 5
        println(str)
        user.login()
    }
}

class User05 {
    // 登陆
    def login(): Unit = {

    }

    def logout(): Boolean = {
        true
    }
}
