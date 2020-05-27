package chapter10

object Scala11_Method_02 {
    def main(args: Array[String]): Unit = {
        val list: List[Int] = List(1, 2, 3, 4)
        // 数据减少，不是结果变少
        // 将集合的数据经过逻辑处理后只保留一个结果，具体的结果需要参考逻辑实现

        list.reduce((l, r) => {
            l + r
        })
        val result = list.reduce(_ - _)
        val reduceLeft: Int = list.reduceLeft(_ - _)
        val reduceRight: Int = list.reduceRight(_ - _)
        println(result)
        println(reduceLeft)
        println(reduceRight)
    }
}
