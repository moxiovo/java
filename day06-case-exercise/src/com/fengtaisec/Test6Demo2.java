package com.fengtaisec;

import java.util.Random;
import java.util.Scanner;

public class Test6Demo2 {
    public static void main(String[] args) {
        int[] array = {9, 666, 180, 520, 9999};
        start(array);

    }
    public static void start(int[] arr){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        // 打乱数组顺序
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            // 定义一个临时变量记录index位置的值
            // int[] array = {9, 666, 180, 520, 9999};
            // arr[i] 为当前位置 9
            // arr[index] = 180
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        // 重新 遍历当前数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入任意内容进行抽奖：");
            sc.next(); // 等按了回车往下走
            System.out.println(arr[i]);
        }
    }
}
