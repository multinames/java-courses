package com.company.Lesson9;

public class Car {

    int s = 10;
    String color;
    String engine;
    static int count;

    public Car(String color, String engine){  // Конструктор
        int x=5;
        int y = x+10;
        count++;
        this.color = color;   //this.color - означает принадлежность к текущему обьекту ;= color -переменная из параметра.
        this.engine = engine;
    }


/*    public  void showColor(){
        System.out.println("Цвет машины : " + color);
        changeColor("Red");
    }*/

    public void changeColor(String color){
        System.out.println(color);

    }

    public static void main(String[] args) {
        Car c = new Car ("red", "V6");
        System.out.println(c.color);
        c.changeColor("black");
        System.out.println(c.color);


    }
}
