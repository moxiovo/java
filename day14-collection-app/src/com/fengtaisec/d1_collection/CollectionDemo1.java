package com.fengtaisec.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("test1");
        c.add("test2");
        c.add("test3");
        c.add("test4");
        // System.out.println(c);

        // 使用迭代器遍历集合
        Iterator<String> it = c.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        // System.out.println(it.next()); // 取第五次会发生异常

        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
