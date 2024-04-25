package com.fengtaisec.d6_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test3_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        int nano = ldt.getNano(); // 纳秒

        // 可合并可拆解
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();

        LocalDateTime ldt10 = LocalDateTime.of(ld, lt);
    }
}
