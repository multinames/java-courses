package com.company.Lesson4;

public class Student {
    int studient_card;
    String student_name;
    String student_lastname;
    int year;
    int avg_math;
    int avg_ecom;
    double avg_lang;
}

class StudentTest{
    private static double summ;


    public static void main(String[] args) {
        Student Piter = new Student();
        Student Mike = new Student();
        Student Jonh = new Student();

        Piter.studient_card = 110;
        Piter.student_name = "Петя";
        Piter.student_lastname = "Иванов";
        Piter.year = 1988;
        Piter.avg_math = 4;
        Piter.avg_ecom = 3;
        Piter.avg_lang = 5;

        Mike.studient_card = 115;
        Mike.student_name = "Миша";
        Mike.student_lastname = "Петров";
        Mike.year = 1988;
        Mike.avg_math = 5;
        Mike.avg_ecom = 4;
        Mike.avg_lang = 4;

        Jonh.studient_card = 120;
        Jonh.student_name = "Женя";
        Jonh.student_lastname = "Сидиров";
        Jonh.year = 1989;
        Jonh.avg_math = 4;
        Jonh.avg_ecom = 3;
        Jonh.avg_lang = 4;

        System.out.println("Средняя оценка студента " +  Piter.student_name + " " + Piter.student_lastname + " " +(Piter.avg_math+Piter.avg_ecom+Piter.avg_lang)/3);
        System.out.println("Средняя оценка студента " +  Mike.student_name + " " + Mike.student_lastname + " " +(Mike.avg_math+Mike.avg_ecom+Mike.avg_lang)/3);
        System.out.println("Средняя оценка студента " +  Jonh.student_name + " " + Jonh.student_lastname + " " +(Jonh.avg_math+Jonh.avg_ecom+Jonh.avg_lang)/3);
        summ = (Jonh.avg_math+Jonh.avg_ecom+Jonh.avg_lang)/3;



    }

}