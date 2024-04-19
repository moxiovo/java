package com.fengtaisec.d14_extends_constructor;

class F{
//    public F(){
//        System.out.println("==父类F的无参数构造器执行了==");
//    }
//}
    public F(String name, int age){
        // 没有无参数构造器了
        // 先调用父类的构造器再执行自己
    }
}

class Z extends F{
    public Z(){
        super("播妞", 17); // 默认存在的
        System.out.println("==子类Z的无参数构造器执行了==");
    }
    public Z(String name){
        super("播妞", 17); // 默认存在的
        System.out.println("==子类Z的有参数构造器执行了==");
    }
}


public class Test {
    public static void main(String[] args) {
        // 认知子类构造器的特点，再掌握这个特点的应用场景
        Z z = new Z();
        Z z2 = new Z("播妞");

    }
}
