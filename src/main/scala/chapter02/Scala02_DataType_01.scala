package chapter02

/**
 * 值类型转换
 * 强制类型转换
 * 1) 当进行数据的从大->小，就需要使用到强制转换
 * 2）强制符号只针对于最近的操作数有效，往往会使用小括号提升优先级
 * 3）Char类型可以保存Int的常量值，但不能保存Int的变量值，需要强转
 * 4）Byte和Short类型在进行运算时，当作Int类型转换
 */
object Scala02_DataType_01 {
    def main(args: Array[String]): Unit = {
        val i: Int = 10
        // val d: Double = i
        val d = i.toDouble
        println(d.toInt)

        // Unit类型用来标识过程，也就是没有明确返回值的函数。
        // 由此可见，Unit类似与Java中的void，Unit只有一个实例对象，()
        println()

        // Null类只有一个实例对象，null，类似于java中null引用。
        // null可以赋值给任意引用类型（AnyRef），但是不能赋值给值类型（AnyVal：比如Int，Float，Char，Boolean，Long，Double，Byte，Short）
        val s: String = null
        println(s)

        //Error:(19, 23) an expression of type Null is ineligible for implicit conversion
        //        val ii :Int = null
        //        println(null)


    }

    def function1(): Nothing = {
        throw new Exception
    }
}
