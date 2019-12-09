package com.company.lesson13;

public class Book {
    public int pages;
    public String name;
    public float weight;

    public void getInfoBook () {
        System.out.print("В книге " + name + " находиться " + pages + " страниц. ");
        System.out.print("При этом она весит " + weight);
    }
}
