package com.company.Lesson48;

public class Test {

    /*private  static final int DOG = 0;
    private  static final int CAT = 1;
    private  static final int FROG = 2;*/

    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal) {
            case CAT:
                System.out.println("It's Cat");
                break;
            case DOG:
                System.out.println("It's Dog");
                break;
            case FROG:
                System.out.println("It's Frog");
                break;
        }

    }
}
