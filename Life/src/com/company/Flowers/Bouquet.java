package com.company.Flowers;

public class Bouquet {

    public void createBouquet() {

    }

    }

class CreateBouquet {
    public static void main(String[] args) {
        Flower rose = new Rose();
        Flower tulip = new Tulip();
        Flower lily = new Lily();
        Flower carnation = new Carnation();

        rose.setPrice(80.5);
        tulip.setPrice(30.5);
        lily.setPrice(120.4);
        carnation.setPrice(101.2);

        Bouquet bouquet1 = new Bouquet();
    }
}
