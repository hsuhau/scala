package chapter03

import scala.io.StdIn

object Scala02_In {
    def main(args: Array[String]): Unit = {
        val line = StdIn.readLine()
        println("line = " + line)
    }

}
