package com.company.Lesson5.HomeWork;

import java.util.PrimitiveIterator;

public class Student {
    int studient_card;
    String student_name;
    String student_lastname;
    int course;
    int mathAverageGrade;
    int ecomAverageGrade;
    double langAverageGrade;

}

class StudentTest {

    double AverageGrade (Student st){
        double srednyayaOcenka = (st.mathAverageGrade+st.ecomAverageGrade+st.langAverageGrade) /3;
        System.out.println("Средняя оценка студента " + st.student_lastname+  " " + st.student_lastname + ": " +srednyayaOcenka);
        return srednyayaOcenka;
    }

    public static void main(String[] args) {
        Student Piter = new Student();

        Piter.studient_card = 110;
        Piter.student_name = "Петя";
        Piter.student_lastname = "Иванов";
        Piter.course = 2;
        Piter.mathAverageGrade = 4;
        Piter.ecomAverageGrade = 3;
        Piter.langAverageGrade = 5;

        Student Mike = new Student();

        Mike.studient_card = 115;
        Mike.student_name = "Миша";
        Mike.student_lastname = "Петров";
        Mike.course = 1;
        Mike.mathAverageGrade = 5;
        Mike.ecomAverageGrade = 4;
        Mike.langAverageGrade = 4;

        Student Jonh = new Student();

        Jonh.studient_card = 120;
        Jonh.student_name = "Женя";
        Jonh.student_lastname = "Сидиров";
        Jonh.course = 3;
        Jonh.mathAverageGrade = 4;
        Jonh.ecomAverageGrade = 3;
        Jonh.langAverageGrade = 4;

        StudentTest sTest = new StudentTest() ;

        sTest.AverageGrade(Piter);
        sTest.AverageGrade(Mike);
        sTest.AverageGrade(Jonh);



    }

}