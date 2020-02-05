package com.company.Lesson8;
//* Создать класс Circle, который содержит: 1) переменную radius;
// 2) методы, вычисляющие площадь и длину окружности;
// 3) константу PI.
// Создать несколько объектов данного класса. */
// Длинна окружности P=2πR
// Площадь окружности S=πR²

public class Circle {
    private double radius;
    final private double pi = 3.14;

    public double theCircumference (double radius){
        double l;
        l = 2*pi*radius;
        return l;
    }

    public double theAreaOfCircle (double radius) {
        double s;
        s = pi*(radius*radius);
        return s;
    }

}

class TestCircle{
    public static void main(String[] args) {
        Circle cr1 = new Circle();
        Circle cr2 = new Circle();

        System.out.println(cr1.theAreaOfCircle(10.0));
        System.out.println(cr2.theCircumference(12.0));

    }

}