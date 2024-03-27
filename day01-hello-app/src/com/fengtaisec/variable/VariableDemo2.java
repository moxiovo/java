package com.fengtaisec.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 1、变量要先声明在使用
        int age = 18;
        System.out.println(age);
        // 2、变量是什么类型，就应该存什么数据

        double a = 9.8;
        // 3、b变量从定义到}的截止范围内有效
        {
            int a1 = 19;
            /*int a = 23;*/
            System.out.println(a);
        }
        System.out.println(age);
        // 4、变量定义的时候可以不赋值，但在使用时变量必须有值
        int number;
        number = 200;
        System.out.println(number);
        //  数字开头，关键字作为名字不可以 #
        int a2 = 20;
        int studyNumber;

    }
}
