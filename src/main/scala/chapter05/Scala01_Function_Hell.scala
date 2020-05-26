package chapter05

object Scala01_Function_Hell {
    def main(args: Array[String]): Unit = {
        // 函数式编程 - 地狱

        //Scala是完全面向函数式编程语言

        // 函数在Scala可以做任何事情
        // 函数可以赋值给变量
        // 函数可以作为函数的参数
        // 函数可以作为函数的返回值

        /*def f(): Unit = {
            println("function")
        }

        def f0() = {
            // 返回函数
            // 直接返回函数，有问题，需要增加特殊符号：下划线
            f _
        }

        f0()()*/


        // 闭包
        // 一个函数在实现逻辑时，将外部的变量引入到函数的内部，改变这个变量的声明周期，称之为闭包
        def f1(i: Int) = {
            def f2(j: Int) = {
                //                println("xxxxx")
                i * j
            }

            f2 _
        }

        println(f1(2))
        println(f1(2)(3))

        // 函数柯里化
        def f3(i: Int)(j: Int): Int = {
            i * j
        }

        println(f3(2)(3))

        // 将函数作为参数传递给另外一个函数，需要采用特殊的声明方式
        // () => Int
        // 参数列表=>返回值类型

        def f4(f: () => Int) = {
            f() + 10
        }

        def f5(): Int = {
            5
        }

        println(f4(f5))


        // 使用匿名函数改善代码
        def f6(f: () => Unit) = {
            f()
        }

        f6(() => {
            println("匿名")
        })
    }

}
