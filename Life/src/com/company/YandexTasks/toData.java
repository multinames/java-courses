package com.company.YandexTasks;

import java.util.Arrays;

public class toData {

    public static void main(String[] args) {
        Person person1 = new Person("Pider",45,"man");
        Person person2 = new Person("Bob",41,"man");
        Person person3 = new Person("Olga",45,"woman");


        Employee employee = new Employee(person1,person2,person3);
        System.out.println(employee.toString());
    }

    public static class Employee {
        Person[] list;

        @Override
        public String toString() {
            return "Employee{" +
                    "list=" + Arrays.toString(list) +
                    '}';
        }

        public Employee(Person...argumets) {
            this.list=argumets;
        }
    }


    public static class Person{
        String name;
        int age;
        String sex;

        public Person(String name, int age, String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
