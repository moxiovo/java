package com.fengtaisec.d21_generics_method;

import com.fengtaisec.d7_interface.C;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String rs = test("java");
        System.out.println(rs);

        Dog d = test(new Dog());
        System.out.println(d);

        // 需求：所有的汽车可以一起参加比赛。
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BMW());
        cars.add(new Benz());
        go(cars);

        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<Benz> benzs = new ArrayList<>();
        benzs.add(new Benz());
        benzs.add(new Benz());
        go(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
//        go(dogs);

    }

//    public static <T extends Car> void go(ArrayList<T> cars){
//
//    }
    // ? 通配符 在使用泛型的时候可以代表一切类型 ? extends Car (上限) ? super Car(下限)
    public static void go(ArrayList<? extends Car> cars){

    }


    // 泛型方法
    public static <T> T test(T t){
        return t;
    }
}

