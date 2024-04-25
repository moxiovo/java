package com.fengtaisec.d5_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        // 掌握SimpleDateFormat 的使用
        Date d = new Date();
        long time = d.getTime();

        // 格式化
        SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        SimpleDateFormat b = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");

        System.out.println(a.format(d));
        System.out.println(b.format(time));

        System.out.println("----------------------------------");

        // 掌握SimpleDateFormat解析字符串时间 成为日期对象
        String dateStr = "2024-12-12 12:12:12";
        SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        Date d2 = c.parse(dateStr);
        System.out.println(d2);
    }
}
