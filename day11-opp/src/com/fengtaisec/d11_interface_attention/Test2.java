package com.fengtaisec.d11_interface_attention;

public class Test2 {
    public static void main(String[] args) {




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
}
