package chapter10

object Scala12_Method_03 {
    def main(args: Array[String]): Unit = {
        val list: List[Int] = List(1, 2, 3, 4)

        // 折叠，也可以对集合数据进行简化，获取最终的一条结果
        // fold方法可以传递2个部分的参数，第一个部分表示集合之外的数据
        // 第二部分的参数表示数据进行的逻辑处理
        val i: Int = list.fold(100)(_ + _)
        println(i)

        val i1: Int = list.fold(100)(_ - _)
        println(i1)

        val i2: Int = list.foldLeft(100)(_ - _)
        println(i2)

        // reverse ==> 3,4,2,1
        // foldLeft ==> (((10 - 4) - 3) - 2) - 1
        // foldRight ==> 1 - (2 - (3 - (4 - 10)))
        val i3: Int = list.foldRight(10)(_ - _)
        println(i3)
    }
}
