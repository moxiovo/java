package com.fengtaisec.d8_lambda;

import com.fengtaisec.d7_arrays.Student;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest2 {
    public static void main(String[] args) {
        double[] prices = {99.8, 128, 100};
//        Arrays.setAll(prices, (int value) -> {
//            return prices[value] * 0.8;
//        });
//        Arrays.setAll(prices, (value) -> {
//           return prices[value] * 0.8;
//        });
//        Arrays.setAll(prices, value -> {
//           return prices[value] * 0.8;
//        });
        Arrays.setAll(prices, value -> prices[value] * 0.8);

        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5 , 23);
        students[1] = new Student("紫霞", 163.5 , 26);
        students[2] = new Student("紫霞", 163.5 , 26);
        students[3] = new Student("至尊宝", 167.5 , 24);

//        Arrays.sort(students, (Student o1, Student o2) -> {
//                return Double.compare(o2.getHeight(), o1.getHeight()); // 降序
//        });
//        Arrays.sort(students, (o1, o2) -> {
//            return Double.compare(o2.getHeight(), o1.getHeight()); // 降序
//        });
        Arrays.sort(students, (o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()));
        System.out.println(Arrays.toString(students));
    }

}
