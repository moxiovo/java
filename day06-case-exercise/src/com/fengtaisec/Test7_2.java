package com.fengtaisec;

public class Test7_2 {
    public static void main(String[] args) {
        int count = 0;

        OUT:
        // 为外部循环指定标签
        for (int i = 101; i <= 200; i++) {
            // 判断该数是否为素数
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    // 这个素数肯定不是素数，不能打印，
                    continue OUT; // 结束外部循环的当次执行

                }

            }
            count++;
            System.out.println(i);
        }
        System.out.println(count);
    }
}
