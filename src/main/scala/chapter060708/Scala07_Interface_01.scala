package chapter060708

object Scala07_Interface_01 {
    def main(args: Array[String]): Unit = {
        // Java中的接口无法直接构建对象，必须使用实现类
        // Java中的接口是可以声明方法的，早期版本中声明的方法都是抽象，新版本的是可以有默认实现
        // Java中的接口是可以声明属性的，属性值无法修改

        // scala中的特质也无法构建对象
        // scala中的特质是可以执行代码
        // scala特质中的生命的属性和方法都可以在混入的类中调用
        //
        //        new TestTrait14 {}

        val user = new User14
        user.username = "fine"
        println(user.username)
        user.test()
    }
}

trait TestTrait14 {
    var username: String = "hsuhau"

    def test(): Unit = {
        println("test.........")
    }

    // 特质可以声明抽象方法
    def test1()
}

class Person14 {

}

class User14 extends Person14 with TestTrait14 {
    override def test1(): Unit = {
        println("override")
    }
}
