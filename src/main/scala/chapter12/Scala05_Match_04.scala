package chapter12

// 特殊的模式匹配
object Scala05_Match_04 {
    def main(args: Array[String]): Unit = {
        //        val tuple = (1, 2)
        //        println(tuple._1, tuple._2)

        val (x, y) = (1, 2)
        println(x + " = " + y)

        val (username, age, email) = ("hsuhau", 23, "hsuhau@foxmail.com")
        println("username = " + username)
        println("age = " + age)
        println("email = " + email)


        // 包含两个连续的运算符
        val (q, r) = BigInt(10) /% 3
        println("q = " + q)
        println("r = " + r)

        val list: List[(String, Int)] = List(("a", 1), ("b", 2), ("c", 3))
        for ((k, v) <- list) {
            println(k + "=" + v)
        }
    }
}
// Illegal inheritance from sealed class 'Amount'
//case class CurrencyXXX(value: Double, string: String) extends Amount

