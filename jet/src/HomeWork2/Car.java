package HomeWork2;

import HomeWork2.details_car.Engine;
import HomeWork2.professions_car.Driver;

public class Car {

    String mark;
    String carClass;
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
        System.out.println(mark+carClass+weight+driver+engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}

class Lorry extends Car {
    int cargoWeight;
}

class SportCar {
    double maxSpeed;
}

class TestCar {
    public static void main(String[] args) {

        Car car = new Car();
        Engine type1 = new Engine();

        car.mark="Nissan";

        car.printinfo();

    }
}
