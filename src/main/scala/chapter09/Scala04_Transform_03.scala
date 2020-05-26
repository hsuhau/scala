package chapter09

// 隐式类使用有如下几个特点
// 1) 其所带的构造参数有且只能有一个
// 2) 隐式类必须要被定义在”类“或”伴生对象“或”包对象“里，即隐式类不能是顶级的（top-level objects）
// 3) 隐式类不能是case class （case class在后续介绍<b>样例类</b>）
// 4) 作用域内不能有与之相同名称的标识符

// 隐式的转换机会
// 1) 当方法中的参数的类型与目标类型不一致时（二次编译）
// 2) 当对象调用所在类中不存在的方法或成员时，编译器会自动将对象进行隐式转换（根据类型）

// 隐式解析机制
// 即编译器是如何查找到缺失信息的，解析具有如下两种规则：
// 1) 首先会在当前代码作用域下查找隐式实体（隐式方法，隐式类，隐式对象）。
// 2) 如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找。
//    类型的作用域是指与该类型相关联的全部半生模块，一个隐式实体的类型T它的
//    查找方位如下（第二种情况范围广且复杂在使用时，应当尽量避免出现）
//    a) 如果T被定义为T with A with B with C，那么A，B，C都是T的部分，在T的隐式解析过程中，它们的伴生对象就会被搜索。
//    b) 如果T是参数化类型，那么类型参数和与类型参数相关联的部分都算作T的部分，比如List[String]的隐式搜索会搜索List的伴生对象和String的伴生对象
//    c) 如果T是一个单例类型p.T，即T是属于某个p对象内，那么这个p对象也会被搜索。
//    d) 如果T是个类型注入S#T，那么S和T都会被搜索
//

object Scala04_Transform_03 {
    def main(args: Array[String]): Unit = {
        val user04 = new User04()
        user04.insert()
        user04.delete()
    }

    class User04 extends Test {
        def insert(): Unit = {
            println("insert")
        }
    }

    implicit class Person04(u: User04) {
        def delete(): Unit = {
            println("delete")
        }
    }

}

trait Test{

}

object Test{

}
