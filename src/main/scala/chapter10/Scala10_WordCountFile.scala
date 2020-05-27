package chapter10

import scala.io.Source

object Scala10_WordCountFile {
    def main(args: Array[String]): Unit = {
        // 从文件中获取数据，统计数量
        val list: List[String] = Source.fromFile("in/word.txt").getLines().toList
        println(list)
    }
}
