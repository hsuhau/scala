package chapter060708

// import用于导入类
// import可以导入一个包中的所有的类，采用下划线代替星号
//import java.util._
// import导入相同包中的多个类,采用大括号进行包含处理
//import java.util.{ArrayList, Date, List}

//Error:(18, 24) reference to Date is ambiguous;
//it is imported twice in the same scope by
//import java.util.Date
//and import java.sql.Date
//        val data = new Date()

// import可以采用特殊的方式来隐藏指定的类：{类名=>_}
//import java.sql.{Date => _}
//import java.util.Date

// import可以导包
import java.util


object Scala03_Import {
    def main(args: Array[String]): Unit = {
// import可以在任意的地方使用
//        import java.util.Date
//        val data = new Date()
//        List list = new ArrayList()
//        new util.Dat()
    }


}
