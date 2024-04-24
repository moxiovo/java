package com.fengtaisec.d25_integer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 掌握包装类的使用
//        Integer a1 = new Integer(12);
        Integer a2 = Integer.valueOf(22); // 转换成对象
        System.out.println(a2);

        // 自动装箱：把基本类型数据转换成对象
        Integer a3 = 12;

        // 自动拆箱：可以把自动包装类型的对象转换成基本数据类型
        int a4 = a3;

        // 泛型和集合不支持基本数据类型 只能支持引用数据类型
        // ArrayList<int> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12); // 自动装箱
        list.add(13); // 自动装箱

        int rs = list.get(1); // 自动拆箱
        System.out.println("--------------------------------------------------");

        // 1、把基本类型的数据转换成字符串
        Integer a = 23;
        String rs1 = Integer.toString(a);
        String rs2 = a.toString();
        System.out.println(rs1 + 1);
        System.out.println(rs2 + 1);

        String rs3 = a + "";
        System.out.println(rs3 + 1);

        // 2、把字符串类型的数值转换成对应的基本类型
        String ageStr = "29";
        // int ageI = Integer.parseInt(ageStr); // 29
        int ageI = Integer.valueOf(ageStr); // 29
        System.out.println(ageI + 1); // 30

        String scoreStr = "99.5";
        // double score = Double.parseDouble(scoreStr);
        double score = Double.valueOf(scoreStr);
        System.out.println(score + 0.5);

    }
}
