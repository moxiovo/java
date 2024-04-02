package com.fengtaisec;

/*        *
         ***
        *****
       *******  */

public class Test9 {
    public static void main(String[] args) {
//    行(i) 先打空格(n-i)   再打星星    换行
//    1      3               1
//    2      2               3
//    3      1               5
//    4      0               7(2i - 1)
        int n = 10;
        for (int i = 1; i <= n; i++) {
            // 打印多少空格
            for (int j = 1; j <= (n - i) ; j++) {
                System.out.print(" ");
            }
            // 打印多少星星
            for (int j = 0; j < (2 * i -1); j++) {
                System.out.print(j % 2 == 0 ? " " : "*");
            }

            // 换行
            System.out.println();
        }

    }
}
