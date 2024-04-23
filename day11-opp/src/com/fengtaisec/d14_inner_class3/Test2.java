package com.fengtaisec.d14_inner_class3;

public class Test2 {
    public static void main(String[] args) {
        // 掌握匿名的常见使用场景
//        Swimming s1 = new Swimming(){
//            @Override
//            public void swim() {
//                System.out.println("dog swim");
//            }
//        };
//        go(s1);
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("dog swim");
            }
        });
    }

    // 设计一个方法可以接受swimming接口的一切实现类对象进来参加游泳比赛
    public static void go(Swimming s){
        System.out.println("开始~~~~~~~~~~~~~~~~~~~~");
        s.swim();
        System.out.println("结束~~~~");

    }
}


interface Swimming{
    void swim();
}
