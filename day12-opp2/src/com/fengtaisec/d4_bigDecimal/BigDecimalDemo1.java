package com.fengtaisec.d4_bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        // 目标掌握BigDecimal的使用
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("------------------------------");

        // 把他们变成字符串封装成BigDecimal
//        BigDecimal a1 = new BigDecimal(Double.toString(a));
//        BigDecimal b1 = new BigDecimal(Double.toString(b));
        // 用以下方式：把小数转换成字符串再得到BigDecimal对象来使用（更简洁）
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1); // 加法
        BigDecimal d1 = a1.subtract(b1); // 减法
        BigDecimal e1 = a1.multiply(b1); // 乘法
        BigDecimal f1 = a1.divide(b1); // 乘法
        System.out.println(c1);

        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        BigDecimal k = i.divide(j, 2, RoundingMode.HALF_UP);
        System.out.println(k);

        // 把BigDecimal对象转换成double类型的数据
        double rs = k.doubleValue();
        System.out.println(rs);

    }
}
