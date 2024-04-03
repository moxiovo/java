package com.fengtaisec.object.thisdemo;

public class Student {
    double score;
    public void printThis(Student this){
        System.out.println(this);
        // this就是一个变量，可以用在方法中，来拿到当前对象
        // this主要用来解决 变量名称冲突的问题
    }
    public void printPass(double score){
        if(this.score > score){ // 拿当前对象的成员变量
            System.out.println("恭喜您，您成功了");
        }else {
            System.out.println("落选了~");
        }
    }
}
