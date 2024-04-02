package com.fengtaisec;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 抢红包案例的实现
        int[] moneys = {9, 666, 888, 520, 99999};
        start(moneys);
    }
    public static void start(int[] moneys){
        // moneys = [9, 666, 888, 520, 99999]
        //           0   1    2    3     4
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < moneys.length; i++) {
            // 提示粉丝抽奖
            System.out.println("输入任意内容进行抽奖：");
            sc.next(); // 等按了回车往下走
            while (true) {
                int index = r.nextInt(moneys.length);
                // 为当前粉丝找出一个随机的红包
                int money = moneys[index];
                if(money != 0){
                    System.out.println("恭喜您，您抽中了" + money);
                    moneys[index] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束~");
    }
}
