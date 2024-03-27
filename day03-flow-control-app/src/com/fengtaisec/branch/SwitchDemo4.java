package com.fengtaisec.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        String week = "周五";
        switch (week) {
            case "周一":
                System.out.println("修bug");
                break;
            case "周二", "周三", "周四":
                System.out.println("2");
                break;
            case "周五":
                System.out.println("5");
                break;
            case "周六":
            case "周日":
                System.out.println("7");
                break;
            default:
                System.out.println("输入的信息不存在");
        }
    }
}
