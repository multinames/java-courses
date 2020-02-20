package com.company.Flowers;

import java.util.ArrayList;
import java.util.HashMap;


public class Bouquet {

    private String name; // Имя букета
    private int count;


    HashMap<String, Integer> countId = new HashMap<>();

    public String getName() {
        return name;
    }

    // Конструктор
    public Bouquet(String name){
        this.name = name;
    }


    // Метод подсчтета стоиомости букета
    public void checkBouquet(String name, ArrayList<Flower> bouquet) {
        double itog = 0.0;
        int getid = 0;
        count = 0;

        for (Flower flower: bouquet) {
           itog = itog +flower.getPrice();
           count=count+1;

           if (countId.get(flower.getLabel()) != null) {
               getid = countId.get(flower.getLabel());
           } else { getid =0;}

           countId.put(flower.getLabel(), getid+=1);
//            System.out.print(flower.getLabel()+" "+countId.get(flower.getLabel())+" ");

        }
        System.out.println("Цена букета \""+name+  "\" = " + itog+ " Всего цветов: " +count + " "+ countId);

    }

}

class CreateBouquet {
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

       // System.out.println(lily.getId());

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


        bb1.checkBouquet(bb1.getName(), buk1);
        System.out.println();
        bb2.checkBouquet(bb2.getName(), buk2);

    }
}
