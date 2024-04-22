package com.fengtaisec.d10_interface_jdk8;

public class B implements A{

    @Override
    public void test1() {
        A.super.test1();
    }

    @Override
    public void test4() {

    }

    @Override
    public void test5() {

    }

    @Override
    public void test6() {
        A.super.test6();
    }
}
