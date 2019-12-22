package com.company.Lesson4;

public class Student {
    int studient_card;
    String student_name;
    String student_lastname;
    int course;
    int mathAverageGrade;
    int ecomAverageGrade;
    double langAverageGrade;
}

class StudentTest{

    public static void main(String[] args) {
        Student Piter = new Student();
        Student Mike = new Student();
        Student Jonh = new Student();

        Piter.studient_card = 110;
        Piter.student_name = "Петя";
        Piter.student_lastname = "Иванов";
        Piter.course = 2;
        Piter.mathAverageGrade = 4;
        Piter.ecomAverageGrade = 3;
        Piter.langAverageGrade = 5;

        Mike.studient_card = 115;
        Mike.student_name = "Миша";
        Mike.student_lastname = "Петров";
        Mike.course = 1;
        Mike.mathAverageGrade = 5;
        Mike.ecomAverageGrade = 4;
        Mike.langAverageGrade = 4;

        Jonh.studient_card = 120;
        Jonh.student_name = "Женя";
        Jonh.student_lastname = "Сидиров";
        Jonh.course = 3;
        Jonh.mathAverageGrade = 4;
        Jonh.ecomAverageGrade = 3;
        Jonh.langAverageGrade = 4;

        System.out.println("Средняя оценка студента " +  Piter.student_name + " " + Piter.student_lastname + " " +(Piter.mathAverageGrade+Piter.ecomAverageGrade+Piter.langAverageGrade)/3);
        System.out.println("Средняя оценка студента " +  Mike.student_name + " " + Mike.student_lastname + " " +(Mike.mathAverageGrade+Mike.ecomAverageGrade+Mike.langAverageGrade)/3);
        System.out.println("Средняя оценка студента " +  Jonh.student_name + " " + Jonh.student_lastname + " " +(Jonh.mathAverageGrade+Jonh.ecomAverageGrade+Jonh.langAverageGrade)/3);

    }

}