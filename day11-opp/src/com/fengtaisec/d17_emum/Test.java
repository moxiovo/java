package com.fengtaisec.d17_emum;

public class Test {
    public static void main(String[] args) {
        // 掌握枚举的应用场景：做信息标志和分类
        // 软编码
//        check(Constant.BOY);
//        check(1);
        check(Constant2.BOY);
        // 枚举

    }

    public static void check(Constant2 sex){
        switch (sex){
            case BOY:
                System.out.println("展示一些游戏信息");
                break;
            case GIRL:
                System.out.println("展示一些好看的信息");
                break;
        }
    }
}
