package com.fengtaisec.d4_map;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // 经典代码 按照键 无序 不重复 无索引
        map.put("手表", 100);
        map.put("手表", 220); // 后面重复的数据会覆盖前面的数据
        map.put("手机", 2);
        map.put("Java", 2);
        map.put(null, null);
        System.out.println(map);

        System.out.println(map.size()); // map集合的大小

        // map.clear();
        System.out.println(map);

        System.out.println(map.isEmpty()); // 判断是否为空

        System.out.println(map.get("手表")); // 根据键获取对应的值
        System.out.println(map.get("张三")); // 根据键获取对应的值 不存在就是null

        System.out.println(map.remove("手表")); // 根据键删除整个元素
        System.out.println(map);

        System.out.println(map.containsKey("手表")); // 判断是否包含某个键
        System.out.println(map.containsKey("手机")); // 判断是否包含某个键
        System.out.println(map.containsKey("手机")); // 判断是否包含某个键
        System.out.println(map.containsKey("java")); // 判断是否包含某个键
        System.out.println(map.containsKey("Java")); // 判断是否包含某个键

        System.out.println(map.containsValue(2)); // 判断是够包含某个值
        System.out.println(map.containsValue("2")); // 判断是够包含某个值

        System.out.println(map.keySet()); // 获取map集合的全部键

        System.out.println(map.values()); // 获取map集合的全部值
        Collection<Integer> values = map.values();
        System.out.println(values);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("java1", 10);
        map1.put("java2", 20);
        Map<String, Integer> map2 = new HashMap<>();
        map1.put("java3", 10);
        map1.put("java2", 222);

        map1.putAll(map2); // putAll 把map2集合中的元素全部倒入到map1集合中去
        System.out.println(map1); // copy
        System.out.println(map2);
    }
}
