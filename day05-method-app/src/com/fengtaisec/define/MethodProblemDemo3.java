package com.fengtaisec.define;

public class MethodProblemDemo3 {
    public static void main(String[] args) {
        // 使用方法时的几个常见问题
        // 类型为void时候，不能使用return返回数据
        // return 语句下，不能编写代码，属于无效的代码
        // 方法不调用就不会执行，传给方法的数据，必须严格匹配方法
        printHelloWorld();
        int rs = sum(10, 20);
        System.out.println(rs);

        // 几种调用方法
        System.out.println(sum(10, 90)); // 1.直接调用输出

        // 直接调用
        sum(100, 200);

        // 调用无返回值的方法只有一种方式，直接调用

        System.out.println();


    }

    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
    public static  void printHelloWorld(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
            // 一个方法不能定义在另一个方法的里面
        }
    }
}
