package com.fengtaisec.d11_extends_feature;

public class Test {
    public static void main(String[] args) {
        A a = new A();

        B b = new B();

    }
}

class A {}//extends Object{}
class B extends A{}
// class C extends B{}, A{}
// java是单继承的：一个类只能继承一个父类；java中的类不支持多继承，但是支持多层继承
// object类是java所有类的祖宗
class D extends B{}

