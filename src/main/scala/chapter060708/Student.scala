package chapter060708

// 伴生类 （成员）
class Student {
    private val sname = "hsuhau"
}

// 伴生对象 (静态)
// 伴生对象可以访问伴生类的私有属性
// 创建伴生类对象，需要提供特殊的方法，实现相应的功能
object Student {
    def apply(name:String): Student = new Student()

    def test() = {
        println(new Student().sname)
    }
}
