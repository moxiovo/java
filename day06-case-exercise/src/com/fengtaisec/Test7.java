package com.fengtaisec;

public class Test7 {
    public static void main(String[] args) {
        // 需要完成找素数
        System.out.println("当前素数的个数是" + search(101, 200));

    }
    public static int search(int start, int end){
        int count = 0;
        // start = 101 end = 200
        // 定义一个for循环找到101-200之间的每个数据
        for (int i = start; i <= end; i++) {
            // i = 101 102 103 ... 199 200

            // 信号位思想
            boolean flag = true; // 默认认为当前记住的i的数据是素数

            // 2、判断当前i记住的数据是否是素数
            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0){
                    // i 当前记住的数据不是素数
                    flag = false;
                    break;
                }
            }
            // 3、根据判定的结果决定是否输出i当前记住的数据
            if (flag){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
