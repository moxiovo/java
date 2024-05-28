package com.fengtaisec.d5_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTest1 {
    public static void main(String[] args) {
        // map 遍历方式 准备一个map集合
        // 键找值
        Map<String, Double> map = new HashMap<>(); // 引用类型的数据
        map.put("蜘蛛精", 162.5);
        map.put("蜘蛛精", 169.8);
        map.put("紫霞", 165.8);
        map.put("至尊宝", 169.5);
        map.put("牛魔王", 183.6);
        System.out.println(map);
        // map = {蜘蛛精=169.8, 牛魔王=183.6, 至尊宝=169.5, 紫霞=165.8}
        // 获取Map集合的全部键
        Set<String> keys = map.keySet();
        System.out.println(keys);
        // [蜘蛛精, 牛魔王, 至尊宝, 紫霞]
        // key = 169.8 , 183.6 ...
        // 遍历全部的键 获取对应的值
        for (String key : keys) {
            // 根据键获取对应的值
            double value = map.get(key);
            System.out.println(key + "====>" + value);
        }

        System.out.println("--------------------------------");

        // 键值对
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            double value = entry.getValue();
            System.out.println(key + "===>" + value);
        }
        // Lambda 表达式
        System.out.println("--------------------------------");
        /*map.forEach((k, v) -> {
            System.out.println(k + "===>" + v);
        });*/

        map.forEach((k, v) -> System.out.println(k + "===>" + v));
    }
}
