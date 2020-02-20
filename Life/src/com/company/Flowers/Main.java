package com.company.Flowers;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Создание цветов
        Flower rose = new Rose("Роза белая",95.5,"rose1");
        Flower tulip = new Tulip("Тюльпан обычный",55.3,"tul1");
        Flower lily = new Lily("Лилия белая",140.3,"lil1");
        Flower carnation = new Carnation("Гвоздика обычная",69.0,"car1");

        // Создание букетов
        Bouquet bb1 = new Bouquet("Розы и лилии");
        Bouquet bb2 = new Bouquet("Пять гвоздик");
        Bouquet bb3 = new Bouquet("8 марта");


        ArrayList<Flower> buk1 = new ArrayList<>();
        buk1.add(rose);
        buk1.add(rose);
        buk1.add(rose);
        buk1.add(lily);
        buk1.add(lily);

        ArrayList<Flower> buk2 = new ArrayList<>();
        buk2.add(carnation);
        buk2.add(carnation);
        buk2.add(carnation);
        buk2.add(carnation);
        buk2.add(carnation);


        ArrayList<Flower> buk3 = new ArrayList<>();

        buk3.add(rose);
        buk3.add(rose);
        buk3.add(rose);
        buk3.add(rose);
        buk3.add(rose);
        buk3.add(rose);
        buk3.add(rose);


        bb1.checkBouquet(bb1.getName(), buk1);
        System.out.println();
        bb2.checkBouquet(bb2.getName(), buk2);
        System.out.println();
        bb3.checkBouquet(bb3.getName(), buk3);


}
}
