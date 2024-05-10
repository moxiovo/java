package com.fengtaisec.d3_exception;

import java.util.Scanner;

public class ExcepitonTest4 {
    public static void main(String[] args) {
        // 调用一个方法，让用户输入一个合适的价格返回
        while (true) {
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("请您输入合法的数字：");
            }
        }
    }
    public static double getMoney(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入合适的价格:");
            double money = sc.nextDouble();
            if (money >= 0){
                return money;
            }else {
                System.out.println("您输入的价格不合适!");
            }
        }
    }
}
