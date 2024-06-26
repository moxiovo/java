package com.fengtaisec.d8_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        // List stream
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张三丰", "张无忌", "周芷若", "赵敏", "张强");
        Stream<String> stream = names.stream();

        Set<String> set = new HashSet<>();
        Collections.addAll(set, "刘德华", "张曼玉", "蜘蛛精", "马德", "德玛西亚");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("德")).forEach(s -> System.out.println(s));

        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 172.3);
        map.put("迪丽热巴", 168.3);
        map.put("马尔扎哈", 166.3);
        map.put("卡尔扎巴", 168.3);
        Set<String> key = map.keySet();
        Stream<String> ks = key.stream();

        Collection<Double> values = map.values();
        Stream<Double> vs = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> kvs = entries.stream();
        kvs.filter(e -> e.getKey().contains("巴")).forEach
                (e -> System.out.println(e.getKey() + "-->" + e.getValue()));

        String[] names2 = {"张翠山", "东方不败", "唐大山", "独孤求败"};
        Stream<String> stream2 = Arrays.stream(names2);
        Stream<String> stream3 = Stream.of(names2);

    }
}
