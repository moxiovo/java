package com.fengtaisec.parameter;

public class MethodTest4 {
    public static void main(String[] args) {
        // 完成判断两个int类型的数组是否一样
        int[] arr1 = {10, 21, 30};
        int[] arr2 = {10, 20, 30};
        System.out.println(equals(arr1, arr2));
    }
    public static boolean equals(int[] arr1, int[] arr2){
        // 问语句
        // 判断arr1和arr2是否为null
        if(arr1 == null && arr2 == null){
            return true;
        }

        // 判断arr1或者arr2是null
        if (arr1 == null || arr2 == null){
            return false;
        }

        // 判断两个数组的长度是否一样
        if (arr1.length != arr2.length){
            return false; // 不相等
        }
        
        // 两个数组的长度是一样的
        // arr1 = [10, 20, 30]
        // arr2 = [10, 20, 30]
        for (int i = 0; i < arr1.length; i++) {
            // 判断当前位置两个数组元素是否不一样，不一样返回false
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
