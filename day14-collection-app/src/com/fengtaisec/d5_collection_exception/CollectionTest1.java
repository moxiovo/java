package com.fengtaisec.d5_collection_exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王麻子");
        list.add("小李子");
        list.add("李爱花");
        list.add("张全蛋");
        list.add("晓李");
        list.add("李玉刚");
        System.out.println(list);

        // 需求：需要找出集合中全部带李的名字并从集合中删除
        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            if(name.contains("李")){
                list.remove(name);
            }
        }
        System.out.println(list);*/

        // 使用for循环遍历集合并删除带李字名字
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if(name.contains("李")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);

        System.out.println("-----------------------------------------------");
        // 怎么解决呢？
        // 使用for循环遍历集合并删除带李字名字
        /*for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(name.contains("李")){
                list.remove(name);
                i--;
            }
        }
        System.out.println(list);*/
        // 倒着去删除
//        System.out.println(list.size());
//        for (int i = list.size() - 1; i >= 0; i--) {
//            String name = list.get(i);
//            if(name.contains("李")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String name = iterator.next();
//            if(name.contains("李")){
//                // list.remove(name); // 并发修改异常
//                iterator.remove(); // 删除迭代器当前遍历到的数据 每删除一个数据后 相当于也在底层做了i--
//            }
//        }
//        System.out.println(list);

//        for (String name : list) {
//            if(name.contains("李")){
//                // list.remove(name);
//                // 简化写法 使用增强for循环遍历集合删除数据无法解决BUG
//            }
//        }
//        System.out.println(list);
        list.forEach(name -> { // 源代码增强for遍历
            if(name.contains("李")) {
                list.remove(name);
            }
        });
        System.out.println(list);
    }
}
