package com.company.Lesson8;

public class Student { // Класс
    String name;
    int course; // non-static переменная, не существует без создания объекта
    static int count; // static-переменная, не зависит от ее наличия в объектах
    int a; // non-static переменная

    public Student(String name2, int course2){  // Конструктор
        count++;
        name = name2;
        course = course2;
        System.out.println("Студент # " +count+ " создан");

    }

    public static void ShowCount(){
        System.out.println("Всего создано студентов "+count);

    }

    public void showInfo(){
        System.out.println("Welcome to student class");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student st2 = new Student("Петр",1);
        st2.a++;
        //a++;

    }


    public static void main(String[] args) {
        abcd();
        Student st3 = new Student("Иван",4);
        st3.abc();

        /*Student st1 = new Student("Иван", 1);
        Student st2 = new Student("Питер", 4);
        Student st3 = new Student("Маша", 2);

        // System.out.println(count);
        ShowCount();*/
    }
}

