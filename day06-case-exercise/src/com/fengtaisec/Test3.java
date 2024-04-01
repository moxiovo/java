package com.fengtaisec;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 完成评委打分案例
        System.out.println(getAverageScore(6));
    }
    public static double getAverageScore(int number){
        // 1.定义一个动态初始化数组
        int[] scores = new int[number];
        // score = [0, 0, 0, 0, 0, 0]

        // 2、遍历数组的每个位置
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            // i = 0 1 2 3 4 5
            System.out.println("请输入录入第" + (i + 1) + "评委的分数");
            int score = sc.nextInt();
            scores[i] = score;
        }
        // 从数组中计算出总分和最高分和最低分
        int sum = 0;
        int min = scores[0];
        int max = scores[0];

        for (int i = 0; i < scores.length; i++) {
            // i = 0 1 2 3 4 5
            int score = scores[i];
            // 求和
            sum += score;
            // 求最大值
            if (score > max){
                max = score;
            }
            // 求最小值
            if(score < min){
                min = score;
            }
        }
        return 1.0 * (sum - min - max) / (number - 2);
    }
}
