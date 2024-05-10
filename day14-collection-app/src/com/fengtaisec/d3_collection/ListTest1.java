package com.fengtaisec.d3_collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        // 接口
        List<String> list = new ArrayList<>(); // 一行经典代码 ArrayList用的最多 多态的写法
        list.add("蜘蛛精");
        list.add("至尊宝");
        list.add("至尊宝");
        list.add("牛夫人");
        System.out.println(list);
        list.add(2, "紫霞仙子");
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.get(3));
        list.set(2, "紫霞");
        System.out.println(list);


    }
}
