package chapter14

object Scala02_Class_01 {
    def main(args: Array[String]): Unit = {
        // 默认情况下，Scala中的泛型和Java一样，不变
        // 在Scala中，为了丰富发行的功能，提供了协变(+)，逆变(-)的类型操作
        val test: Test[User1] = new Test[Child1]
        println(test)

        val ints = List(1, 2, 3, 4)
    }
}

class Person1 {

}

class User1 extends Person1 {

}

class Child1 extends User1 {

}

class Test[+User1]


