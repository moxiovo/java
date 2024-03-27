package com.fengtaisec.variable;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 导包动作:一般不需要我们自己做，idea工作会自动帮我们导
        // 抄写代码：得到一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);

        // 3、开始调用sc功能，来接受用户键盘输入的数据
        System.out.println("请您输入您的年龄：");
        int age = sc.nextInt(); // 执行到这里，会等待用户输入一个整数，直到用户按了回车键，才会拿到数据
        System.out.println("您的年龄是：" + age);

        System.out.println("请输入您的名字：");
        String name = sc.next(); // 执行到这里等待用户输入字符串
        System.out.println(name + "欢迎您进入系统~~");

    }
}
