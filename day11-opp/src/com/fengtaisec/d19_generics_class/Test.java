package com.fengtaisec.d19_generics_class;

public class Test {
    // 掌握泛型类的定义
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("java1");
        list.add("java1");
        list.add("java1");
        String ele = list.get(0);
        System.out.println(ele);

        MyClass2<Cat, String> c2 = new MyClass2<>();

        Myclass3<Animal> c3 = new Myclass3<>();
        Myclass3<Dog> c4 = new Myclass3<>();
    }
}
