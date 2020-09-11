package com.company.JavaRush.lavel6;

//

public class SolCat {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        System.out.println(SolCat.Cat.catCount);
    }

    public static class Cat {

       public static int catCount =0;

        public Cat() {
            catCount++;
        }
    }
}
