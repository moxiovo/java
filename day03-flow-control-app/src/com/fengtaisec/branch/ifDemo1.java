package com.fengtaisec.branch;

import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 掌握if分支的三种用法和执行流程
        // 测量用户体温，体温高于37度就报警
        double temp = 36.9;
        if(temp > 37){
            System.out.println("温度异常~~");
        }

        // 需求2：发红包，你的金额99，发出90
        // 钱够，要么余额不足
        double money = 19;
        double money1 = 90;
        if(money >= money1){
            System.out.println("发送成功");
        }else {
            System.out.println("余额不足");

        }
        // 根据员工的打分输出对应的绩效类别
        System.out.println("请输入分数：");
        double score = sc.nextDouble();
        if(score >= 0 && score < 60){
            System.out.println("D");
        }else if (score >= 60 && score < 80){
            System.out.println("C");
        }else if (score >= 80 && score < 90){
            System.out.println("B");
        }else if (score >= 90 && score <= 100){
            System.out.println("A");
        }else {
            System.out.println("录入的分数不正确");
        }

    }
}
