package com.fengtaisec.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/*
    菜品操作类：负责上架和浏览功能的实现
*/
public class FoodOperator {
    // 1、定义一个arraylist集合对象，负责存储菜品信息
    private ArrayList<Food> foodList = new ArrayList<>();
    // foodList = [];

    // 2、开发上架商品功能
    public void addFood(){
        // 创建一个菜品对象封装上架的菜品信息
        Food f = new Food();

        // 录入菜品信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请您输入菜品名称：");
        String name = sc.next();
        f.setName(name);

        System.out.println("请您输入菜品价格：");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("请您输入菜品描述：");
        String desc = sc.next();
        f.setDesc(desc);


        // 把菜品对象存入集合中区
        foodList.add(f);
        System.out.println("上架成功！");
        
    }

    // 展示菜品
    // foodList = [f1, f2, f3]
    public void showAllFoods(){
        if(foodList.size() == 0){
            System.out.println("还没有上架菜品，请先上架");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("------------------");
        }
    }

    // 展示操作界面
    public void start(){
        do {
            System.out.println("请选择功能");
            System.out.println("1、上架菜品");
            System.out.println("2、展示菜品");
            System.out.println("3、退出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择您的操作：");
            String command = sc.next();
            switch (command) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("下次在来吧！");
                    return;

                default:
                    System.out.println("输入的命令不存在，请输入1或2");

            }
        } while (true);
    }
}
