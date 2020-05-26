package chapter05

object Scala01_Function_02 {
    def main(args: Array[String]): Unit = {

        // scala可以采用自动判断功能来简化函数的声明

        // 如果函数声明时，明确无返回值Unit，那么即使函数体中有return也不起作用
        def test(): Unit = {
            //            println("hello macarena")
            return "macarena"
        }

        println(test())


        // 如果将函数体中的最后一行代码进行返回，那么return关键字可以省略
        // 如果可以根据函数的最后一行代码推断类型，那么函数返回值类型可以省略
        def test1() = {
            //            return "macarena"
            "macarena"
            "macarena1"
            //            println("xxx")
        }

        println(test1())

        // 如果函数体中只有一行代码，大括号可以省略
        def test2() = "macarena2"

        println(test2())

        // 如果函数体中没有参数列表，小括号可以省略
        // 如果函数小括号省略，那么访问函数时不能增加小括号
        // 声明函数必须要增加def
        def test3 = "macarena3"

        val testVal = "macarena3"

        //        Error:(36, 22) not enough arguments for method apply: (i: Int): Char in class StringOps.
        //        Unspecified value parameter i.
        //        println(test3
        //        ())
        println(test3)

        // 如果明确函数没有返回值，那么等号可以省略，省略后，编译器不会将函数体最后一行代码作为返回值
        // 如果函数没有参数列表，但是没有省略小括号，调用时可加可不加
        def test4() {
            "zhangsan"
        }

        println(test4)


        // 匿名函数
        ()->{println("xxxx")}
    }
}
