package com.fengtaisec.d7_arrays;

public class Student implements Comparable<Student>{
    private String name;
    private double height;
    private int age;

    // 比较规则
    // this o
    @Override
    public int compareTo(Student o) {
        // 约定 如果左边对象大于右边对象，返回正整数
        // 约定 如果左边对象小于右边对象，返回负整数
        // 约定 如果左边对象等于右边对象，返回 0
        // 按照年龄升序排序
//        if (this.age > o.age){
//            return 1;
//        }else if (this.age < o.age){
//            return -1;
//        }
//        return 0;
        // return this.age - o.age; // 升序
         return o.age - this.age; // 降序
    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
