package com.company.JavaRush.level5;

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat (String name){
        this.name = name;
        age = 3;
        weight = 4;
        color="Серый";
    }

    public Cat(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        color="Серый";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        weight = 3;
        color="Серый";
    }

    public Cat(int weight, String color){
        name = "Василий";
        age = 3;
        this.weight=weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address){
        age = 3;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Василий");
    }
}
