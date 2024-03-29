package com.fengtaisec.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        // 完成评委打分的案例
        // 1.定义一个动态初始化的数组，存储评委的打分
        // 便于后续扩展，去掉最高分或者最低分
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[6];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您输入当前第" + (i + 1) + "个评委的分数");
            scores[i] = sc.nextDouble();

        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            System.out.println(scores[i]);
        }
        System.out.println("最终得分是：" + sum / scores.length);
    }
}
