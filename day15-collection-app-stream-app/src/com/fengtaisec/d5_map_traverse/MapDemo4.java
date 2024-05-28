package com.fengtaisec.d5_map_traverse;

import java.util.*;

public class MapDemo4 {
    public static void main(String[] args) {
        // 把80个学生选择的景点数据拿到程序中来
        List<String> data = new ArrayList<>();
        String[] selects = {"A", "B", "C", "D"};
        Random r = new Random();
        for (int i = 0; i <= 80; i++) {
            // 模拟一个学生选择一个景点存入到集合中去
            int index = r.nextInt(4); // 0 1 2 3
            data.add(selects[index]);
        }
        System.out.println(data);

        // 统计每个景点的投票人数
        // 准备一个Map集合用于统计最终的结果
        Map<String, Integer> result = new HashMap<>();
        // 开始遍历80个景点数据
        for (String s : data) {
            // 问问Map集合中是否存在景点
            if(result.containsKey(s)){
                // 说明景点之前统计过 +1，重新存入到Map集合中去
                result.put(s, result.get(s) + 1);
            }else {
                // 这个景点是第一次统计 存入景点 = 1
                result.put(s, 1);
            }
        }
        System.out.println(result);
    }
}
