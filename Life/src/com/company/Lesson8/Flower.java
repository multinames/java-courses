package com.company.Lesson8;

public class Flower {
    String name;
    double price;

    public void makeBouquet(int flower, double price, String name){

        String[] arr = new String[flower];
        for (int i=0; i<flower;i++) {
            arr[i] = name;
        }
        System.out.print("Состав букета - (");
        for (String i: arr
             ) {
            System.out.print(i+ " ");

        }
        System.out.println(") Цена букета: " +flower*price);
    }
}

class TestFlower {
    public static void main(String[] args) {
        Flower bouquet1 = new Flower();
        bouquet1.makeBouquet(15,13.0, "Роза");
        bouquet1.makeBouquet(9,9.0, "Тюльпан");
        bouquet1.makeBouquet(5,32.0, "Лилия");


    }
}