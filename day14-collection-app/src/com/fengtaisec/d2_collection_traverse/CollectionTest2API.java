package com.fengtaisec.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest2API {
    public static void main(String[] args) {
        //          泛型
        Collection<String> c = new ArrayList<>(); // 多态写法
        c.add("java1");
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java3");
        System.out.println(c);

        // c.clear(); // 清空集合
        System.out.println(c);
        System.out.println(c.isEmpty()); // 是否为空
        System.out.println(c.size()); // 获取集合的大小
        System.out.println(c.contains("java1")); // 判断是否包含java1
        System.out.println(c.contains("Java1")); // 判断是否包含java1
        System.out.println(c.remove("java1"));
        System.out.println(c);

        Object[] arr = c.toArray();
        System.out.println("-------------------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println(c.toArray()); // object 类型

        String[] arr2 = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(arr2)); // 集合中都是字符串

        System.out.println("--------------------------------");
        // 把一个集合的全部数据倒入到另一个集合中去
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2); // 把C2集合全部数据倒入(copy)到C1集合中去
        System.out.println(c1);
        System.out.println(c2);


    }
}
