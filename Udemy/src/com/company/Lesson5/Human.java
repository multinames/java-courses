package com.company.Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info() {
        System.out.println("Имя: " + name + " Цвет машины: " +car.color + " Баланс счета: " + bA.balance);

    }
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Devid";
        h.car = new Car3("Black", "V8");
        h.bA = new BankAccount(18, 200.5);
        h.info();

    }
}
class Car3{
    Car3(String c , String e) { // Конструктор
        color=c;
        engine = e;

    }
    // Пемернные
    String color;
    String engine;
        }
class BankAccount {
    BankAccount(int id2, double balance2) { // Конструктор
        id = id2;
        balance = balance2;
    }
    // перменные
    int id;
    double balance;
}