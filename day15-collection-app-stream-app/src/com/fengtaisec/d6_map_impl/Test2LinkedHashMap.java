package com.fengtaisec.d6_map_impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Test2LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("手表", 100);
        map.put("手表", 200);
        map.put("手机", 2);
        map.put("Java", 2);
        map.put("null", 2);
        System.out.println(map);


    }
}
