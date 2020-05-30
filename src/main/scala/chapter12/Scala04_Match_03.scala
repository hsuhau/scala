package chapter12

object Scala04_Match_03 {
    def main(args: Array[String]): Unit = {
        for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))) {
            val result = arr match {
                case Array(0) => "0"
                case Array(x, y) => x + " = " + y
                case Array(0, _*) => "以0开头的数组"
                case _ => "什么集合都不是"
            }
            println("result = " + result)
        }

        for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
            val result1 = list match {
                case 0 :: Nil => "0"
                case x :: y :: Nil => x + " " + y
                case 0 :: tail => "0 ..."
                case _ => "something else"
            }
            println("result1 = " + result1)
        }

        // 元组匹配
        for (pair <- Array((0, 1), (1, 0), (2, 1), (1, 0, 2))) {
            val result2 = pair match {
                case (0, _) => "0 ..."
                case (y, 0) => y
                case (a, b) => (b, a)
                case _ => "other"
            }
            println("result2 = " + result2)
        }

        // 对象匹配
        // 1) case中对象的unapply方法（对象提取器）返回Some集合则为匹配成功
        // 2) 返回none集合则为匹配失败
        object Square {
            def unapply(z: Double): Option[Double] = Some(math.sqrt(z))

            def apply(z: Double): Double = z * z
        }

        // 模式匹配使用
        val number: Double = 36.0
        number match {
            case Square(n) => println(n)
            case _ => println("nothing matched")
        }
    }
}
