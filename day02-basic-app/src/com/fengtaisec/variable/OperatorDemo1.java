package com.fengtaisec.variable;

public class OperatorDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b); // 20
        System.out.println(a / b); // 5
        int c = 5;
        int d = 2;
        System.out.println(1.0 * c / d); // 2
        System.out.println(1.0 * 5 / 2);
        System.out.println(a % b);
        System.out.println(c % b);

        System.out.println("----------------------------------------------------");

        // 掌握使用 + 符号做连接符
        int a2 = 5;
        System.out.println("abc" + a2); // "abc5"
        System.out.println(a2 + 5);
        System.out.println("fengtaisec" + a2 + 'a');
        System.out.println(a2 + 'a' + "fengtaisec"); // 97 + 5
        // + 与字符串会被当成连接符，结果还是字符串
        // 能算则算，不能算就在一起
    }
}
