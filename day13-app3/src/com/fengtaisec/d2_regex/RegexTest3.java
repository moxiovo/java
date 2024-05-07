package com.fengtaisec.d2_regex;

import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        // checkPhone();
        // checkEmail();
        checkTime();
    }

    public static void checkPhone(){
        while (true) {
            System.out.println("请输入您的电话号码(手机|座机):");
            Scanner sc = new Scanner(System.in);
            String phone = sc.nextLine();
            // 18686728670 010-3424242424 0104644535
            if (phone.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")){
                System.out.println("您输入的号码格式正确~~~");
                break;
            }else {
                System.out.println("您输入的号码格式不正确~~~");
            }
        }
    }
    public static void checkEmail(){
        while (true) {
            System.out.println("请输入您的邮箱:");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            // dlei0009@163.com
            // 25143242@qq.com
            if (email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")){
                System.out.println("您输入的邮箱格式正确~~~");
                break;
            }else {
                System.out.println("您输入的邮箱格式不正确~~~");
            }
        }
    }

    public static void checkTime(){
        while (true) {
            System.out.println("请输入时间: (yyyyMMdd)");
            Scanner sc = new Scanner(System.in);
            String time = sc.nextLine();
            // 18686728670 010-3424242424 0104644535
            if (time.matches("((\\d{3}[1-9]|\\d{2}[1-9]\\d|\\d[1-9]\\d{2}|[1-9]\\d{3})(((0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((0[469]|11)(0[1-9]|[12]\\d|30))|(02(0[1-9]|[1]\\d|2[0-8]))))|(((\\d{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)")){
                System.out.println("您输入的时间格式正确~~~");
                break;
            }else {
                System.out.println("您输入的时间格式不正确~~~");
            }
        }
    }
}
