package com.company.JavaRush.level5;

public class Car {
    static int km;

    public static void main(String[] args) {
        Car orangeCar = new Car();
        orangeCar.km = 100;

        Car blueCar = new Car();
        blueCar.km = 85;

        System.out.println("Orange car - " + orangeCar.km);
        System.out.println("Blue car - " + blueCar.km);
    }
}
