package com.fengtaisec.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int luckNumber = r.nextInt(1,101);
        while (true){
            System.out.println("请您输入猜测的数据：");
            int guessNumber = sc.nextInt();
            // 判断用户猜测的数字与号码的情况
            if (guessNumber > luckNumber){
                System.out.println("猜大了");
            }else if(guessNumber < luckNumber){
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
                break; // 结束死循环
            }
        }
    }
}
