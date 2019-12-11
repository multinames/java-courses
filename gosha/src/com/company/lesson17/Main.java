package com.company.lesson17;

// Вложенные классы
public class Main {
    public static void main(String[] args) {

        Computer comp = new Computer();
        comp.i7.start();
        comp.transcend.start();
        comp.transcend.shutdown();

    }
}
