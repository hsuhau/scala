package test;

import java.util.List;

public class Java10_Access {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 访问权限
        // 所谓的权限其实是方法的提供者和方法的调用者之间关系
        // 方法的提供者：test.A
        // 方法的调用者：test.Java10_Access
        A a = new A();
        // . 从属关系
        // Java10_Access类中的main方法中构建了一个  A，然后调用A中的clone方法
        a.clone();
    }

    public static void test(List list) {

    }
}


class A {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
