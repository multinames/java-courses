package Lesson23;

import HomeWork19.Test;

public class Test4 {

    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse m) {
        System.out.println("M");}

    public static void main(String[] args) {
        Test4 t = new Test4();
        Animal an=new Mouse();
        t.abc(an);
    }
}



class Animal4 {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse4 extends Animal4 {
    void getName() {
        System.out.println("Mouse");
    }
}