package com.fengtaisec;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>(); // []
    private Scanner sc = new Scanner(System.in);

    // 启动ATM 系统展示欢迎界面
    public void start() {
        while (true) {
            System.out.println("==欢迎进入黑马银行ATM系统==");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // 用户登录
                    break;
                case 2:
                    // 用户开户
                    break;
                default:
                    System.out.println("没有该操作~~");
            }
        }

    }
    // 设计一个方法完成用户操作
    private void createAccount(){
        // 1、创建一个账户对象用于封装用户的开户信息
        Account acc = new Account();
        // 2、需要用户输入自己的开户信息赋值给账户对象
        System.out.println("请您输入账户名称：");
        String name = sc.next();
        acc.setUserName(name);
        System.out.println("请您输入账户性别：");
        char sex = sc.next().charAt(0); // “男”
        while (true) {
            if (sex == '男' || sex == '女'){
                acc.setSex(sex);
                break;
            }else {
                System.out.println("您输入的性别有误，请输入男或女~");
            }
        }

        System.out.println("请您输入您的账户密码：");
        String passWord = sc.next();
        System.out.println("请您输入您的确认密码：");
        String okPassWord = sc.next();
        // 判断密码是否一样
        while (true) {
            if (okPassWord.equals(passWord)){
                acc.setPassWord(okPassWord);
                break;
            }else {
                System.out.println("您输入的两次密码有误，请您确认~");
            }
        }
        System.out.println("请您输入您的取现额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        // 重点：需要为账户生成一个卡号（由系统自动生成。8位数字表示，不能与其他账户的卡号重复）

        // 3、把这个账户对象，存入到账户集合中去
        accounts.add(acc);
        System.out.println("恭喜您，" + acc.getUserName() + "开户成功，您的卡号是：");
    }
}
