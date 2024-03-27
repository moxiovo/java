package com.fengtaisec.variable;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 掌握自增自减运算符的使用
        int a = 10;
        // a++; // a = a + 1
        ++a;
        System.out.println(a);

        // a--; // a = a - 1
        --a;
        System.out.println(a);

//        System.out.println(2++); //自增自减只能操作变量不能操作字面量

        System.out.println("--------------------------------------------");
        int i = 10;
        int rs = ++i; // 先加后用
        System.out.println(rs);
        System.out.println(i);

        int j = 10;
        int rs2 = j++; // 先用后加
        System.out.println(j);
        System.out.println(rs2);
        // 只能操作变量，不能操作字面量
        // 单独使用：放在前后没有区别
        // 非单独使用：在变量后先使用变量，在进行变量自增自减

        System.out.println("----------------------------------------");
        int m = 5;
        int n = 3;
        // m 5 6 5 4
        // n 3 4 3
        //            6  - 5  +  5   - 4  +  4  +  3 = 9
        int result = ++m - --m + m-- - ++n + n-- + 3;
        /*System.out.println(result);
        System.out.println(m);
        System.out.println(n);*/

        int c = 10;
        int d = 5;
        // c 11  12 11
        // d 4 5
        //        10  + 12 -   4  -  5  + 1 + 12
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(c);
        System.out.println(d);
        System.out.println(rs3);

    }
}
