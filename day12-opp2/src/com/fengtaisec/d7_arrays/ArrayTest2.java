package com.fengtaisec.d7_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5 , 23);
        students[1] = new Student("紫霞", 163.5 , 26);
        students[2] = new Student("紫霞", 163.5 , 26);
        students[3] = new Student("至尊宝", 167.5 , 24);

//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 制定比较规则：左边对象 o1 右边对象 o2
                // 178.1 178.0 == 0.1 == 0
//                if(o1.getHeight() > o2.getHeight()){
//                    return 1;
//                }else if (o1.getHeight() < o2.getHeight()){
//                    return -1;
//                }
//                return 0;
                // return Double.compare(o1.getHeight(), o2.getHeight()); // 升序
                return Double.compare(o2.getHeight(), o1.getHeight()); // 降序
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
