package com.fengtaisec.d12_inner_class1;

public class Outer {
    private int age = 99;
    public static String a;
    // 成员内部类
    public class Inner{
        private String name;
        public static String schoolName; // JDK16 才开始支持定义静态成员的
        private int age = 88;

        public void test(){
            System.out.println(age);
            System.out.println(a);

            int age = 66;
            // 66
            // 88
            // 99
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Outer.this.age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public void test2(){
        System.out.println(age);
        System.out.println(a);
    }
}
