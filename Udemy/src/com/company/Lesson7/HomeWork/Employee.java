package com.company.Lesson7.HomeWork;

public class Employee {

    // Переменные

    int id;

    public String surname;

    private double salary;

    String department;

    // Конструкторы

    public  Employee(int id2) { //Конструктор
        id = id2;
    }

    Employee(String surname2) { //Конструктор
        surname = surname2;
    }

    private Employee(double salary2) { //Конструктор
        salary = salary2;
    }

    // Методы

    public void getId() {   // id сотрудника доступно внутри пакета
                System.out.println("ID сотрудника = " + id);
    }

    public void getSurname() {
        System.out.println("Фамилия сотрудника = " + surname);
    }

    public void getSalary() { // salary недоступно вне класса
        System.out.println("Зарплата сотрудника = " + salary);
    }

}

/*class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee(101);
        Employee emp1 = new Employee("Иванов");
        // Employee emp2 = new Employee(100.2);

        System.out.println(emp.id);
        System.out.println(emp.surname);
        // System.out.println(emp.salary);

*//*
            System.out.println(emp1.id);
            System.out.println(emp1.surname);
            System.out.println(emp1.salary);


*//*
        emp.getId();
        emp.getSurname();
        emp.getSalary();

    }
}*/
