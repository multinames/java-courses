package com.company.lesson14;


public class Main {
    public static void main(String[] args) {
        Person ser = new Person(166, "Sergey"); // создание объекта ser c ростом 166

        System.out.println(ser.name +"'s heights is " + ser.height);

        Person vlad = new Person();
        System.out.println(vlad.height);

        Person dima = new Person("Dima");
        System.out.print(dima.name);
        System.out.println();

    }
}
