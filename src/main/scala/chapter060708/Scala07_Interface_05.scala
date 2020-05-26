package chapter060708

object Scala07_Interface_05 {
    def main(args: Array[String]): Unit = {
        // 动态混入，扩展性非常强
        val mysql = new MySQL18
        mysql.getMessage
    }
}


// 特质可以继承类
//trait Operate18 extends Exception {
//    def insert(): Unit = {
//        println("插入数据")
//        this.getMessage
//    }
//}

trait Operate18 {
    this: Exception =>
    def insert(): Unit = {
        println("插入数据")
        this.getMessage
    }
}

class MySQL18 extends Exception with Operate18 {

}


