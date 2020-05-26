package chapter060708

object Scala07_Interface_04 {
    def main(args: Array[String]): Unit = {
        // 动态混入，扩展性非常强
        val mysql = new MySQL17() with Operate17
        mysql.insert()
    }
}

trait Operate17 {
    def insert(): Unit = {
        println("插入数据")
    }
}

class MySQL17 {

}


