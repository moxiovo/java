package com.fengtaisec.d1_algorithm;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};

        System.out.println(binarySearch(arr, 81));
        System.out.println(Arrays.binarySearch(arr, 81));
    }

    public static int binarySearch(int[] arr,int data){
        // 定义两个变量 一个在左边 一个在右边
        int left = 0;
        int right = arr.length - 1;

        // 定义一个循环折半
        while (left <= right){
            // 每次折半都算出中间位置处的索引
            int middle = (left + right) / 2;
            // 判断当前要找的元素值与中间位置处的元素值的大小情况
            if (data < arr[middle]){
                // 往左边找 截止位置 = 中间位置 - 1
                right = middle - 1;

            }else if (data > arr[middle]){
                // 往右边找 起始位置 = 中间位置 + 1
                left = middle + 1;
            }else {
                // 中间位置处的元素值正好就是要找的元素值
                return middle;
            }
        }
        return -1; // 特殊结果 数组中不存在该数据

    }
}
