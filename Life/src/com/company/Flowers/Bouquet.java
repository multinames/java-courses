package com.company.Flowers;

import java.util.ArrayList;

public class Bouquet {

    public void createBouquet() {

    }

}

class CreateBouquet {
    public static void main(String[] args) {
        Flower rose = new Rose(85.5,"Одна роза");
        Flower tulip = new Tulip(55.3,"Один тюльпан");
        Flower lily = new Lily(102.5,"Одна лилия");
        Flower carnation = new Carnation(69.0,"Одна гвоздика");

       /* rose.setPrice(80.5);
        tulip.setPrice(30.5);
        lily.setPrice(120.4);
        carnation.setPrice(101.2);*/




        ArrayList<Flower> buk1 = new ArrayList<>();
        buk1.add(rose);
        buk1.add(rose);
        buk1.add(rose);
        buk1.add(lily);
        buk1.add(lily);

        System.out.println(lily);

        for (Flower bu : buk1 ) {

            System.out.println(bu);

        }

    }
}
