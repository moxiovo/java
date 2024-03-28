package com.fengtaisec.loop;

public class LoopNestedDemo7 {
    public static void main(String[] args) {
        // 循环嵌套的执行流程
        for (int i = 1; i <= 3; i++) {
            // i = 1 2 3
            for (int j = 1; j <= 5 ; j++) {
                System.out.println("我喜欢你" + i);
            }
            System.out.println("--------------------");
        }
    }
}
