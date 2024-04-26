package com.fengtaisec.d7_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5 , 23);
        students[1] = new Student("紫霞", 163.5 , 26);
        students[2] = new Student("紫霞", 163.5 , 26);
        students[3] = new Student("至尊宝", 167.5 , 24);

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
