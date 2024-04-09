package com.fengtaisec.string;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        // 开发一个登录界面
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入用户名：");
            String loginName = sc.next();
            System.out.println("请您输入密码：");
            String passWord = sc.next();
            // 调用方法
            boolean rs = login(loginName, passWord);
            if (rs){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("用户名或密码错误");
            }
        }
    }

    // 开发一个登录方法，接受用户的登录名和密码，返回认证的结果
    public static boolean login(String loginName, String passWord){
        // 准备一份正确的登录名和密码
        String okLoginName = "test";
        String okPassword = "123456";

        // 判断用户是否登录成功
        if(okLoginName.equals(loginName) && okPassword.equals(passWord)){
            return true;
        }else {
            return false;
        }
    }
}
