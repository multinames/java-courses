package com.company.lesson14;

public class Person {
    // перменные
    public int height = 180; // поле рост, public (доступен) - модификатор доступа

    public String name = "Default"; // поле имя


    // Конструкторы
    public Person () { //конструктор по умолчанию
         }

    public Person (int h, String n) {
        height = h;
        name = n;
        }

    public Person (String n) {
        name = n;
    }

}
