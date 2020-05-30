package chapter12

// 匹配数组
// 基本介绍
// 1) Array(0)匹配值一个元素且为0的数组
// 2) Array(x,y)匹配数据有两个元素，并将两个元素赋值为x和y。当然可以依次类推Array(x,y,z)匹配数组有三个元素的
// 3) Array(0,_*)匹配数组以0开始
object Scala03_Match_02 {
    def main(args: Array[String]): Unit = {
        val a = 5
        val obj = if (a == 1) 1
        else if (a == 2) "2"
        else if (a == 3) BigInt(3)
        else if (a == 4) Map("aa" -> 1)
        else if (a == 5) Map(1 -> "aa")
        else if (a == 6) Array(1, 2, 3)
        else if (a == 7) Array("aa", 1)
        else if (a == 8) Array("aa")

        val result = obj match {
            case a: Int => a
            case b: Map[String, Int] => "对象是一个字符串-数字的Map集合"
            // 类型匹配时，泛型是不起作用的
            case c: Map[Int, String] => "对象是一个数字-字符串的Map集合"
            case d: Array[String] => "对象是一个字符串数组"
            case e: Array[Int] => "对象是一个数字数组"
            case f: BigInt => Int.MaxValue
            case g: String => "对象是一个字符串"
                // 如果case _ 出现如下情况（忽略匹配的变量值），则表示隐藏变量名，即不使用，而不是表示默认匹配
            case _ => "啥也不是"
        }
        println(result)
    }
}
