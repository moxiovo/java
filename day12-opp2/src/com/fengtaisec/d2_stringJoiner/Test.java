package com.fengtaisec.d2_stringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        // 掌握stringJoiner用法
        StringJoiner s = new StringJoiner(", ", "[", "]"); // 间隔符
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s); // java1, java2, java3

        System.out.println(getArrayData(new int[] {11, 22, 33}));

    }
    public static String getArrayData(int[] arr){
        // 判断arr是否为null
        if (arr == null){
            return null;
        }
        // arr 数组存在 arr = [11, 22, 33]
        StringJoiner s = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i] + "");
        }
        return s.toString();
    }
}
