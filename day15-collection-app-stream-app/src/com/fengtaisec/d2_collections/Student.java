package com.fengtaisec.d2_collections;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;


    // this   o
    @Override
    public int compareTo(Student o) {
        // 认为左边大于右边返回正整数
        // 左边对象小于右边对象返回负整数
        // 等于返回 0
        // 按照年龄升序排序

        return this.age - o.age;
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
    // 内容一样 返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.height, height) == 0 && Objects.equals(name, student.name);
    }
    // 内容一样 返回的哈希值就是一样的
    @Override
    public int hashCode() {
        // 姓名 年龄 身高
        return Objects.hash(name, age, height);
    }
}
