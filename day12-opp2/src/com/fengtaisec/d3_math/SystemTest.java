package com.fengtaisec.d3_math;

public class SystemTest {
    public static void main(String[] args) {
        // 1970 - 1 - 1 0:0:0 走到此刻的毫秒 1970 01 01 C语言的生日
        long time = System.currentTimeMillis();
        System.out.println(time);

        // System.exit(0); // 人为的终止虚拟机(不要使用)
        System.out.println("---------------------------------");
        for (int i = 0; i < 1000000; i++) {
            System.out.println("输出了：" + i);
        }

        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time) / 1000.0 + "s");
    }
}
