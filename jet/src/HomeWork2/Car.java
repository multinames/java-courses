package HomeWork2;

import HomeWork2.details_car.Engine;
import HomeWork2.details_car.Engine.*;
import HomeWork2.professions_car.Driver;
import HomeWork2.professions_car.Driver.*;

public class Car {


    String mark;
    String classs;
    int weight;

    Driver driver;
    Engine engine;

  public void start(){
      System.out.println("Поехали");
  }
  public void stop(){
      System.out.println("Стоп");
  }
  public void turnLeft(){
      System.out.println("Повернуть налево");
  }

    public void turnRight(){
        System.out.println("Повернуть направо");
    }
    public void printinfo(){
        System.out.println(mark+classs+weight+driver+engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", classs='" + classs + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}

class Lorry extends Car {
    int kuzovWeight;
}

class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.mark="Nissan";
        car.printinfo();
    }
}
