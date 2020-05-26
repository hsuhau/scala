package chapter060708


// Scala中如果需要从最开始的包中查找类，需要增加绝对路径，使用_root_开头
//import _root_.java.util.HashMap

import _root_.java.util.{HashMap => JavaHashMap}
package java {
    package util {

        class HashMap {

        }

    }

}

object Scala03_Import_01 {
    def main(args: Array[String]): Unit = {
        //        val map = new HashMap
        val map = new JavaHashMap
        //        val map = new java.util.HashMap
        println(map)
    }
}
