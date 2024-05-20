package com.fengtaisec.d4_collection_set;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest4 {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(6);
        set1.add(5);
        set1.add(5);
        set1.add(7);
        System.out.println(set1);
        // 升序 红黑树排序
        // 就近选择自带的比较器对象进行排序
        Set<Student> students = new TreeSet<>((o1, o2) -> Double.compare(o1.getHeight() , o2.getHeight()));
        students.add(new Student("蜘蛛精", 23, 169.7));
        students.add(new Student("紫霞", 22, 169.8));
        students.add(new Student("至尊宝", 26, 169.0));
        students.add(new Student("牛魔王", 22, 183.5));

        System.out.println(students);
    }
}
