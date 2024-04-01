package com.fengtaisec.overload;

public class MethodTest2 {
    public static void main(String[] args) {
        // 掌握 方法重载的应用场景
        fire();
        fire("米国", 999);

    }

    public static void fire() {
        fire("岛国");
    }

    public static void fire(String country) {
        fire(country, 1);
    }

    public static void fire(String country, int number) {
        System.out.println("发射了" + number + "枚武器给" + country);
    }
}
