package com.fengtaisec.d22_generics_attention;

import com.fengtaisec.d16_emum.A;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 泛型工作在编译阶段 class不存在泛型
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        String rs = list.get(2);
        System.out.println(rs);

        // 泛型不支持基本数据类型 只能支持对象类型（引用数据类型）
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(22.2);
    }
}
