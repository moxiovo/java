package com.fengtaisec.loop;

public class WhileTest4 {
    public static void main(String[] args) {
        // 用while循环解决问题，知道什么时候用for或者while
        double peakHeight = 8848860; // mm
        double paperThickness = 0.1; // 纸张的厚度

        // 记录count 记住纸张折叠了多少次
        int count = 0;

        while (paperThickness < peakHeight){
            // 把纸张进行折叠
            paperThickness = paperThickness * 2;// 纸张的厚度折叠为两倍
            count++;

        }
        System.out.println("纸张的最后厚度：" + paperThickness);
        System.out.println("需要折叠多少次：" + count);
        // while和for功能上没有区别，基本都能实现
        // 一开始不知道用while，知道循环几次用for
    }
}
