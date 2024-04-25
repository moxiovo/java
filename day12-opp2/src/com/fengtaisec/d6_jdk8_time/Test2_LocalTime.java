package com.fengtaisec.d6_jdk8_time;

import java.time.LocalTime;

public class Test2_LocalTime {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        // 修改 with plus加 minus减 也可以指定 同上
    }
}
