package com.company.lesson15;

public class Student extends Person { // класс Student
    int course = 1;

    // конструктор
    public Student (int height, String name, int course){  //записываем два параметра в главный конструктор
        super(height,name);
        this.course = course;  //this.course -переменная класса, course- переменная конструктора
    };

    // метод
    void tell() {  // метод tell, выводит три значения в класса Student
        System.out.println(super.name);  //super - обратится к полям класса Person
        System.out.println(super.height);
        System.out.println(course);
    }

}
