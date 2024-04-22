package com.fengtaisec.d10_interface_jdk8;

public interface A {
    /**
     * 默认方法：必须使用default修饰，默认会被public修饰
     * 实例方法：对象的方法，必须使用实现类的对象来访问
     */
    default void test1(){
        System.out.println("===默认方法===");
        test2();
    }

    /** 私有方法：必须使用private修饰(JDK 9 才开始支持)
     *  实例方法：对象的方法
     */
    private void test2(){
        System.out.println("==私有方法==");
    }

    /** 静态方法：必须使用static修饰,默认使用public修饰
     *
     */
    static void test3(){
        System.out.println("==静态方法==");
    }

    void test4();
    void test5();
    default void test6(){

    }
}
