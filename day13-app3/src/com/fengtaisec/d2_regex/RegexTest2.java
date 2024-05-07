package com.fengtaisec.d2_regex;

public class RegexTest2 {
    public static void main(String[] args) {
        System.out.println("a".matches("[abc]")); // 只能匹配abc
        System.out.println("e".matches("[abcd]")); // false

        System.out.println("d".matches("[^abc]")); // ^代表不能是abc
        System.out.println("a".matches("[^abc]")); // false

        System.out.println("b".matches("[a-zA-Z]")); // [a-zA-Z] 只能是a-z A-Z 的字符
        System.out.println("2".matches("[a-zA-Z]")); // false

        System.out.println("a".matches("[a-z&&[^bc]]")); // a-z,除了b c
        System.out.println("b".matches("[a-z&&[^bc]]")); // a-z,除了b c

        System.out.println("ab".matches("[a-zA-Z0-9]")); // false 只能匹配当个字符

        System.out.println("徐".matches(".")); // .可以匹配任意字符
        System.out.println("徐徐".matches(".")); // false

        // java \ 有特殊用途 例如 特殊字符 \n换行  \t缩进
        System.out.println("1".matches("\\d")); // \\d 为 \d 而不会当成一个整体来解析 true
        System.out.println("12".matches("\\d")); // \\d 为 \d 而不会当成一个整体来解析

        System.out.println(" ".matches("\\s")); // \s 代表空白字符
        System.out.println("a".matches("\\s")); // \\d 为 \d 而不会当成一个整体来解析

        System.out.println(" ".matches("\\s")); // \S 代表非空白字符 // false
        System.out.println("a".matches("\\s"));

        System.out.println("a".matches("\\w")); // \w: [a-zA-Z_0-9]
        System.out.println("_".matches("\\w")); // true
        System.out.println("徐".matches("\\w")); // false

        System.out.println("徐".matches("\\W")); // ^\w: [a-zA-Z_0-9]
        System.out.println("a".matches("\\W")); // false

        System.out.println("23232".matches("\\d")); // false 只能匹配单个字符

        System.out.println("a".matches("\\w?")); // ? 代表0次和1次
        System.out.println("".matches("\\w?")); // true
        System.out.println("abc".matches("\\w?")); // false

        System.out.println("abc12".matches("\\w*")); // 代表0次和多次
        System.out.println("".matches("\\w*")); // true
        System.out.println("abc12张".matches("\\w*")); // false

        System.out.println("abc12".matches("\\w+")); // 代表1次和多次
        System.out.println("".matches("\\w+")); // false
        System.out.println("abc12张".matches("\\w+")); // false

        System.out.println("a3c".matches("\\w{3}")); // {3} 代表正好是n次
        System.out.println("abcd".matches("\\w{3}")); // false
        System.out.println("abcd".matches("\\w{3,}")); // 代表是 >=3次
        System.out.println("ab".matches("\\w{3,}")); // false
        System.out.println("abcde徐".matches("\\w{3,}")); // false
        System.out.println("abc2322".matches("\\w{3,9}")); // 3,9 代表是 >=3 <=9

        System.out.println("-------------------------------------------------");

        System.out.println("abc".matches("(?i)abc")); // true
        System.out.println("ABC".matches("(?i)abc")); // true
        System.out.println("aBc".matches("a((?i)b)c")); // true
        System.out.println("ABc".matches("a((?i)b)c")); // true

        // 要求要么是三个小写字母 要么是三个数字
        System.out.println("123".matches("\\d{3}|[a-z]{3}"));
        System.out.println("abc".matches("\\d{3}|[a-z]{3}"));
        System.out.println("aAc".matches("\\d{3}|[a-z]{3}"));

        // 必须是我爱开头 中间至少一个编程 最后至少一个666
        System.out.println("我爱编程编程++++++".matches("我爱(编程)+(666)+"));
        System.out.println("我爱编程编程6666666".matches("我爱(编程)+(666)+")); // false





    }
}
