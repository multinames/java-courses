package com.company.Lesson7_1;

import com.company.Lesson7.HomeWork.Employee;

public class Employee2 {

}

class Employee2Test2{
    public static void main(String[] args) {

        Employee emp1 = new Employee(2);
        /*Employee emp2 = new Employee("Иванов");
        Employee emp3 = new Employee(555.55);*/

        // System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);

        emp1.getId();
        emp1.getSurname();
        emp1.getSalary();


    }
}
