package chapter09

object Scala02_Transform_01 {
    def main(args: Array[String]): Unit = {
        implicit def transform(mysql01: Mysql02): Operate02 = {
            new Operate02
        }

        val mysql01 = new Mysql02
        mysql01.select()
        mysql01.delete()
    }
}

class Mysql02 {
    def select() = {

    }
}

class Operate02 {
    def delete(): Unit = {

    }
}