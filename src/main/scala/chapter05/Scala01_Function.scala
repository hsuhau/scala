package chapter05

object Scala01_Function {
    def main(args: Array[String]): Unit = {
        // 函数式编程

        // 编程的范式

        // 面向对象：解决问题的时候，将问题拆成一个一个小问题（形成了对象）。分别解决
        // 对象关系：继承，实现，重写，多态

        // 函数式编程关心的是问题的解决方案（封装功能）：重点在于函数（功能）函数的入参，出参

        // 函数式编程重要的就是函数

        // Java中的方法和Scala中的函数都可以进行功能的分装，但是方法必须和类型绑定，但是函数不需要

        // 声明函数

        // Java方法声明
        // public static void test(String s){}

        // Scala函数声明
        // Scala语法非常灵活，在任意的语法中可以声明其他语法规则
        def test(s: String): Unit = {
            // 函数体
            println(s)
        }

        // 调用函数
        test("zhangsan")
    }
}
