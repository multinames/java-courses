package com.company.JavaRush.levels1_3;

public class CatsCount {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        //напишите тут ваш код
        Cat.count=++Cat.count;

        Cat cat2 = new Cat();
        Cat.count=++Cat.count;

        System.out.println("The cat count is " + Cat.count);
    }


    public static class Cat {
        public static int count = 0;
    }
}
