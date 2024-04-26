package com.fengtaisec.d7_arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = Arrays.copyOfRange(arr, 1, 4); // 指定范围包前不包后
        System.out.println(Arrays.toString(arr2));

        // 拷贝数组，可以指定新数组的长度
        int[] arr3 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr3));

        // 把数组中的原数据改为新数据又存进去
        double[] prices = {99.8, 128, 100};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                // value = 0 1 2
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));
    }
}
