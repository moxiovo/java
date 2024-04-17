package com.fengtaisec.d6_singleInstance;

public class B {
    // 定义一个类的对象，用于存储这个类的一个对象，存储一个对象
    private static B b;
    // 把构造器私有
    private B(){

    }
    // 对外不能创建对象
    // 定义一个类方法，保证第一次调用才创建一个对象，后面调用都会用同一个对象 返回
    public static B getInstance(){
        if (b == null){
            System.out.println("第一次创建对象~");
            b = new B();
        }
        return b;
    }
}
