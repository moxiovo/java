package com.fengtaisec.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest04 {
    public static void main(String[] args) {
        // 创建一个集合容器用来存储多部电影对象
        Collection<Movie> movies = new ArrayList<>(); // 多态
        movies.add(new Movie("《肖生克的救赎》", 9.7, "罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6, "张国荣、张丰毅"));
        movies.add(new Movie("《阿甘正传》", 9.5, "汤姆汉克斯"));
        System.out.println(movies); // 三个电影对象的地址，集合存储地址信息从堆内存中找

        for (Movie movie : movies) {
            System.out.println("电影名称：" + movie.getName());
            System.out.println("评分：" + movie.getScore());
            System.out.println("主演" + movie.getActor());
            System.out.println("-------------------------------");
        }
    }
}
