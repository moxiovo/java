package com.fengtaisec.d7_arrays;

public class Test3 {
    public static void main(String[] args) {
        // 创建接口的匿名内部类对象
//        CreateCar cc = new CreateCar(){
//            @Override
//            public Car create(String name, double price) {
//                return new Car(name, price);
//            }
//        };
        // CreateCar cc = (name, price) -> new Car(name, price); // lambda
        CreateCar cc = Car::new; // lambda

        Car c = cc.create("Benz", 49.9);
        System.out.println(c);
    }
}

interface CreateCar{
    Car create(String name, double price);
}
