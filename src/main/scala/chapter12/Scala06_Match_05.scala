package chapter12

// 样例类
// 1) 样例类仍然是类
// 2) 样例类采用case关键字进行声明
// 3) 样例类是为样式匹配（对象）而优化的类
// 4) 构造器中的每一个参数都成为val--除非它被显示地声明为var
// 5) 在样例类对应的伴生对象中提供apply方法让你不用new关键字就能够造出相应的对象
// 6) 提供unapply方法让模式匹配可以工作
// 7) 将自动生成toString、equals、hashCode和copy方法（有点类似模板类，直接给生成，供程序员使用）
// 8) 除上诉外，样例类和其他类完全一样。你可以添加方法和字段，扩展它们


object Scala06_Match_05 {
    def main(args: Array[String]): Unit = {
        //        val dollar: Dollar = new Dollar(1.0)
        //        val dollar: Dollar = Dollar(1.0)
        //        println(dollar.value)


        for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
            val result = amt match {
                case Dollar(v) => "$" + v
                case Currency(v, u) => v + " " + u
                case CurrencyXXX(v, u) => v + " " + u
                case NoAmount => ""
            }
            println(amt + ": " + result)
        }
    }
}

// 密封类
// 1) 如果想让case类的所有子类都必须在声明该类的相同的源文件中定义，可以将样例类的通用超类声明为sealed，这个超类称之为密封类
// 2) 密封就是不能在其他文件中定义子类
abstract sealed class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, string: String) extends Amount

case class CurrencyXXX(value: Double, string: String) extends Amount

case object NoAmount extends Amount


