package chapter02

/**
 * 标识符的命名规范
 *
 * 标识符概念
 * 1）Scala对各种变量、方法、函数等命名时使用的字符序列称为标识符
 * 2）凡是自己对其名字的地方都叫标识符
 *
 * 标识符的命名规则
 * Scala中的标识符声明，基本和Java是一致的，但是细节上会有所变化
 * 1）首字符为字母，后续字符任意字母和数字，美元符号，可后接下划线_
 * 2）数字不可以开头
 * 3）首字符为操作符 比如+- *\/，后续字符也需要跟操作符，至少一个
 * 4）操作符（比如+-*\/）不能在标识符中间和最后
 * 5）用反引号（飘号）`...`包含的任意字符串，即使是关键字（39个）也可以
 *
 * 标识符命名注意事项
 * 1）包名：尽量采用有意义的包名，简短，有意义
 * 2）变量名、函数名、方法名 采用驼峰法
 *
 * Scala关键字
 * 关键字介绍
 * Scala有39个关键字：
 * . package, import, class, <b>object</b>, <b>trait</b>, extends, <b>with</b>, type, for
 * . private, protected, abstract, <b>sealed</b>, final, <b>implicit</b>, lazy, override
 * . try, catch, finally, throw
 * . if, else, <b>match</b>, case, do, while, for, return, <b>yield</b>
 * . <b>def</b>, <b>val</b>, <b>var</b>
 * . this, super
 * . new
 * . true, false, null
 */

object Scala03_Name {

    def main(args: Array[String]): Unit = {
        //Scala中可以使用特殊符号作为标识符，其实是将特殊符号编译成
        val ++ = "123"
        //        val +-* = 123
        //        val %# = true
        println(++)

        // Scala中的下划线有特殊的用途，不能独立当成变量名来使用
        val _ = "123"
        val a = "abc" + _

        //        Error:(31, 17) missing parameter type for expanded function ((<x$3: error>) => println(x$3))
        //        println(_)

        //        chapter02.Scala03_Name$$$Lambda$3/1282788025@1ef7fe8e
        println(a)

        val int = "123"

        println(int)
    }
}
