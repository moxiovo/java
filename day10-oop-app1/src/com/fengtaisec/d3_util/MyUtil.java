package com.fengtaisec.d3_util;

import java.util.Random;

public class MyUtil {

    private MyUtil(){

    }

    public static String createCode(int n){
            Random r = new Random();
            String data = "1234567890abcdefghijklmnopqrstuvwxwzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String code = "";

            for (int i = 0; i < n; i++) {
                int index = r.nextInt(data.length());
                code += data.charAt(index);
            }
        return code;
    }
}
