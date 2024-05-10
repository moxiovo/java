package com.fengtaisec.d1_collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("test1");
        c.add("test2");
        c.add("test3");
        c.add("test4");

        // 使用增强for遍历集合或者数组
        for (String ele : c) {
            System.out.println();
        }

        String[] names = {"迪丽热巴", "古力娜扎", "嘻嘻哈哈"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
