package chapter03

object Scala01_Operator {
    def main(args: Array[String]): Unit = {
        var i: Byte = 1
        //        scala中没有++运算符
        //        i++

        //        Error:(6, 11) value += is not a member of Byte
        //  Expression does not convert to assignment because:
        //    type mismatch;
        //     found   : Int
        //     required: Byte
        //    expansion: i = i.+(1)
        //        i += 1
        println(i)
    }
}
