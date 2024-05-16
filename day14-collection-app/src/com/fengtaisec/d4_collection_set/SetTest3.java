package com.fengtaisec.d4_collection_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest3 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Student s1 = new Student("至尊宝", 25, 169.5);
        Student s2 = new Student("蜘蛛精", 25, 169.5);
        Student s3 = new Student("蜘蛛精", 25, 169.5);
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        Student s4 = new Student("牛魔王", 22, 166.5);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        System.out.println(students);

    }
}
