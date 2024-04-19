package com.fengtaisec.d3_final;

public class Test {
    // 常量 final修饰的成员变量，建议名称全部大写，多个单词下划线连接
    public static final String SCHOOL_NAME = "test";
    private final String name = "猪八戒"; // 没有意义（实例变量）
    public static void main(String[] args) {
        // 认识final的作用
        // final可以修饰变量：总规则：有且仅能赋值一次
        // 变量
        //  局部变量
        //  成员变量 静态成员变量 实例成员变量

        final int a;
        a = 12;
        // a = 13;// 第二次赋值

        final double r = 3.14;
        // r = 0.1

        final int[] arr = {11, 22, 33};
        arr[1] = 222;

        // schoolName = "test2";
        Test t = new Test();
//        t.name = "孙悟空";
    }
    public static void buy(final double z){
//        z = 0.1;
    }
}
final class A{} // 工具类上加final
// class B extends A{}

// final修饰方法，方法不能被重写了
class C{
    public final void test(){

    }
}
class D extends C{
//    @Override
//    public void test(){
//
//    }
}
