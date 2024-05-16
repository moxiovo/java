package com.fengtaisec.d4_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest1 {
    public static void main(String[] args) {
        // 整体了解Set系列集合的特点
        // 创建一个set集合的对象
        // Set<Integer> set = new HashSet<>(); // 创建了一个HashSet的集合对象 多态 经典代码 无序（不代表随机顺序） 不重复 无索引
        // Set<Integer> set = new LinkedHashSet<>(); // 创建了一个LinkedHashSet的集合对象 有序 不重复 无索引
        Set<Integer> set = new TreeSet<>(); // 创建了一个TreeSet的集合对象 可排序（升序） 不重复 无索引
        set.add(666);
        set.add(555);
        set.add(555);
        set.add(888);
        set.add(888);
        set.add(777);
        set.add(777);
        System.out.println(set);

    }
}
