package chapter12

// 模式匹配
object Scala01_Match {
    def main(args: Array[String]): Unit = {
        // 下划线：_
        // 模式匹配的其他场合，系统给变量赋初始值，类似于Java导包的星号，给类起别名，隐藏类，代替方法的参数，可以让函数不执行
        val list: List[List[Int]] = List(List(1, 2), List(3, 4))
        val flatList: List[Int] = list.flatMap(x => x)
        println(flatList)

        def test(list: List[Int]): List[Int] = {
            list
        }

        val flatList1: List[Int] = list.flatMap(test)
        println(flatList1)

        val flatList2: List[Int] = list.flatMap(test _)
        println(flatList2)

        val words: List[String] = List("Hello Scala", "Hello World")
        //        val wordList: List[String] = words.flatMap(s => s.split(" "))
        val wordList: List[String] = words.flatMap(_.split(" "))
        println(wordList)

        val oper = '#'
        val n1 = 20
        val n2 = 20
        var res = 0
        oper match {
            case '+' => res = n1 + n2
            case '-' => res = n1 - n2
            case '*' => res = n1 * n2
            case '/' => res = n1 / n2
            //Exception in thread "main" scala.MatchError: # (of class java.lang.Character)
            //	at chapter12.Scala01_Match$.main(Scala01_Match.scala:31)
            //	at chapter12.Scala01_Match.main(Scala01_Match.scala)

            //            case _ => println("oper error")
        }
        println("res = " + res)
    }
}
