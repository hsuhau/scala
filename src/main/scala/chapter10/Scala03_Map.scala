package chapter10

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala03_Map {
    def main(args: Array[String]): Unit = {
        // 序列 Seq
        // 默认Scala提供的集合都是不可变的(immutable)
        // 不可变集合
        val list: List[Int] = List(1, 2, 3, 4)

        // 通过索引获取数据
        println(list(0))

        // 增加数据
        val list1: List[Int] = list :+ 1
        val list2: List[Int] = 1 +: list
        //        list1.foreach(println)
        println(list1.mkString(","))
        println(list == list1)
        println(list == list2)
        println(list1 == list2)

        val list3: List[Int] = list.++(list1)
        val list4: List[Int] = list ++ list
        println(list3.mkString(","))
        println(list4.mkString(","))

        val list5: List[Int] = list.::(11)
        println(list5.mkString(","))

        // List中的冒号运算符的运算顺序从右到左
        val list6: List[Int] = (7 :: (8 :: (9 :: list)))
        println(list6.mkString(","))

        val list7: List[Any] = 9 :: list1 :: list
        println(list7.mkString(","))

        val list8: List[Int] = 9 :: list1 ::: list
        println(list8.mkString(","))

        // 特殊List集合：空集合
        println(List())
        println(Nil)
        val list9 = 1 :: 2 :: 3 :: Nil
        println(list9.mkString(","))

        // 修改
        val list10: List[Int] = list.updated(2, 5)
        println(list10.mkString(","))

        // 删除数据
        val list11: List[Int] = list.drop(2)
        println(list11.mkString(","))

        // 查询数据
        for (elem <- list) {
            println(elem)
        }

        // 可变集合
        val mlist: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
        mlist.insert(1, 1)
        mlist.update(1, 3)
        mlist.drop(1)
        mlist.remove(1)

        // 集合的属性
        // 头
        println(mlist.head)
        // 尾（除了头以外）
        println(mlist.tail)
        // 最后
        println(mlist.last)
        // 初始化（除了最后一个）
        println(mlist.init)

        // 队列（一定可变）
        val queue: mutable.Queue[Int] = mutable.Queue(1, 2, 3, 4)
        println("add before " + queue)
        queue.enqueue(5)
        println("add after " + queue)
        val i: Int = queue.dequeue()
        println("i = " + i)
        println("delete after " + queue)
    }
}
