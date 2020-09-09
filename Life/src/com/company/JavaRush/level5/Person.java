package com.company.JavaRush.level5;

public class Person {
    String name;
    int age;
    // char sex ;

    public void initialize(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Иван",25);
    }
}
