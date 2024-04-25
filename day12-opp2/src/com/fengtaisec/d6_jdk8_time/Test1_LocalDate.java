package com.fengtaisec.d6_jdk8_time;

import java.time.LocalDate;

public class Test1_LocalDate {
    public static void main(String[] args) {
        // 获取本地日期对象
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // 获取日期对象的信息
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();
        int dayOfWeek = ld.getDayOfWeek().getValue();
        System.out.println(year);
        System.out.println(day);
        System.out.println(dayOfWeek);

        // with开头 修改
        LocalDate ld2 = ld.withYear(2099);
        LocalDate ld3 = ld.withMonth(12);
        System.out.println(ld);
        System.out.println(ld2);
        System.out.println(ld3);
        // plus 加 minus 减
        LocalDate ld4 = ld.plusYears(2);
        LocalDate ld5 = ld.plusMonths(2);

        LocalDate ld6 = ld.minusYears(2);
        LocalDate ld7 = ld.minusMonths(2);

        // 指定日期的LocalDate对象
        LocalDate ld8 = LocalDate.of(2099, 12, 12);
        LocalDate ld9 = LocalDate.of(2099, 12, 12);

        // 判断是否相等 在前在后
        System.out.println(ld8.equals(ld9));
        System.out.println(ld8.isAfter(ld));
        System.out.println(ld8.isBefore(ld));

    }
}
