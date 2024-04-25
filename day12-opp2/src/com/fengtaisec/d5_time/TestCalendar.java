package com.fengtaisec.d5_time;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        // 得到系统此刻时间
        Date d = new Date();
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        // 获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        int year2 = now.get(Calendar.DAY_OF_YEAR);
        System.out.println(year2);
        System.out.println(year);

        // 拿到日历中记录的日期对象
        Date d1 = now.getTime();
        System.out.println(d1);

        // 获取时间毫秒
        long time = now.getTimeInMillis();
        System.out.println(time);

        // 修改日历的某个信息
        now.set(Calendar.MONTH, 9); // 修改月份为10月份
        now.set(Calendar.DAY_OF_YEAR, 150); // 修改一年中的150天
        System.out.println(now);

        // 为某个信息增加或减少多少
        now.add(Calendar.DAY_OF_YEAR, 100); // 加 100天
        now.add(Calendar.DAY_OF_YEAR, -10); // 减 10天
        now.add(Calendar.DAY_OF_MONTH, 6);  // 加 6月
        System.out.println(now);
    }
}
