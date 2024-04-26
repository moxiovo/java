package com.fengtaisec.d6_jdk8_time;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class Test4_ZoneId_ZonedDateTime {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getId());
        System.out.println(zoneId);

        // 支持的所有时区Id
        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zoneId1 = ZoneId.of("America/New_York");
        System.out.println(ZonedDateTime.now(zoneId1));

        ZonedDateTime now1 = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(now1); // 世界标准时间

        ZonedDateTime now2 = ZonedDateTime.now();
        System.out.println(now2);

        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(zoneId1));
        System.out.println(instance);
    }
}
