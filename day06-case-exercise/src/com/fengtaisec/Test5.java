package com.fengtaisec;

public class Test5 {
    public static void main(String[] args) {
        // 掌握数组拷贝 ,创建出一个一模一样的数组
        int[] arr = {11, 22, 33};
        int[] arr2 = copy(arr); // 指向拷贝完成的新数组对象
        printArray(arr2);

        // 不是拷贝数组
//        int [] arr3 = arr;
//        arr3[1] = 666;
//        System.out.println(arr[1]);
        arr2[1] = 666;
        System.out.println(arr[1]);
    }
    public static int[] copy(int[] arr){
        // arr = [11, 22, 33]
        // 创建一个长度一样的整形数组
        int[] arr2 = new int[arr.length];
        // 2、把原数组的元素值赋值给新数组
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        return arr2;
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.print("]");
    }
}
