package com.company.lesson15;

public class Triangle {

    /**
     * Специальный метод, называемый конструктор класса.
     * Принимает на вход три параметра:
     * длина стороны А, длина стороны Б,
     * угол между этими сторонами(в градусах)
     */
    Triangle(double sideA, double sideB, double angleAB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAB = angleAB;
    }

    double sideA; //Поле класса, хранит значение стороны А в описываемом треугольнике
    double sideB; //Поле класса, хранит значение стороны Б в описываемом треугольнике
    double angleAB; //Поле класса, хранит угла(в градусах) между двумя сторонами в описываемом треугольнике

    /**
     * Метод класса, который рассчитывает площадь треугольника
     */
    double getSquare() {
        double square = this.sideA * this.sideB * Math.sin(this.angleAB * Math.PI / 180);
        return square;
    }

    /**
     * Метод класса, который рассчитывает периметр треугольника
     */
    double getPerimeter() {
        double sideC = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2) - 2 * this.sideA * this.sideB * Math.cos(this.angleAB * Math.PI / 180));
        double perimeter = this.sideA + this.sideB + sideC;
        return perimeter;
    }
}

