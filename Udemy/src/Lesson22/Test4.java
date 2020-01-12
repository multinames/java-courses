package Lesson22;
// Super конструктор
public class Test4 {
}

class Human2 {
    Human2 (String n) {
        this(n, null); // Вызов Overloaded конструктора Human2 (String n, String s)
    }
    Human2 (String n, String s) { // Вызов конструктора Object
        name = n;
        surename = s;
    }

String name;
String surename;
}

class Student2 extends Human2 {

    Student2() { // вызов конструктора Student2(int i)
        this(5);
        System.out.println("Hello!");
    }

    Student2(int i){
        super("Питер"); // вызов конструтктора супер-класса Human2 (String n)
    };
    public static void main(String[] args) {
        Student2 st = new Student2(); // вызов конструктора Student2()
    }
}

