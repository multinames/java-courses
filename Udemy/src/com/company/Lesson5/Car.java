package com.company.Lesson5;

    public class Car { //класс описывающий создание Car
        Car (String cvet, String motor) { //конструктор с переменными
            color = cvet;
            engine = motor;

        }
        // переменный в классе
        String color;
        String engine;

    }

    class CarTest{
        public static void main(String[] args) {
            int a;
            Car car1 = new Car("yelow","V4"); // создание объекта с двумя переменными с помощью конструтора

            System.out.println(car1.color);
            System.out.println(car1.engine);
        }
    }

