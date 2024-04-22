package com.fengtaisec.d8_interface2;

import com.fengtaisec.d5_abstract2.Animal;
import com.fengtaisec.d5_abstract2.Cat;
import com.fengtaisec.d5_abstract2.Dog;
import com.fengtaisec.d7_interface.D;

public class Test {
    public static void main(String[] args) {
        // 接口的好处
        Driver s = new A();
        s.drive();

        Driver d = new B();
        d.drive();

        Animal a = new Cat();
        a.cry();



    }
}

class B implements Driver{
    @Override
    public void drive() {

    }
}

class A extends Student implements Driver, Singer{
    @Override
    public void sing() {

    }

    @Override
    public void drive() {

    }
}
class Student{

}

interface Driver{
    void drive();
}
interface Singer{
    void sing();
}
