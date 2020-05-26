package chapter060708

object Scala07_Interface_03 {
    def main(args: Array[String]): Unit = {
        val mysql = new MySQL()
        mysql.insert()
    }
}

// 特质和父类没有关系，之和当前混入的类有关系，所以，在调用时，父类先执行，然后当前混入的特质再执行，然后当前类再执行

// 如果父类混入了相同的特质，那么特制的代码只会执行一遍
trait Operate {
    def insert(): Unit ={
        println("插入数据")
    }
}

// 特质可以继承其他的特质
// 特质重写父特质的方法
trait DB extends Operate{
    println("DB..........")
    override def insert(): Unit = {
        print("向数据库")
        super.insert()
    }
}

trait File extends Operate{
    println("File..........")
    override def insert(): Unit = {
        print("向文件")
        super[Operate].insert()
    }
}


// 多特质混入时，代码执行顺序为从左到右，如果有父特质，会优先执行
// 多特质混入时，方法调用的顺序从右到左
// 特质中的super关键字不是指代父特质，指代的是上一级特质
// 如果希望super指向父特质，需要增加特殊操作：super[特质]
// Java中的接口可以在Scala中当成特质来用
//class MySQL extends File with DB{
//
//}

//
class MySQL extends DB with File with Serializable{

}


