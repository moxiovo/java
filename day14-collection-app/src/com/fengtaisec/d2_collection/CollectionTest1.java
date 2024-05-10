package com.fengtaisec.d2_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(); // 有序 可重复 有索引
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        System.out.println(list);
        list.get(1);

        HashSet<String> set = new HashSet<>(); // 无序 不重复 无索引
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java2");
        set.add("java3");
        System.out.println(set);

    }
}
