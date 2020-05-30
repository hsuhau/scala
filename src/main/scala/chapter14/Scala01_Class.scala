package chapter14

object Scala01_Class {
    def main(args: Array[String]): Unit = {
        //        test[Person](new Person)
        test[Child](new Child)

        // Error:(7, 14) type arguments [chapter14.Child] do not conform to method test1's type parameter bounds [T >: chapter14.User]
        //        test1[Child](new  Child)
//        test1[Child](new Child)
    }

    // <: 表示泛型的上限，所以传递数据时，应该为子类或当前类
    // >: 表示泛型的下限，和Java不太一样，所以传递数据时，什么都可以传递
    def test[T <: User](t: T): Unit = {
        println(t)
    }

    def test1[T >: User](t: T): Unit = {
        println(t)
    }
}

class Person {

}

class User extends Person {

}

class Child extends User {

}
