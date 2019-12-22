package com.company.Lesson5;



public class CarTo { //класс описывающий создание Car
    CarTo (String cvet, String motor) { //конструктор с переменными
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины: " + color + " мотор машины: " + engine);

    }
    // переменный в классе
    String color;
    String engine;

}

class CarToTest{
    public static void main(String[] args) {
        int a;
        CarTo car1 = new CarTo("black","V8"); // создание объекта с двумя переменными с помощью конструтора

    }
}
