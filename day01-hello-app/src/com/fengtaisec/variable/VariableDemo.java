package com.fengtaisec.variable;

public class VariableDemo {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(age);
        // double 小数类型
        double score = 99.5;
        System.out.println(score);
        System.out.println("---------------------------------------------");

        // 使用变量的好处，便于扩展和维护
        int number = 666;

        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        // 变量存在内存当中，数据可以被替换

        // 变量的特点可以被替换
        int age2 = 18;
        System.out.println(age2);

        age2 = 19;
        System.out.println(age2);

        age2 = age2 + 1;
        System.out.println(age2);

        System.out.println("---------------------------------------------");

        // 需求：钱包有9.5元，收到了10元红包，又发出了5月红包

        double money = 9.5;
        System.out.println(money);
        money = money + 10;
        System.out.println(money);
        money = money - 5;
        System.out.println(money);
    }
}
