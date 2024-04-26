package com.fengtaisec.d6_jdk8_time;

import java.time.Instant;

public class Test5_Instant {
    public static void main(String[] args) {
        // 1970.01.01
        // 创建Instant对象，获取此刻时间信息
        Instant now = Instant.now();
        // 获取总秒
        long second = now.getEpochSecond();
        System.out.println(second);

        // 不够1s的纳秒数
        int nano = now.getNano();
        System.out.println(nano);

        System.out.println(Instant.now());
        Instant instant = now.plusNanos(111);

        // Instant对象的作用
        Instant now1 = Instant.now();
        // 代码执行 代码的性能分析
        for (int i = 0; i < 1000000; i++) {

        }
        Instant now2 = Instant.now();
        System.out.println(now1);
        System.out.println(now2);
        // Instant 可以拿到总秒数，推荐用Instant代替Date

    }
}
