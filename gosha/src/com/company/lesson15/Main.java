package com.company.lesson15;

import com.company.lesson15.Person;

public class Main {
    public static void main(String[] args) {
        Person ser = new Person(166, "Sergey"); // создание объекта ser c ростом 166

        System.out.println(ser.name +"'s heights is " + ser.height);

        Person vlad = new Person();
        System.out.println(vlad.height);

        Person dima = new Person("Dima");
        System.out.println(dima.name);
        System.out.println("");

        Student freshman =  new Student(176, "Victor", 2);  // создание объекта класса Student
        freshman.tell();

        Student fresh =  new Student(208, "Vlad", 4);  // создание объекта класса Student
        fresh.tell();

    }
}
