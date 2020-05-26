package chapter060708


// Scala中的包声明方式默认和Java是一致的。但是有其他的使用方式
// 1) 在同一个源码文件，可以多次声明
//    声明的类在最后的那个包中
//    源码中的类所在的位置不需要和包路径相同
// 2) Scala中所有的语法都可以嵌套
//    package可以使用小括号，小括号内声明的类在这个包中，之外声明的类不在这个包中
// 3) Scala中可以声明父包和子包，父包中的类，子类可以直接访问，不需要引入，其实就是作用域的概念
// 4) Scala中package可以声明类，但是乌发声明变量和函数（方法）
// 5) Scala为了弥补包的不足，使用了包对象的概念，其中可以声明属性和方法
package test {

    class Emp {
    }

    // 包对象
    package object test {
        val test = "123"

        def test1() {}
    }


    package test1 {

        object Scala02_Package {
            def main(args: Array[String]): Unit = {
                val emp = new Emp
                println(emp)
                //                println("ZZZ")
            }

        }

    }

}
