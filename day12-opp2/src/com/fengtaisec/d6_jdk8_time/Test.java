package com.fengtaisec.d6_jdk8_time;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getYear() + 1900);
        d.getTime();

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        // 都是可变对象修改后会丢失开始的时间信息

        // 线程不安全
        // 推荐使用JDK 8 新增的时间



        // 1秒 = 1000毫秒
        // 1毫秒 = 1000微秒
        // 1微秒 = 1000纳秒
    }

}
