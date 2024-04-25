package com.fengtaisec.d5_time;

import java.util.Date;

public class Test1Date {
    public static void main(String[] args) {
        // 掌握Date日期类的使用
        Date d = new Date();
        System.out.println(d);

        // 2、拿到时间毫秒值
        long time = d.getTime();
        System.out.println(time);

        // 3、把时间毫秒值转换成日期对象
        time += 2 * 1000;
        Date d2 = new Date(time);
        System.out.println(d2);

        // 4、直接把日期对象的时间通过setTime进行修改
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);
    }
}
