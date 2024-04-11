package com.fengtaisec.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 创建一个arraylist集合对象
        ArrayList<String> list = new ArrayList<>();
        list.add("黑马");
//        list.add(666);
//        list.add(99.5);
        list.add("黑马");
        list.add("java");
        System.out.println(list);

        // 从jdk 1.7才开始支持
        // ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("黑马");
        System.out.println(list1);

        // 往集合的某个索引位置处添加一个数据
        list.add(1, "MySQL");
        System.out.println(list);

        // 根据索引获取集合中某个索引位置处的值
        String rs = list.get(1);
        System.out.println(rs);

        // 获取集合的大小
        System.out.println(list.size());

        // 根据索引删除集合中的某个元素值，会返回被删除的元素值给我们
        System.out.println(list.remove(1));
        System.out.println(list);

        // 直接删除某个元素值，删除成功返回true
        System.out.println(list.remove("java"));
        System.out.println(list);

        list.add(1,"html");

        // 默认删除的是第一次出现的数据
        System.out.println(list.remove("黑马"));
        System.out.println(list);

        // 修改某个索引位置处的数据，修改后会返回原来的值给我们
        System.out.println(list.set(1, "0基础学IT, 就来黑马程序员"));
        System.out.println(list);
    }
}
