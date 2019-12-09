package com.company.lesson13;

public class Main {
    public static void main(String[] args) {
        Person ser = new Person(); // ser - объект
        ser.height = 166;
        ser.say("Geogre");
        System.out.println(ser.height); // вызывали поле height из класса Person для объекта ser
        Person vlad = new Person();
        System.out.print(vlad.height);

    }
}
