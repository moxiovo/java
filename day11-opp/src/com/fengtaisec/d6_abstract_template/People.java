package com.fengtaisec.d6_abstract_template;

public abstract class People {
    /**
     * 设计模板方法设计模式
     * 1、定义一个模板方法
     */
    /**
     * final 防止write被子类重写
     * 子类被重写模板方法失效
     */
    public final void write(){
        System.out.println("\t\t\t\t\t\t《我的爸爸》");
        System.out.println("\t\t test来看看哈");
        // 模板方法不清楚正文部分该怎么写，但是它知道子类要写
        System.out.println(writeMain());
        System.out.println("有这样的真好");

    }
    // 设计一个抽象方法，具体的实现交给子类
    public abstract String writeMain();
}

