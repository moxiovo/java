package com.fengtaisec;

public class Test4 {
    public static void main(String[] args) {
        // 完成数字加密程序的开发
        System.out.println(ercrygt(8346));
    }

    public static String ercrygt(int number){
       // number = 1, 9, 8, 3
       // 把密码拆分成一个一个的数字，才可以加密
        int[] numbers = split(number);

        // 遍历这个数组的每一数字，对齐加密处理
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;

        }
        // numbers = [6 , 4, 3, 8]

        // 对数组进行反转操作交给一个独立的方法来完成

        reverse(numbers);
        // numbers = [8, 3, 4, 6]
        // 把这些加密的数字拼接起来作为加密后的结果
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        return data;
    }


    public static void reverse(int[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < j; i++,j--) {
            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;
        }
    }

    public static int[] split(int number) {
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = (number / 100);
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;
        return numbers;
    }
}
