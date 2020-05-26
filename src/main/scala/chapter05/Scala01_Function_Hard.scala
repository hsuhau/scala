package chapter05

object Scala01_Function_Hard {
    def main(args: Array[String]): Unit = {

        // 函数式编程 - 扩展
        // 可变参数
        def test(name: String*): Unit = {
            println(name)
        }

        // 调用函数时，可传多个参数，也可以

        // ArraySeq(hsu, hau, xu)
        test("hsu", "hau", "xu")
        // List()
        test()

        // 默认参数
        // 如果希望函数中某一个参数使用默认值，那么可以在声明是直接赋初始值
        def test1(name:String, age:Int = 20):Unit = {
            println(s"${name} - ${age}")
        }
        test1("macarena")
    }

}
