package chapter03

object Scala01_Operator_02 {
    def main(args: Array[String]): Unit = {
        var b = 10
        // 所有的Scala表达式都有结果
//        println(b = 10)
        //        Error:(6, 19) unknown parameter name: b
        //Note that assignments in argument position are no longer allowed since Scala 2.13.
        //To express the assignment expression, wrap it in brackets, e.g., `{ b = ... }`.
        //        println(b = 10)

        println({
            b = 10
        })

        /*
        Error:(6, 15) type mismatch;
                         found   : Unit
                         required: Boolean
                                if (b = 10) {
         */
        //        if (b = 10) {
        //            println("true")
        //        } else {
        //            println("false")
        //        }
    }
}
