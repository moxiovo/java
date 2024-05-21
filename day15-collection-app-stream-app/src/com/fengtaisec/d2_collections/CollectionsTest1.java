package com.fengtaisec.d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest1 {
    public static void main(String[] args) {
        // 为集合批量添加数据
        List<String> names = new ArrayList<>();

        Collections.addAll(names,"张三", "王五", "李四", "张麻子");
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("蜘蛛精", 23, 169.7));
        students.add(new Student("紫霞", 22, 169.8));
        students.add(new Student("紫霞", 22, 169.8));
        students.add(new Student("牛魔王", 22, 183.5));
        // Collections.sort(students);
        System.out.println(students);

        // 比较器对象
        Collections.sort(students, Comparator.comparingDouble(Student::getHeight));
        System.out.println(students);


    }
}
