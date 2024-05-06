package com.fengtaisec.d9_method_references;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        String[] names = {"body", "angla", "Andy", "dlei", "caocao", "Babo", "jack", "Cici"};

        // 进行排序（默认按照字符串的首字符编号进行排序）
        // Arrays.sort(names); // 按照内容的首字符编号进行排序
        // 忽略首字符大小写进行排序
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // 制定比较规则 o1 = Andy o2 = angela
//                return o1.compareToIgnoreCase(o2); // 忽略大小写进行比较
//            }
//        });
        // Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2)); // lamdba表达式简化
        Arrays.sort(names, String::compareToIgnoreCase); // 特定类型的方法引用

        System.out.println(Arrays.toString(names));



    }
}
