package chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala02_Array {
    def main(args: Array[String]): Unit = {
        // java数组： int[] ints = new int[3]
        //           ints[0] = 1
        //           int i = ints[0]


        // Scala中的数组，使用Array对象实现，使用中括号声明数组的类型
        // Array[String]
        // Scala可以使用简单的方式创建数组
        // Array可以通过apply方法来创建数组对象
        //        val ints: Array[Int] = Array(1, 2, 3, 4)
        // 访问数组：使用小括号，增加索引的方式来访问数组
        //        println(ints(0))

        // 数组长度
        //        println(ints.length)

        //        ints + "sssssss"

        //        println(ints)

        // 将数组转换为字符串打印出来
        //        println(ints.mkString(","))

        // 将数组中每个元素打印
        //        for (elm <- ints) {
        //            println(elm)
        //        }

        //        def print(i:Int):Unit={
        //            println(i)
        //        }

        // foreach方法会将数组中的每一个元素进行循环遍历，执行指定函数实现逻辑
        //        ints.foreach(print)
        //
        //        ints.foreach((i:Int)=>{println(i)})
        //
        //        ints.foreach({println(_)})
        //
        //        ints.foreach(println(_))
        //
        //        ints.foreach(println)

        // 增加元素
        // 采用方法向数组中增加新的元素，但是不会对原有数组造成影响，而是产生新的数组
        //        val ints1: Array[Int] = ints :+ (5)
        //        val ints2: Array[Int] = ints :+ 5
        //        val ints3: Array[Int] = 5 +: (ints)
        //        println(ints1.mkString(","))
        //        println(ints == ints1)

        // 修改元素
        //        ints.update(0, 0)
        //        println(ints.mkString(","))

        // 可变数组
                val arrayBuffer: ArrayBuffer[Int] = ArrayBuffer(5, 6, 7, 8)
        // 查询值
        //        println(arrayBuffer(0))
        // 修改值
        //        val unit: Unit = arrayBuffer(0) = 9
        // 将数组转换为字符串
        //        println(arrayBuffer.mkString(","))
        // 循环遍历
        //        arrayBuffer.foreach(println)
        // 增加数据
        //        val unit1: Unit = arrayBuffer :+ (9)
        //        val buffer: arrayBuffer.type = arrayBuffer += (10)
        //        val unit2: Unit = buffer
        //        val unit3: Unit = arrayBuffer.insert(1, 9)
        //        arrayBuffer.foreach(println)
        //        buffer.foreach(println)
        //        println(buffer == arrayBuffer)


        // 删除数据
        //        val i: Int = arrayBuffer.remove(1)
        //        println("i = " + i)
        //        val unit4: Unit = arrayBuffer.remove(1, 2)
        //        println(arrayBuffer.mkString(","))

        // 可变数组和不可变数组的转换
        val array: Array[Int] = arrayBuffer.toArray
        val buffer: mutable.Buffer[Int] = arrayBuffer.toBuffer
    }
}
