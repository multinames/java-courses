package com.company.lesson14;

public class Sherlock {
    public static void main(String[] args) {
        Book sherlock_holms = new Book(460, 1.7f); // Используем 1 конструктор
        sherlock_holms.name = "Шерлок Холмс"; // Устанавливаем вручную значение для name
        sherlock_holms.getInfoBook ();

        Book green_mile = new Book(750, 2.8f, "Зеленая миля"); // Используем второй конструктор
        green_mile.getInfoBook ();
    }
}
