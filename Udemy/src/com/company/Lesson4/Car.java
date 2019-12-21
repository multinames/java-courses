package com.company.Lesson4;

public class Car {
    String color = "red";
    String engine = "V6";

}

class CarTest{
    public static void main(String[] args) {
        int a;
        Car car1 = new Car();
        Car car2 = car1;
        Car car3;
        System.out.println(new Car().color);
    }
}