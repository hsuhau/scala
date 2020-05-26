package chapter02

object Scala02_DataType_02 {
    def main(args: Array[String]): Unit = {
//        var s: Short = 5
//        Error:(6, 14) type mismatch;
        // found   : Int
        // required: Short
        //        s = s-2
//        println(s)


        val s:String = "123"
        println(s.toInt)

        val i = 1
        val ss = i + ""
        println(ss)

        var sss:String = "abc"
        sss = "12.5"
//        println(sss.toInt)
        println(sss.toDouble)
    }
}
