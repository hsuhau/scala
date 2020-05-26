package chapter060708

// 构造方法
object Scala05_Method_02 {
    def main(args: Array[String]): Unit = {
        // 创建对象
//        val user = new User09("hsuhau")
//        println(user)

        val s = new User09()
        println(s)
    }
}

// Scala中构造方法分为两类：主构造方法和辅助构造方法
// Scala构建对象可以通过辅助构造方法创建，但是必须调用主构造方法
// Scala是完全面向函数的语言，所以类也是函数
// 类是函数，可以使用小括号作为函数的参数列表
// 类所代表的函数其实就是这个类的构造方法
// 默认情况下，Scala也是给类提供无参构造方法，所以小括号可以省略
// 在类的后面声明的构造方法就是主构造方法
// 在主构造方法中声明的构造方法就是辅助构造方法
class User09(string: String) {
    // 类体 & 构造方法体
    println("主构造方法")
    println(string)

    def this(s:String, ss:String){
        this(s)
        println("辅助构造方法2")
    }

    // 声明辅助构造方法，方法名为this
    // 构造方法调用其他的构造方法时，应该保证被调用的构造方法已经声明过
    def this(){
        this("辅助构造方法1", "cool")
    }


}
