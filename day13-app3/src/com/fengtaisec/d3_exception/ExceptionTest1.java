package com.fengtaisec.d3_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest1 {
    public static void main(String[] args) throws ParseException{
        // Integer.valueOf("123");

//        int[] arr = {11, 22, 33};
//        System.out.println(arr[5]);

//        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse("2028-11-11 10:24:23");
            System.out.println(d);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
    }
}
