package com.fengtaisec.define;

public class MethodTest4 {
    public static void main(String[] args) {
        int rs = add(5);
        System.out.println("1-5 sum = " + rs);

        int rs2 = add(100);
        System.out.println("1-100 sum = " + rs2);
        System.out.println("-----------------------");
        judge(10);
        System.out.println("-----------------------");
        judge(7);
    }
    public static int add(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void judge(int number){
        if (number % 2 == 0){
            System.out.println(number + "是一个偶数！");
        }else {
            System.out.println(number + "是一个奇数！");
        }
    }
}
