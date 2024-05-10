package com.fengtaisec.d3_exception;

public class ExceptionTest2 {
    public static void main(String[] args) throws AgeillegalException {
        // 需求：保存一个合法的年龄
//        try {
            saveAge2(223);
            System.out.println("执行成功！");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("执行出现了Bug！");
//        }

        try {
            saveAge2(25);
            System.out.println("执行成功2！");
        } catch (AgeillegalException e) {
            e.printStackTrace();
            System.out.println("执行2出现了Bug！");
        }
    }

    // 无返回值的调用方法，需要提供异常对象封装这个问题
    public static void saveAge2(int age) throws AgeillegalException {
        if (age > 0 && age < 150) {
            System.out.println("年龄被成功保存了: " + age);
        } else {
            // System.out.println("年龄非法");
            // 自定义异常类
            // throw 抛出去这个异常对象
            // throws 用在方法上抛出方法内部的异常
            throw new AgeillegalException("/age is illegal, your age is " + age);
        }
    }
}
    /*public static void saveAge(int age){
        if (age > 0 && age < 150){
            System.out.println("年龄被成功保存了: " + age);
        }else {
            // System.out.println("年龄非法");
            // 自定义异常类
            // throw 抛出去这个异常对象
            throw new AgeillegalRuntimeException("/age is illegal, your age is " + age);
        }
    }
}*/
