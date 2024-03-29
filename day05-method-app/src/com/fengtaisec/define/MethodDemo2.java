package com.fengtaisec.define;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 掌握按照方法解决实际业务需求不同，设计出合理的方法来解决问题
        // 打印多行helloworld.
        printHelloWorld(3);

        System.out.println("------------------");

        printHelloWorld(6);
    }
    // void 表示无返回值的意思，无参数，无返回值的方法
    // 有参数无返回值的方法，有参数无返回值
    public static void printHelloWorld(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("HelloWorld");
        }
    }
}
