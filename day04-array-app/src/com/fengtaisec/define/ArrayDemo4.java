package com.fengtaisec.define;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] money = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
//            System.out.println(money[i]);
//            sum = sum + money[i];
            sum += money[i];
        }
        System.out.println("员工的销售总额：" + sum);
    }
}
