package com.fengtaisec.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        // for循环批量产生数据
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------");
        // 求1-100的数据和
        // 变量用于求和
        int sum = 0; // 0
        for (int i = 0; i <= 100; i++) {
            sum += i; //累加给sum
        }
        System.out.println(sum);

        // 定义一个循环产生1-100的奇数
        int sum2 = 0; // 0
        for (int i = 1; i <= 100; i+=2) {
            sum2 += i; //累加给sum 1 3 5 7 9
        }
        System.out.println("1-100之间的奇数和:" + sum2);

        System.out.println("--------------------------------");
        // 方法2：
        int sum3 = 0;
        for (int i = 1; i <=100 ; i++) {
            if (i % 2 == 0){
                sum3 += i;
            }
        }
        System.out.println("奇数和为：" + sum3);
    }
}
