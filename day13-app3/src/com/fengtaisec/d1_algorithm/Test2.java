package com.fengtaisec.d1_algorithm;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1};
        // 控制选择几轮
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
