package com.fengtaisec.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        // 理解多态的好处
        // 实现解耦合，右边对象可以随时切换
        People p1 = new Student();
        p1.run();
        // p1.test(); // 多态下存在问题，无法直接调用子类的独有功能
        // 强制类型转换：编译截断继续或者实现关系就可以强制转换，但是运行时可能出现类型转换异常
        // Teacher t1 = (Teacher) p1; // 运行时出现异常ClassCastException

        if (p1 instanceof Student){
            Student s2 = (Student) p1;
            s2.test();
        }else if (p1 instanceof Teacher){
            Teacher t2 = (Teacher) p1;
            t2.teach();
        }

        Student s1 = (Student) p1;
        s1.test();

        // 使用父类类型的变量作为形参，可以接受一切子类对象
        Student s = new Student();
        go(s);

        Teacher t = new Teacher();
        go(t);
    }
    // 使用父类类型的变量作为形参，可以接受一切子类对象
    public static void go(People p){
        p.run();
        if (p instanceof Student){
            Student s = (Student) p;
            s.test();
        }else if (p instanceof Teacher){
            Teacher t = (Teacher) p;
            t.teach();
    }


    }
    // 多态下不能使用子类的独有功能
}
