package com.company.Lesson7.HomeWork;

public class EmployeeTest {
           public static void main(String[] args) {
            Employee emp = new Employee(101);
            Employee emp1 = new Employee("Иванов");
            // Employee emp2 = new Employee(100.2);

            System.out.println(emp.id);
            System.out.println(emp.surname);
            // System.out.println(emp.salary);


            System.out.println(emp1.id);
            System.out.println(emp1.surname);
//            System.out.println(emp1.salary);



            emp.getId();
            emp.getSurname();
            emp.getSalary();

               emp1.getId();
               emp1.getSurname();
               emp1.getSalary();


           }
}
