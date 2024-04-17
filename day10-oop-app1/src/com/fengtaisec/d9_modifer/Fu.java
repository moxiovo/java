package com.fengtaisec.d9_modifer;

public class Fu {
    // 私有：只能在本类访问
    private void privateMethod(){
        System.out.println("==private==");
    }
    // 缺省：本类，同一个包下的类
    void method(){
        System.out.println("==缺省==");
    }
    // protected ：本类 同一个包下的类，任意包下的子类
    protected void protectedMethod(){
        System.out.println("==protected==");
    }
    // public：本类 同一个包下的类，任意包下的子类 任意包下的任意类
    public void publicMethod(){
        System.out.println("==public==");
    }
    public void test(){
        privateMethod();
        method();
        protectedMethod();
        publicMethod();
    }
}
