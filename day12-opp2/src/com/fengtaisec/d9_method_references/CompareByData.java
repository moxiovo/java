package com.fengtaisec.d9_method_references;

import com.fengtaisec.d7_arrays.Student;

public class CompareByData {
    public static int compareByAge(Student o1, Student o2){
        return o1.getAge() - o2.getAge(); // 升序排序的规则

    }

    public int compareByAgeDesc(Student o1, Student o2){
        return o2.getAge() - o1.getAge(); // 降序排序
    }
}
