package chapter04

import scala.util.control.Breaks

// import static
import scala.util.control.Breaks._

object Scala03_For {
    def main(args: Array[String]): Unit = {
        //        // Scala for循环
        //        // <- 规定好 to 规定
        //        for (i <- 1 to 5) {
        //            println(s"i = ${i}")
        //        }

        //        for (i <- 1 until 5) {
        //            println(s"i = ${i}")
        //        }


        //        // Range(start, end)范围对象，等同于until，不包含end
        //        for (i <- Range(0, 5, 2)) {
        //            println(s"i = ${i}")
        //        }


        // 嵌套循环
        for (i <- 1 to 3) {
            for (j <- 1 until (3)) {
                println(s"${i} = ${j}")
            }
        }

        // 等价于上面的写法
        for (i <- 1 to 3; j <- 1 until (3)) {
            println(s"${i} = ${j}")
        }

        // 杨辉三角
        // 九层妖塔
        /*
                 *
                ***
               *****
         */

        for (i <- Range(1, 18, 2)) {
            val j = (18 - i) / 2
            println(" " * j + "*" * i)
        }

        for (i <- Range(1, 18, 2); j = (18 - i) / 2) {
            println(" " * j + "*" * i)
        }

        // for循环中可以使用一行代码声明变量，也可以使用多行来声明变量，但是需要将小括号变成大括号
        // 表达式如果有多行代码，那么可以采用大括号
        for {i <- Range(1, 18, 2)
             j = (18 - i) / 2} {
            println(" " * j + "*" * i)
        }

        // 循环守卫
        // 所谓的守卫其实就是增加条件判断，如果条件成立，那么执行循环体，如果条件不成立，跳过循环体
        // 类似与Java continue语法
        // scala中没有continue关键字
        for (i <- 1 to 5 if i % 2 == 0) {
            println(s"${i}")
        }

        // 默认情况下，for循环的返回值为()
        val unit = for (1 <- 1 to 3) "abc"

        // 特殊情况，采用yield关键字，可以将每一次循环的结果保存到集合中返回。
        // 对遍历过程中处理的结果返回到一个新Vector集合中，使用yield关键字
        val value = for (i <- 1 to 10) yield i * 2

        // Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
        println(value)

        // 中断循环
        // java中采用break关键字
        // scala中没有break关键字,但是可以采用对象的方式进行中断

        // try {} catch
        Breaks.breakable {
            for (i <- 1 to 10) {
                if (i == 5) {
                    Breaks.break()
                }
                println(s"${i}")
            }
        }
        println("循环结束")

        breakable {
            for (i <- 1 to 10) {
                if (i == 5) {
                    //                    break()
                    break
                }
                println(s"${i}")
            }
        }
        println("循环结束")
    }
}
