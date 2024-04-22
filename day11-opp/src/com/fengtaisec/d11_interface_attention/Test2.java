package com.fengtaisec.d11_interface_attention;

public class Test2 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.run();

    }
}
// 一个接口继承多个接口，如果多个接口中存在方法签名冲突，此时不支持多继承
interface I {
    void test1();
}

interface J {
    String test1();
}

//    interface K extends I, J{
//
//    }
// 一个类实现多个接口，如果多个接口中存在方法签名冲突
//    class E implements I, J{
//
//}
// 一个类继承了父类又同时实现接口，父类和接口有同名的默认方法，优先用父类
class Fu {
    public void run() {
        System.out.println("==父类的方法执行了==");
    }
}

interface IT {
    default void run() {
        System.out.println("==接口IT的方法执行了==");
    }
}

class Zi extends Fu implements IT {

}
// 一个类实现了多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
interface It1{
    default void test(){
        System.out.println("IT1");
    }
}
interface It2{
    default void test(){
        System.out.println("IT2");
    }
}
class N implements It1, It2{
    @Override
    public void test() {
        It1.super.test();
    }
}
