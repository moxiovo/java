package com.fengtaisec.d8_lambda;

public class LambdaTest1 {
    public static void main(String[] args) {
        // 认识Lambda表达式
//        Animal a = new Animal(){
//            @Override
//            public void run(){
//                System.out.println("狗跑的贼快~~");
//            }
//        };
//        a.run();
        // lambda 不能简化全部匿名内部类的写法，只能简化函数式接口的匿名内部类。
        // 错误的代码
//        Animal a = () -> {
//            System.out.println("狗跑的贼快");
//        };
//        a.run();

//        Swimming s = new Swimming(){
//            @Override
//            public void swim() {
//                System.out.println("学生快乐的游泳~");
//            }
//        };
//        s.swim();

        // lambda 表达式，
        Swimming s = () -> {
            System.out.println("学生快乐的游泳~~~");
        };
        s.swim();
    }
}

interface Swimming{
    void swim();
}

abstract class Animal{
    public abstract void run();
}
