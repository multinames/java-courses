package Lesson2;

import java.security.PublicKey;

public class A {
    static {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }

    public A (){
        System.out.println(3);
    }
}

class B extends A {
    static {
        System.out.println(4);
    }
    {
        System.out.println(5);
    }
    public B() {
        System.out.println(6);
    }
}