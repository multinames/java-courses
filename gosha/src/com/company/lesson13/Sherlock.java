package com.company.lesson13;

public class Sherlock {
    public static void main(String[] args) {
        Book sherlock_holms; // объявление переменной
        sherlock_holms = new Book(); // выделение памяти под объект Book
        sherlock_holms.name = "Записки о Шерлоке Холмсе";
        sherlock_holms.pages = 191;
        sherlock_holms.weight = 120;
        sherlock_holms.getInfoBook ();
    }
}
