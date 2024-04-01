package com.fengtaisec.parameter;

public class MethodTest3 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
        // 完成打印int类型的数组内容。

        int[] arr2 = null;
        printArray(arr2);

        int[] arr3 = {};
        printArray(arr3);
    }
    public static void printArray(int[] arr){
        if (arr == null){
            System.out.println(arr); // null
            return; // 跳出当前方法
        }
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ",");
//            }
            System.out.print(i == arr.length - 1? arr[i] : arr[i] + ", "); // 三元运算符
        }
        System.out.println("]");
    }
}
