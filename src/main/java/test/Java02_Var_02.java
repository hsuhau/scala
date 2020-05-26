package test;

import java.lang.reflect.Field;

public class Java02_Var_02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 字面量
        // final String name = "hsuhau";
//        int i = 10;
//        String, StringBuilder, StringBuffer
        // String 不可变字符串
        String s = " a b ";
//        s.trim(); // new String
//        System.out.println("!" + s + "!");

        Field value = s.getClass().getDeclaredField("value");
        value.setAccessible(true);
        char[] chars = ((char[]) value.get(s));
        chars[2] = 'd';
        System.out.println(s);


        // 没有short add, byte add指令，因为指令是ASCII码，只有255个，所以统一 int add
        short ss = 10;
        byte b = 10;
//        ss = ss + b;
    }
}
