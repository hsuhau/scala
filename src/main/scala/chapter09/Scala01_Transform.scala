package chapter09

object Scala01_Transform {
    def main(args: Array[String]): Unit = {
        // 自动转换 - 隐式转换
        // scala默认的情况下支持数据类型的自动转换
        // byte -> short -> int -> long
        // scala默认的情况下支持多态语法中的类型自动转换
        // child -> parent -> trait(interface)

        // scala也允许开发人员自定义类型转换规则
        // 将两个无关的类型通过编程手段让它们可以自动转换

        implicit def transform(double: Double): Int = {
            double.toInt
        }

        //在相同的作用域内，不能含有多个相同类型的转换规则
        /* implicit def transform1(double: Double): Int = {
             double.toInt
         } */

        // OCP 开闭原则
        val i: Int = 5.0
        println(i)

    }

}
