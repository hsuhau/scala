package chapter060708

// 接口
// Scala中没有接口（interface）的概念，有特质（trait）的概念，类似于接口
object Scala07_Interface {
    def main(args: Array[String]): Unit = {
        val user = new User13()
        println(user)
    }
}

// 声明特质
trait TestTrait13 {

}

trait TestTrait13_1 {

}
class Person13{

}

// 特质可以继承的，所以使用extends关键字
// 如果类继承多个特质，采用with连接
// 如果类同时存在父类和特质，依然采用继承方式，但是继承的是父类，连接(混入)特质
class User13 extends Person13 with TestTrait13 with TestTrait13_1 {

}