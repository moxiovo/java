package com.fengtaisec.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("java1");
        c.add("java2");
        c.add("java3");
        c.add("java4");
        System.out.println(c);

        // 结合Lambda表达式遍历集合
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//
//        c.forEach((String s) -> {
//                System.out.println(s);
//        });
//
//        c.forEach(s -> {
//            System.out.println(s);
//        });
//
//        c.forEach(s -> System.out.println(s));

        c.forEach(System.out::println);

    }
}
