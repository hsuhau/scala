package chapter04

/**
 * 嵌套分支
 * 基本介绍
 * 在一个分支结构中由完整的嵌套了另一个完整的分支结构，
 * 里面的分支的结构称为内层，分支外面的分支结构称为外层分支。嵌套分支不要超过3层。
 */
object Scala02_Exp {
    def main(args: Array[String]): Unit = {
        val flag = false
        // true String false Unit 于是Any
        val value = if (flag) {
            // 该行会被忽略
            "abc"
            //最后一行当成返回值
            println("abc")
        } else {
            "bbb"
        }
        println(value)

        // 使用if else模拟三元运算符
        // String s = flag ? "a" : "b"
        val str = if (flag) "a" else "b"
        println(str)

        val result = if (flag) {
            1
        }
        println(result)
    }
}
