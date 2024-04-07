package com.fengtaisec.string;

public class StirngDemo2 {
    public static void main(String[] args) {
        String s = "java";
        // 获取长度
        System.out.println(s.length());
        // 获取索引字符
        System.out.println(s.charAt(1));
        // 字符串的遍历
        for (int i = 0; i < s.length(); i++) {
             // i = 0 1 2 3 4 5
            char ch = s.charAt(i);
            System.out.println(ch);
        }
        System.out.println("--------------------------");

        // 把字符串转换成字符数组，在进行遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // 判断字符串内容一样就返回true
        String s1 = new String("黑");
        String s2 = new String("黑");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        // 忽略大小写比较字符串内容
        String c1 = "34AEFG";
        String c2 = "34aeFg";
        System.out.println(c1.equals(c2));
        System.out.println(c1.equalsIgnoreCase(c2)); // 忽略大小写

        // 截取字符串内容(包前不包后)
        String s3 = "java是最好的编程语言之一";
        String rs = s3.substring(0,8);
        System.out.println(rs);

        // 从当前索引位置一直截取到字符串末尾
        String rs2 = s3.substring(5);
        System.out.println(rs2);

        // 把字符串中的某个内容替换成新的内容，并返回新的字符串对象给我们
        String info = "这个电影简直是个垃圾，垃圾电影";
        String rs3 = info.replace("垃圾", "**");
        System.out.println(rs3);

        // 判断字符串中是否包含某个关键字
        String info2 = "java是最好的编程语言之一，我爱java，java不爱我";
        System.out.println(info2.contains("java"));

        // 判断字符串是否为某个字符串开头
        String rs4 = "张三丰";
        System.out.println(rs4.startsWith("张"));
        System.out.println(rs4.startsWith("张三"));
        System.out.println(rs4.startsWith("张三2"));

        // 把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组中返回给我们
        String rs5 = "张无忌,周芷若,殷素素,赵敏";
        String[] names = rs5.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
