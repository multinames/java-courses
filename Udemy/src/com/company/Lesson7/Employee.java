package com.company.Lesson7;

public class Employee {

    public double salary;

    public void doublezp(){

        double result = salary*2; // переменная только внутри метода.

        System.out.println("Новая з/п = "+ result);
    }

    public Employee(double salary2) { //Конструктор
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(230);
        System.out.println(emp.salary);
        emp.doublezp();
    }

    static class EmployeeTest{

        public static void main(String[] args) {
            Employee emp = new Employee(230);
            System.out.println(emp.salary);
            System.out.println("Test");
            emp.doublezp();

        }
    }

}
