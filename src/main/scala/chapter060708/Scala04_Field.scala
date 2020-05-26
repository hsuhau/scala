package chapter060708

// 类的属性
object Scala04_Field {
    def main(args: Array[String]): Unit = {
        val user = new User04
        // getter
        println(user.username)
        // setter
        user.username = ("hsuhau")

        //        user.email = "hsuhau@foxmail.com"
    }
}

// Scala中也有四种访问权限
// 1) public 2) protected 3) default(package) 4) private
// public 是默认的访问权限，没有关键字
// protected 访问权限只能子类访问，同包访问不了
// private 私有访问权限，只能当前类访问
// 包访问权限需要采用特殊的语法规则：private [包名]

package p1 {
    package p2 {

        class UserP2 {
            var username = "hsuhau"
            private var password = "23445"
            //            protected var email = "hsuhau@foxmail.com"
            //            private[p2] var address = "China"
            //            private[p3] var address = "China"
        }

    }

    package p3 {

        import chapter060708.p1.p2.UserP2

        class EmpP3 extends UserP2 {
            def test(): Unit = {
                val user = new UserP2
                println(user.username)
                //                Error:(31, 29) p3 is not an enclosing class
                //            private[p3] var address = "China"
                //                println(user.address)

                // Error:(45, 30) variable email in class UserP2 cannot be accessed as a member of chapter060708.p1.p2.UserP2 from class EmpP3 in package p3
                // Access to protected variable email not permitted because
                // prefix type chapter060708.p1.p2.UserP2 does not conform to
                // class EmpP3 in package p3 where the access takes place
                //                println(user.email)
                //                println(user.email)
            }
        }

    }

}

class User04 {
    //声明属性
    // scala中给类声明属性，默认为私有的，但是底层提供了公共的setter和getter方法
    var username: String = _

    // 如果给属性增加private修饰符，那么属性无法在外部访问，因为底层生成的setter和getter方法都是私有的
    private var age: Int = _

    // 如果声明的属性使用val，那么属性是私有的，并且使用final修饰，底层只提供getter方法，而没有setter方法
    //    val email: String = _
}
