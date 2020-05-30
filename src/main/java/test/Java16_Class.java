package test;

import chapter060708.Student;

import java.util.ArrayList;
import java.util.List;

public class Java16_Class {
    public static void main(String[] args) {
        // 所谓的泛型，其实就是对类型约束
        List<String> stringList = new ArrayList<>();
        stringList.add("string");
        String s = stringList.get(0);

        List list = new ArrayList();
        list.add(1);
//        int i = list.get(0);

        // java中的泛型 不变性
//        List<Person16> personList1 = new ArrayList<User16>();
//        List<Person16> personList2 = new ArrayList<Object>();
        List<Person17> personList3 = new ArrayList<>();
        personList3.add(new User16());
        System.out.println(personList3);


        // 泛型的作用域，对声明泛型后的逻辑操作进行类型的约束，对之前的操作约束不了
        List list1 = new ArrayList();
        list1.add(new Student());
        List<Person17> personList4 = list1;

        // 此处打印不考虑类型
        System.out.println(personList4);

        // 此处打印需要转换类型
        for (Person17 person16 : personList4) {
            System.out.println(person16);
        }
        // Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to test.Person16
        //	at test.Java16_Class.main(Java16_Class.java:30)

    }
}

class Person16 {

}

class User16 extends Person17 {

}
