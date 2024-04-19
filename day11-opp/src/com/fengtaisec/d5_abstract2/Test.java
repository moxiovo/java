package com.fengtaisec.d5_abstract2;

public class Test {
    public static void main(String[] args) {
        // 掌握抽象的好处
        Animal a = new Cat();
        a.setName("叮当猫");
        a.cry();

        Animal b = new Dog();
        b.setName("叮当狗");
        b.cry();
    }
}
