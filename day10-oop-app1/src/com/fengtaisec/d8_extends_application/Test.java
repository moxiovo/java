package com.fengtaisec.d8_extends_application;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("test");
        t.setSkill("Java、Spring");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        t.printInfo();

        // 使用继承可以减少重复代码的编写，提高了代码的复用性。
    }

}
