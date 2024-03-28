package com.fengtaisec.loop;

public class DoWhileDemo5 {
    public static void main(String[] args) {
        // 书写格式和执行流程、特点应用场景
        int i = 0;
        do{
            System.out.println("hello");
            i++;
        }while (i < 3);
        // 先执行后判断
        do{
            System.out.println("hello2");
        }while (false);
        // for 和 while 先判断 后执行 do while 先执行后判断
        System.out.println("----------------------------");
        for (int j = 0; j < 3; j++) {
            System.out.println("hello3");
        }
        int m = 0;
        while (m < 3){
            System.out.println("hello4"); // 3
            m++;
        }
        System.out.println(m);
    }
}
