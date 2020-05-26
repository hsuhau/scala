package chapter02

object Scala01_Var_01 {
    def main(args: Array[String]): Unit = {
        // 能省则省
        // Scala为了让开发过程变得简单，可以将自动推断出来的内容省略
        val userName: String = "hsuhau"
        // 类型推断
        val name = "hsuhau"
        // 类型不可转换
        //        name =true
        val i = 1 + 1
        println(name)
    }

    val dog = new Dog()
    dog.name = "xxx"
    println(dog.name)

    class Dog() {
        var name: String = ""
    }
}

