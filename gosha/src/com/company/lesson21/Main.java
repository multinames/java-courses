package com.company.lesson21;

// Модификаторы static и final
// final - создание константы, которую нельзя препресваивать. Класс final не может иметь наследников.

public class Main {
    public static void main(String[] args) {
        //final int a = 10;
        int x = Math.mult(12,23);
        System.out.println(x);
        Math a = new Math();
        System.out.println(a.x);
        a.x = 24;
        System.out.println(a.x);
        Math b = new Math();
        System.out.println(b.x);


    }


}
