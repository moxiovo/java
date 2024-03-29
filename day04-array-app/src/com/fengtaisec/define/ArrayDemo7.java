package com.fengtaisec.define;

public class ArrayDemo7 {
    public static void main(String[] args) {
        // 认识多个变量指向同一个数组对象的形式，并掌握其注意事项
        int[] arr1 = {11, 22, 33};

        // 把int类型的数组变量arr1赋值给int类型的数组变量arr2
        int[] arr2 = arr1;

        System.out.println(arr1);
        System.out.println(arr2);

        arr2[1] = 99;
        System.out.println(arr1[1]);
        // 指向相同的内存地址
        // 如果某个数组变量存储的地址是null，那么该变量将不指向任何数组对象
        arr2 = null; // 拿到的数组变量中存储的值是null
        System.out.println(arr2);
        System.out.println(arr1);
//        System.out.println(arr2.length); // 空指针异常
        // 多个数组变存储的为同一个数组对象的地址
        // 多个变量修改的都是同一个数组对象中的数据
        // null代表没有指向数组对象
        // NullPointerExceotion
    }
}
