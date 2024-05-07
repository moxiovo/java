package com.fengtaisec.d1_algorithm;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1};

        // 定义一个循环控制
        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0  1  2        [5, 2, 3, 1]  次数
            // i = 0 第一           0  1  2       3
            // 定义一个循环控制每轮比较几次
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 判断当前位置的元素值是否大于后一个位置处的元素值 如果大则交换
                //    2        1
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
