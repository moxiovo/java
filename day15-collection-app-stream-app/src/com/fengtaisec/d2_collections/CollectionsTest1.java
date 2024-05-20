package com.fengtaisec.d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest1 {
    public static void main(String[] args) {
        // 为集合批量添加数据
        List<String> names = new ArrayList<>();

        Collections.addAll(names,"张三", "王五", "李四", "张麻子");
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);



    }
}
