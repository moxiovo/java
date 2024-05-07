package com.fengtaisec.d2_regex;

import java.util.Arrays;

public class RegexTest5 {
    public static void main(String[] args) {
        String s1 = "古力娜扎asdsa迪丽热巴999aa5566马尔扎哈fsadsad2313卡尔扎巴";
        System.out.println(s1.replaceAll("\\w+", "-"));

        String s2 = "我我我喜欢编编编编编编编编编编编编程";
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));

        String s3 = "古力娜扎asdsa迪丽热巴999aa5566马尔扎哈fsadsad2313卡尔扎巴";
        String[] names = s3.split("\\w+");
        System.out.println(Arrays.toString(names));


    }
}
