package com.fengtaisec.define;

public class ArrayTest8 {
    public static void main(String[] args) {

        // 完成数组反转
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // arr[i] arr[j] // 交换
            // 把前一个位置处的值赋值给后一个位置
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
