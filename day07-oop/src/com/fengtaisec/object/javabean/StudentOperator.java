package com.fengtaisec.object.javabean;

public class StudentOperator {
    private Student student;
    public StudentOperator(Student student) {
        this.student = student;

    }

    public void printPass() {
        // 检查学生的分数是否及格
        if (student.getScore() >= 60) {
            // 如果及格，则打印学生的姓名
            System.out.println(student.getName() + "成绩合格");
        } else {
            // 如果不及格，则打印未及格提示
            System.out.println(student.getName() + "成绩不合格");
        }
    }
}
