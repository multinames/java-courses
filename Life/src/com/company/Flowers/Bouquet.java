package com.company.Flowers;

import java.util.ArrayList;
import java.util.HashMap;


public class Bouquet {

    private String name; // Имя букета
    private int count;

    // Таблица количества цветов
    HashMap<String, Integer> flowerTab = new HashMap<>();

    public String getName() {
        return name;
    }

    // Конструктор букета
    public Bouquet(String name){
        this.name = name;
    }

    // Метод подсчтета стоиомости букета
    public void checkBouquet(String name, ArrayList<Flower> bouquet) {
        double itog = 0.0;
        int getid;
        // count = 0;

        for (Flower flower: bouquet) {
           itog = itog +flower.getPrice();
           count+=1;

           if (flowerTab.get(flower.getLabel()) != null) {
               getid = flowerTab.get(flower.getLabel());
           } else { getid =0;}

           flowerTab.put(flower.getLabel(), getid+=1);

        }
        System.out.println("Цена букета \""+name+  "\" = " + itog+ " Всего цветов: " +count + " "+ flowerTab);

    }


}


