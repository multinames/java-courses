package Lesson22;
// Super конструктор
public class Test4 {
}

class Human2 {
    /*Human2 (String n) {
        this(n, null);
    }
    Human2 (String n, String s) {
        name = n;
        surename = s;
    }*/

String name;
String surename;
}

class Student2 extends Human2 {
    Student2(){
        super(); // вызов конструтктора супер-класса;
    };
    public static void main(String[] args) {
        Student2 st = new Student2();
    }
}

