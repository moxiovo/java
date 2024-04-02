package com.fengtaisec;

public class Test8 {
    public static void main(String[] args) {
        // 定义一个for循环控制打印多少行
        for (int i = 1; i <= 9; i++) {
            // i = 0 - 8
            // 定义一个内部循环控制每行打印多少列
            for (int j = 1; j <= i; j++) {
                // i 行 j 列
                System.out.print(j + "x" + i + "=" + (j * i) + "\t");
            }
            System.out.println(); //换行
        }
    }
}
