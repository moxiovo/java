package com.fengtaisec.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random num = new Random();
        for (int i = 1; i <= 20; i++) {
            int data = num.nextInt(10) ;// 减加法
            System.out.println(data);
        }
        System.out.println("----------------------------");

        for (int i = 1; i <= 20; i++) {
            int data2 = num.nextInt(10) + 1;
            System.out.println(data2);
        }
        System.out.println("----------------------------");
        for (int i = 1; i <= 20; i++) {
            int data3 = num.nextInt(15) + 3;
            System.out.println(data3);
        }
        System.out.println("----------------------------");
        for (int i = 1; i <=20; i++) {
            int data4 = num.nextInt(100,121);
            System.out.println(data4);
        }
    }
}
