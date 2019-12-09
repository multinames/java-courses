package com.company.lesson14;

public class Book {
    private int pages;
    public String name;
    private float weight;

    public void getInfoBook () {
        System.out.print("В книге " + name + " находиться " + pages + " страниц. ");
        System.out.print("При этом она весит " + weight + "кг!");
        System.out.println("");
    }
// конструкторы
    // 1-ый конструктор
    Book (int pages, float weight) {
        this.pages = pages;
        this.weight = weight;
    }

    // 2-ой конструктор
    Book (int pages, float weight, String name) {
        this.pages = pages;
        this.weight = weight;
        this.name = name;
    }
}
