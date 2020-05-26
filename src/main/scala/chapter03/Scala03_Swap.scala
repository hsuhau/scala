package chapter03

object Scala03_Swap {
    def main(args: Array[String]): Unit = {
        var a = 10
        var b = 20
        println(s"${a} = ${b}")

        a = a + b
        b = a - b
        a = a - b
        println(s"${a} = ${b}")

        a = a ^ b
        b = a ^ b
        a = a ^ b
        println(s"${a} = ${b}")

    }

}
