package com.fengtaisec;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        // 完成双色球系统的开发
        int [] userNumbers = userSelectNumbers();
        System.out.println("您投注的号码：");
        printArray(userNumbers);
        int [] luckNumbers = createLuckNumbers();
        System.out.println("中奖的号码：");
        printArray(luckNumbers);

        judge(userNumbers, luckNumbers);

    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    // 设计一个方法 前6个是红球，最后1个是蓝球
    public static int[] userSelectNumbers(){
        // 2、创建一个整形数组，用于存储用户投注的号码
        int[] numbers = new int[7];
        // numbers = [0, 0, 0, 0, 0, 0, 0]
        //            0  1  2  3  4  5  6
        // 遍历前6个位置，让用户依次投入6个红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            // i = 0 1 2 3 4 5

            while (true) {
                // 4、让用户开始投注一个红球号码（不能重复）
                System.out.println("请您输入第" + (i + 1) + "个红球代码（1-33之间，不能重复）：");
                int number = sc.nextInt();

                // 判断用户输入的红球代码是否在1-33之间
                if(number < 1 || number > 33){
                    System.out.println("对不起您输入的红球号码不在1-33之间，请确认");
                }else {
                    // 号码是在1-33之间，接着继续判断号码是否重复，不重复才可以使用
                    if (exist(numbers, number)){
                        System.out.println("对不起，您当前输入的红球号码前面选择过，请确认");
                    }else {
                        // number记住的号码没有重复，可以使用了
                        numbers[i] = number;
                        break; // 结束当前死循环投注
                    }
                }
            }
        }

        // 投注最后一个篮球代码
        while (true) {
            System.out.println("请您输入最后1个蓝球号码(1-16):");
            int number = sc.nextInt();
            if (number < 1 || number > 16){
                System.out.println("对不起，您输入的号码不对");
            }else {
                numbers[6] = number;
                break; // 蓝球号码录入成功
            }
        }
        return numbers;
    }

    public static boolean exist(int[] numbers, int number) {
        // 要求判断number这个数字是否在numbers数组中存在
        // numbers= [12, 25, 18, 0, 0, 0, 0]
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                break;
            }
            if (numbers[i] == number){
                return true;
            }
        }
        return false;
    }

    // 设计一个方法，随机一组中奖号码
    public static int[] createLuckNumbers(){
        // 1、创建一个整形数组存储号码
        int[] numbers = new int[7];
        Random r = new Random();

        // 遍历前6个位置处，依次随机一个红球号码存入（1-33 不重复）
        for (int i = 0; i < numbers.length - 1; i++) {
            // i = 0 1 2 3 4 5

            while (true) {
                // 为当前这个位置随机一个红球号码出来存入 1 - 33 ==> -1 ==> (0, 32) + 1
                int number = r.nextInt(33) + 1; // 1 - 33
                // 判断这个号码是否之前出现过(红球号码不能重复)
                if (!exist(numbers, number)){
                    // 说明number当前号码不重复
                    numbers[i] = number;
                    break; // 结束死循环，找到了当前位置的一个不重复的红球号码了
                }
            }
        }
        // 录入一个蓝球号码

        numbers[6] = r.nextInt(16) + 1;
        return numbers;
    }

    // 设计一个方法 判断用户投注号码的中奖情况
    public static void judge(int[] userNumbers, int[] luckNumbers){
        // userNumbers = [12, 14, 16, 18, 23, 26, 8]
        // luckNumbers = [16, 17, 18, 19, 26, 32, 8]

        // 分别定义两个变量记住红球命中几个，篮球命中几个
        int redCount = 0;
        int blueCount = 0;
        
        // 先判断红球命中的数量
        // 遍历用户前6个号码
        for (int i = 0; i < userNumbers.length - 1; i++) {
            // userNumbers[i]
            // 开始遍历中奖号码的前6个号码，看用户当前选择的号码是否命中
            for (int j = 0; j < userNumbers.length - 1; j++) {
                if (userNumbers[i] == luckNumbers[j]){
                    redCount++;
                    break;
                }
            }
        }

        // 判断蓝球是否命中
        blueCount = userNumbers[6] == luckNumbers[6] ? 1 : 0;

        System.out.println("您命中的红球数量是：" + redCount);
        System.out.println("您命中的蓝球数量是：" + blueCount);

        if (redCount == 6 && blueCount == 1){
            System.out.println("恭喜您中奖1000个W，可以享受人生了~~");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜您中奖500个W，可以稍微享受人生了~~");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜您中奖3000元，可以出去吃顿小龙虾了~~");
        } else if (redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1) {
            System.out.println("恭喜您中奖200元~~");
        } else if (redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1) {
            System.out.println("恭喜您中奖10元~~");
        } else if (redCount < 3 && blueCount == 1) {
            System.out.println("恭喜您中奖5元~~");
        } else {
            System.out.println("感谢您对福利事业做出的巨大贡献！");
        }
    }

}
