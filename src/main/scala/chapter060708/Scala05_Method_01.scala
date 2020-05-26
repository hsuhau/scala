package chapter060708


// 类的方法
// 所谓的方法，其实就是类中声明的函数，所以声明方式和函数是一样，调用方式上有区别
object Scala05_Method_01 {
    def main(args: Array[String]): Unit = {
        // 采用伴生对象来创建伴生类
        val student = Student("hsuhau")
        // Student.apply
        println(student)
    }
}
