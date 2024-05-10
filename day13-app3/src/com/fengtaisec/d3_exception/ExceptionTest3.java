package com.fengtaisec.d3_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (Exception e) {
            System.out.println("您当前操作有问题");
            e.printStackTrace(); // 打印出异常对象的信息，记录下来
        }
    }

    public static void test1() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2028-11-11 10:24:11");
        System.out.println(d);

        test2();
    }

    private static void test2() throws Exception {
        // 读取文件的
        InputStream m = new FileInputStream("D:/test.txt");
    }
}
