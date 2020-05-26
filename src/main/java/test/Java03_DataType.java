package test;

public class Java03_DataType {
    public static void main(String[] args) {
        // 方法重载：参数列表（类型，个数，顺序）不同
        byte b = 10;
        test(b);
    }

     // 基本类型考虑的是类型的精度

//    private static void test(byte b) {
//        System.out.println("bbbbbbbbbbbb");
//    }

//    private static void test(short b) {
//        System.out.println("sssssssssss");
//    }

    // 16位，但是没有办法表达复数
    private static void test(char b) {
        System.out.println("ccccccccccc");
    }

    private static void test(int i) {
        System.out.println("iiiiii");
    }
}
