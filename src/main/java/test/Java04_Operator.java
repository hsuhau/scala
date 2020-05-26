package test;

public class Java04_Operator {
    public static void main(String[] args) {
        // 运算
        int i = 0;
//        int j = i++; // j = 0, i = 1
//        int k = ++i; // i =2, j = 0, k = 2
//        System.out.println(i + " = " + j + " = " + k);

        // 赋值运算符是等号右边的计算结果给左边
        //在'i++'更改的值是不会被使用的
        // Inspection info: Points out cases where a variable value is never used after its assignment, i.e.:  - the variable never gets read after assignment OR  - the value is always overwritten with another assignment before the next variable read OR  - the variable initializer is redundant (for one of the above two reasons)
        i = i++;
        System.out.println("i = " + i);
        i = ++i;
        System.out.println("i = " + i);


        byte b = 1;
//        b = b + 1;
        b += 1;
        System.out.println("b = " + b);
    }
}
