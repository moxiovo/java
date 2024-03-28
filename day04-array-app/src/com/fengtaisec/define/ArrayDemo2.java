package com.fengtaisec.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 目标：掌握数组的访问,数组遍历
        int[] arr = {12, 24, 36};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 修改数组中的数据
        arr [0] = 66;
        arr [2] = 100;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 数组名.length
        System.out.println(arr.length);
        // 数组的最大索引
        System.out.println(arr.length - 1); // 1 - 1 = 0 数组的元素个数大于0
        // 数组的最大索引不代表为最大索引

    }
}
