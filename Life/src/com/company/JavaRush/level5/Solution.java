package com.company.JavaRush.level5;

public class Solution {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Василий",12,5,4);
        Cat cat2 = new Cat("Мурзик",10,3,5);
        Cat cat3 = new Cat("Маркиз",8,7,6);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));

        //напишите тут ваш код


    }

        public static class Cat {
            protected String name;
            protected int age;
            protected int weight;
            protected int strength;

            public Cat(String name, int age, int weight, int strength) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.strength = strength;
            }


            public boolean fight(Cat anotherCat) {
                int ageScore = Integer.compare(this.age, anotherCat.age);
                int weightScore = Integer.compare(this.weight, anotherCat.weight);
                int strengthScore = Integer.compare(this.strength, anotherCat.strength);
                int score = ageScore + weightScore + strengthScore;
                return score > 0; // return score > 0 ? true : false;

            }

        }
    }
