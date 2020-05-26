package chapter060708

// 构造方法参数
object Scala_Class_02 {
    def main(args: Array[String]): Unit = {
        val user = new User12("hsuhau")
        println(user.name)
    }
}


// 类构造方法的参数的作用域默认为整个类的主体，但是如果想要参数作为属性来使用，可以采用特殊方式声明:var，val
class User12(var name: String) {
//    var name: String = "hsuhau"
}
