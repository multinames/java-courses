package com.company.lesson15;

public class Main2 {
    public static void main(String[] args) {
        //Значения 5, 17, 35 попадают в конструктор класса Triangle
        Triangle triangle1 = new Triangle(5, 17, 35);
        System.out.println("Площадь треугольника1: "+triangle1.getSquare());
        System.out.println("Периметр треугольника1: "+triangle1.getPerimeter());

        //Значения 6, 8, 60 попадают в конструктор класса Triangle
        Triangle triangle2 = new Triangle(6, 8, 60);
        System.out.println("Площадь треугольника1: "+triangle2.getSquare());
        System.out.println("Периметр треугольника1: "+triangle2.getPerimeter());
    }
}
