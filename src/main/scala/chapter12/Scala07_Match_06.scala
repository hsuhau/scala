package chapter12

// case语句的中置（缀）表达式
// 基本介绍
// 什么是中置表达式？1+2，这就是中置表达式。如果unapply方法产生一个元组，你可以在case语句中使用中置表达式。比如可以匹配一个List序列
object Scala07_Match_06 {
    def main(args: Array[String]): Unit = {
        var list = List(1, 3, 5, 9)
        println(list match {
            case first :: second :: rest => println(first + "**" + second + "**" + rest)
            case _ => println("匹配不到")
        })
    }
}
