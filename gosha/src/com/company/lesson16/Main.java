package com.company.lesson16;
// Полиморфизм
public class Main {
    public static void main(String[] args) {
        Shape [] arr = new Shape[] {new Circle(), new Square(), new Triangle()}; // Shape - массив из объектов, поместили три обьекта
        for (int i = 0; i < arr.length; i++)
            arr [i].draw();

    }
}
