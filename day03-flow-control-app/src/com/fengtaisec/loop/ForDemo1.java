package com.fengtaisec.loop;

public class ForDemo1 {
    // 需要掌握for循环的书写格式，并理解其执行流程
    // 打印多行hello world
    /*流程：计算机遇到for循环要开启循环，通过三条代码配合
    首先执行初始化语句
    int i = 0 i = 0 0<3 返回true 计算机会进入到循环
    执行输出第一行helloworld 迭代语句i++
    减少代码的重复编写，灵活控制程序。
    */

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            System.out.println("Hello");
        }
        System.out.println("-------------------------------");
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello2");

        }
        System.out.println("--------------------------------------");
        // 1 3 5 7 9 11
        for (int i = 1; i <= 10; i += 2){
            System.out.println("Hello3");
        }
    }
}
