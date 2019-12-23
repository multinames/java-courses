package com.company.Lesson6.HomeWork;

// Домашняя работа

public class Student {

    Student() {

    }

    Student(int id2, String name2, String lastname2, int course2) {
        this(id2, name2, lastname2, course2, 4,4,5);
    }

   Student (int id1, String name1, String lastname1, int couser1, int mathAverageGrade1, int ecomAverageGrade1, int langAverageGrade1 ) {
        id = id1;
        name = name1;
        lastname = lastname1;
        course = couser1;
        mathAverageGrade = mathAverageGrade1;
        ecomAverageGrade = ecomAverageGrade1;
        langAverageGrade = langAverageGrade1;


    }

    int id;
    String name;
    String lastname;
    int course;
    int mathAverageGrade;
    int ecomAverageGrade;
    int langAverageGrade;




    void AverageGrade (String lastname, int math, int econ, int lang){
        double srednyayaOcenka = (math+econ+lang) /3;
        System.out.println("Средня оценка студента " + lastname + " : " + srednyayaOcenka);
    }
}

class StudentTest {

    public static void main(String[] args) {
        Student Piter = new Student(100, "Питер", "Иванов",2,4,4,5);
        Student Ivan = new Student(110,"Иван","Петров",2);
        Student Jonh = new Student();

        System.out.println(Piter.lastname);
        System.out.println(Ivan.lastname);
        System.out.println(Jonh.lastname);
    }

}

