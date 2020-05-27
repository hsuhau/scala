package chapter10

object Scala07_Method {
    def main(args: Array[String]): Unit = {
        // 集合常用的方法
        val list = List(1, 2, 3, 4, 3, 3, 2)

        // 求和
        println("sum = " + list.sum)
        // 最大值
        println("max = " + list.max)
        // 最小值
        println("min = " + list.min)
        // 乘积
        println("product = " + list.product)
        // 反转（无排序）
        println("reverse = " + list.reverse)
        val intToInts: Map[Int, List[Int]] = list.groupBy(x => x)
        println("group by = " + intToInts)
        val intToInts1: Map[Int, List[Int]] = list.groupBy(x => x % 2)
        intToInts1.foreach(println)

        val stringList: List[String] = List("11", "12", "13", "22", "23")
        val stringToStrings: Map[String, List[String]] = stringList.groupBy(s => {
            s.substring(0, 1)
        })
        println("group by first char = ")
        stringToStrings.foreach(println)

        // 排序（按照指定的规则进行排序）
        val sortList: List[Int] = list.sortBy(x => x)
        println(sortList.mkString(","))

        val sortStringList: List[String] = stringList.sortBy(s => s.substring(1))
        println(sortStringList.mkString(","))

        // 升序 小 => 大
        val sortInts: List[Int] = list.sortWith((x, y) => {
            x > y
        })
        val sortInts1: List[Int] = list.sortWith((x, y) => {
            x < y
        })
        println(sortInts.mkString(","))
        println(sortInts1.mkString(","))

        val sortStringList1: List[String] = stringList.sortWith((left, right) => {
            left.substring(1) > right.substring(1)
        })
        println(sortStringList1.mkString(","))

        // 迭代
        for (elem <- list.iterator) {
            println(elem)
        }

        // 映射（转换）
        // 将指定的我数据结构转换为其他数据结构
        // x => (x, x)
        val tuples: List[(Int, Int)] = list.map(x => {
            (x, 1)
        })
        val intToTuples: Map[Int, List[(Int, Int)]] = tuples.groupBy(t => t._1)
        println(intToTuples.mkString(","))
        // (k, list) => (k, size)
        val intToInts2: Map[Int, Int] = intToTuples.map(t => (t._1, t._2.size))
        println(intToInts2.mkString(","))

        // 获取集合的前n个
        val takeList: List[Int] = list.take(10)
        println(takeList.mkString(","))

        // WordCount
        // 对集合中的但此字符串进行统计的出现的次数，并且按照出现次数降序排列，取前三名
        val wordList: List[String] = List("Hello", "Scala", "Hello", "World", "Hbase", "Hadoop", "Kafka", "Scala", "World")
        // 1) 将相同的单词放置在一起（分组）
        //   (Hello, List("Hello", "Hello"))
        val wordToListMap: Map[String, List[String]] = wordList.groupBy(world => world)
        // 2) 将数据结构进行转换
        // (Hello, worldCount = list.size)
        val wordToCountMap: Map[String, Int] = wordToListMap.map(t => {
            (t._1, t._2.size)
        })
        // 3) 将数据进行排序（降序）
        val sortList1: List[(String, Int)] = wordToCountMap.toList.sortWith((left, right) => {
            left._2 > right._2
        })
        // 4) 取排序完成后的前三条数据
        val resultList: List[(String, Int)] = sortList1.take(3)
        println(resultList.mkString(","))

        // 扁平化操作
        // 将一个整体中的内容拆成一个一个的个体
        val lineList = List("Hello World", "Hello Scala", "Hello Hadoop")
        println(lineList)

        // list => 1,2,3
        val flatMapList: List[String] = lineList.flatMap(x => x.split(" "))
        println(flatMapList)
        val resultList1: List[(String, Int)] = flatMapList.groupBy(word => word).map(t => (t._1, t._2.size)).toList.sortWith((l, r) => {
            l._2 > r._2
        })
        println(resultList1.mkString(","))
    }

}
