package test;

public class Java11_Override {
    public static void main(String[] args) {
        AAA aaa = new BBB();

        // 动态绑定机制
        // 成员方法在执行的过程中，JVM会将方法和当前调用对象实际内存进行绑定
        // 属性没有动态绑定机制，属性在哪里声明在哪里使用
        System.out.println(aaa.getI());
    }
}

class AAA {
    public int i = 10;

    public int getI() {
        return i + 10;
    }
}

class BBB extends AAA {
    public int i = 20;

    @Override
    public int getI() {
        return this.i + 20;
    }

//    @Override
//    public int getI() {
//        return super.i + 20;
//    }
}
