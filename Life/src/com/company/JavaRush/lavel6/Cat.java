package com.company.JavaRush.lavel6;

import java.util.ArrayList;

/*
Статические коты
*/

public class Cat {

    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {

    }

    public static void main(String[] args) {
        //напишите тут ваш код

        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());
        Cat.cats.add(new Cat());

        printCats();

    }

    public static void printCats() {

        for (Cat item : cats
             ) {
            System.out.println(item);
        }

    }

}