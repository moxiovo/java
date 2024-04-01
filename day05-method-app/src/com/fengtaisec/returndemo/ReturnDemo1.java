package com.fengtaisec.returndemo;

public class ReturnDemo1 {
    // 掌握return单独使用，无返回值方法中的应用：跳出并立即结束方法的执行
    public static void main(String[] args) {
        System.out.println("程序开始~~~");
        chu(10, 0);
        System.out.println("程序结束~~~");

    }
    public static void chu(int a, int b){
        if (b == 0){
            System.out.println("除数不能为 0");
            return;
        }
        int c = a / b;
        System.out.println(c);
    }
}
