package com.company.Lesson5.HomeWork;

// Задача - увелчить з/п вдвое для сотрудника

public class Employee {

    // переменные для сотрудника
    int id;
    String surname;
    int age;
    double salary;
    String department;

    // шаблон метода увеличения з/п вдвое

    double salaryIncrease(String name, double zarplata) {
        double NewSalary = zarplata * 2;
        return NewSalary;
    }

}

class TestEmployee{

    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.surname = "Иванов";
        emp1.age = 29;
        emp1.department = "IT";
        emp1.salary = 1250.90;

        System.out.println("Оклад для "+emp1.surname+ " теперь составляет: "+ emp1.salaryIncrease(emp1.surname, emp1.salary) +" USD");

    }

}
