package com.fengtaisec.define;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest9 {
    public static void main(String[] args) {
        // 完成随机排名
        // 定义一个动态初始化数组用来存储五名员工的工号
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] codes = new int[5]; // [0, 0, 0, 0, 0]

        // 提示用户录入5名员工的工号
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入当前员工" +  (i + 1) + "个工号");
            codes[i] = sc.nextInt();
//            System.out.println(codes[i]);
        }
        for (int i = 0; i < codes.length; i++) {
            // 每遍历到一个数据，都随机一个数组索引范围的值，然后让当前遍历的数据与索引的位置交换。
            int index = r.nextInt(codes.length);

            // 定义一个临时变量记录index位置的值
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
//            System.out.print(codes[i] + " ");
//            System.out.println();
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}
