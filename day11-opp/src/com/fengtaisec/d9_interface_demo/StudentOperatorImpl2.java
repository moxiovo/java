package com.fengtaisec.d9_interface_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator{

    @Override
    public void printAllinfo(ArrayList<Student> students) {
        System.out.println("-----------全班全部学生信息如下------------");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名：" + s.getName() + ", 性别" + s.getSex() + ", 成绩" + s.getScore());
            if (s.getSex() == '男'){
                count1++;
            }else {
                count2++;
            }
        }
        System.out.println("男生人数是：" + count1 + "女生人数：" + count2);
        System.out.println("班级总人数是" + count1 + count2);
        System.out.println("----------------------------------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double allScore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getScore() > max) max = s.getScore();
            if (s.getScore() < min) min = s.getScore();
            allScore += s.getScore();

        }
        System.out.println("最高分是" + max);
        System.out.println("最低分是" + min);
        System.out.println("平均分：" +(allScore - max - min) / (students.size() - 2));
    }
}
