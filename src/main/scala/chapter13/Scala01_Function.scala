package chapter13

// 偏函数
//  基本介绍
//      1) 在对某个条件，而不是所有情况进行逻辑进行时，使用偏函数是一个不错的选择
//      2) 将包在大括号内的一组case语句封装为函数，我们称之为偏函数，它只对会作用于指定类型的参数或指定范围值的参数实施计算，超出范围的值会忽略
//      3) 偏函数在Scala中是一个特质PartialFunction

//  小结
//      1) 使用构建特质的实现类（使用的方式是PartialFunction的匿名子类）
//      2) PartialFunction 是个特质（看源码）
//      3) 构建偏函数时，参数形式 [Any, Int]是泛型，第一个表示传入参数类型，第二个表示返回参数
//      4) 当使用偏函数时，会遍历集合的所有元素，编译器执行流程时先执行IsDefinedAt()，如果是true，就会执行apply，构建一个新的Int对象返回
//      5) 执行isDefinedAt() 为false就会过滤掉这个元素，即不构建新的Int对象
//      6) map函数不支持偏函数，因为map底层的机制就是所有循环遍历，无法过滤处理原来集合的函数
//      7) collect函数支持偏函数
object Scala01_Function {
    def main(args: Array[String]): Unit = {
        val list: List[Any] = List(1, 2, 3, 4, "abc")
        val list1: List[AnyVal] = list.map(x => {
            if (x.isInstanceOf[Int]) {
                x.asInstanceOf[Int] + 1
            }
        }).filter(x => x.isInstanceOf[Int])
        println("list1 = " + list1)

        def f1(n: Any): Boolean = {
            n.isInstanceOf[Int]
        }

        def f2(n: Any): Int = {
            n.asInstanceOf[Int]
        }

        def f3(n: Int): Int = {
            n + 1
        }

        val list2: List[Int] = list.filter(f1).map(f2).map(f3)
        println("list2 = " + list2)

        // 偏函数
        val addOne3: PartialFunction[Any, Int] with Object {
            def apply(v1: Any): Int

            def isDefinedAt(x: Any): Boolean
        } = new PartialFunction[Any, Int] {
            override def isDefinedAt(x: Any): Boolean = {
                if (x.isInstanceOf[Int]) true
                else false
            }

            override def apply(v1: Any): Int = {
                v1.asInstanceOf[Int] + 1
            }
        }

        // 收集，collect方法支持偏函数，收集满足条件的数据
        val list3: List[Int] = list.collect(addOne3)

        // Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        //	at scala.runtime.BoxesRunTime.unboxToInt(BoxesRunTime.java:99)
        //	at chapter13.Scala01_Function$$anon$1.apply(Scala01_Function.scala:45)
        //	at chapter13.Scala01_Function$$anon$1.apply(Scala01_Function.scala:38)
        //	at scala.collection.immutable.List.map(List.scala:250)
        //	at chapter13.Scala01_Function$.main(Scala01_Function.scala:51)
        //	at chapter13.Scala01_Function.main(Scala01_Function.scala)

        // map方法不能执行偏函数操作，因为必须对所有的数据进行转换，不能只对其中一部分数据进行操作
        //        val list4: List[Int] = list.map(addOne3)
        println("list3 = " + list3)

        // 偏函数 简化形式1
        def f4: PartialFunction[Any, Int] = {
            case i: Int => i + 1
        }

        val list4 = list.collect(f4)
        println("list4 = " + list4)

        // 偏函数 简化形式2
        val list5: List[Int] = list.collect { case i: Int => i + 1 }
        println("list5 = " + list5)
    }
}
