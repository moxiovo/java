package com.fengtaisec.overload;

public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        test();
        test(100);
    }

    public static void test() {
        System.out.println("test1");
    }

    public static void test(int a) { // 重载方法，调用不会冲突
        System.out.println("test2" + " " + a);
    }

    void test(double a) {

    }

    void test(double a, double b) {

    }

    void test(int b, double a) {

    }

    /*void test(int a, double b){ // 不看名字

    }*/
    int test(int a, int b) {
        return a + b;
    }
}
