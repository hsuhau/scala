package chapter10

import scala.collection.mutable

object Scala05_Map {
    def main(args: Array[String]): Unit = {
        // Map集合：K-V对
        // hashmap.put("k", "v")
        // Scala中k-v对数据采用特殊的方式声明
        val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
        println(map.mkString(","))
        // 增加数据，key相同则覆盖
        val map1: Map[String, Int] = map + ("d" -> 4)
        println(map1.mkString(","))
        println(map == map1)
        // 删除数据
        val map2: Map[String, Int] = map - ("b")
        println(map2.mkString(","))
        // 修改数据
        val map3: Map[String, Int] = map.updated("b", 5)
        println(map3.mkString(","))
        // 循环遍历
        // Scala为了防止集合出现空指针问题，提供了一个特殊的类：Option，有两个特殊的对象：Some, None
        // 如果确实没有获取到数据，为了不出现异常，Option类提供了有默认值的方法
        println(map.get("b").get)
        println(map.get("f").getOrElse(0))

        // 可变Map集合
        val mmap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
        //        mmap.
    }

}
