package com.fengtaisec.d3_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // 一行经典代码 ArrayList用的最多 多态的写法
        list.add("蜘蛛精");
        list.add("至尊宝");
        list.add("至尊宝");
        list.add("牛夫人");

        for (int i = 0; i < list.size(); i++) {
            // i = 0 1 2
            String s = list.get(i);
            System.out.println(s);
        }

        // 迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 增强for foreach遍历
        for (String s : list) {
            System.out.println(s);
        }

        // Lambda表达式
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
