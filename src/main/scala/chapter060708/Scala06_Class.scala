package chapter060708

// 类
object Scala06_Class {
    def main(args: Array[String]): Unit = {
        val user = new User10
        println(user.email)
    }
}

// 声明类
// 父类，继承
// 类可以声明为抽象的 abstract
abstract class Person10 {
    var name: String = _
    // scala中属性也可以重写，因为属性可以抽象
    // 属性只有声明，没有初始化，那么就是抽象属性
    // 抽象属性在编译为class文件十，不产生属性，但是产生抽象getter方法
    var sex: String

    val email: String = "d"

    // 声明抽象方法，方法只有声明，没有实现，不需要abstract关键字声明
    def test()

    def test1(): Unit = {
        println(email)
    }
}

class User10 extends Person10 {
    // 重写属性，补全属性
    var sex: String = "sex"

    // 属性可以被覆盖，但是不能重写父类var声明的变量
    override val email: String = "hsuhau@foxmail.com"

    // 重写抽象方法，补全方法
    def test(): Unit = {
        println("xxxxxxxxxxxxx")
    }

    // Scala如果子类重写父类（不是抽象的），需要 增加override关键字
    override def test1(): Unit = super.test1()
}