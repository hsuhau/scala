package chapter10

import scala.collection.mutable

object Scala04_Set {
    def main(args: Array[String]): Unit = {
        // Set集合：无序，不可重复
        // 默认Scala提供的Set集合就是不可变的(immutable)
        val set: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 8, 9)
        println(set.mkString(","))
        // 增加数据
        println(set + 11)
        // 删除数据
        println(set - 3)
        for (elem <- set){
            println(elem)
        }

        // 可变Set集合
        val mset: mutable.Set[Int] = mutable.Set(1, 2, 3, 4, 5)
    }
}
