package com.fengtaisec.loop;

public class BreakAndContinueDemo8 {
    public static void main(String[] args) {
        // 掌握break和continue的作用
        // break：跳出并结束当前循环的执行
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("我喜欢你" + i);
            if(i == 3){
                break;
            }
        }

        // continue 跳出当前循环的当次执行，直接进入循环的下一次执行
        for (int i = 1; i <=5 ; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("test" + i);

        }

        // break 只能用于结束所在循环 break switch or loop
    }
}
