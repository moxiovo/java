package com.fengtaisec.object.javabean;

public class Student {
    // 必须私有成员变量，并为每个变量提供get set方法
    // 自动生成一些代码
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}