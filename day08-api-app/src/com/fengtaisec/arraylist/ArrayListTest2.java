package com.fengtaisec.arraylist;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("宁夏枸杞");
        list.add("java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);

        // [java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特级枸杞, 枸杞子]
        // [java入门, 黑枸杞, 人字拖, 枸杞子]
        //                            i
        // 开始遍历，找到集合中的枸杞数据并删除它
//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);
//            // 判断数据中包含枸杞
//            if (ele.contains("枸杞")){
//                // 从集合中删除该数据
//                list.remove(ele);
//            }
//        }
//        System.out.println(list);

        // 法一：每一次删除一个数据后，让i往左退一步
//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);
//            // 判断数据中包含枸杞
//            if (ele.contains("枸杞")){
//                // 从集合中删除该数据
//                list.remove(ele);
//                i--;
//
//            }
//        }
//        System.out.println(list);
        System.out.println(list.size());
        // 法二：从集合的后面倒着遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            String ele = list.get(i);
            // 判断数据中包含枸杞
            if (ele.contains("枸杞")){
                // 从集合中删除该数据
                list.remove(ele);
            }
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
