package HomeWork2;

import HomeWork2.details_car.Engine;
import HomeWork2.professions_car.Driver;

public class Car {

    String mark;
    String carClass;
    int weight;

    Driver driver;
    Engine engine;

/*    public Car(){  }*/

/*    public Car(Engine engine, Driver driver){
        this.engine = engine;
        this.driver = driver;
    }*/


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
        return
                "mark='" + mark + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine
                ;
    }


    public void setEngine(Engine engine) {
        this.engine = engine;
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

        Engine eng = new Engine();
        eng.manufacture="Volvo";
        eng.power = 250;

        Car car = new Car();

        car.setEngine(eng);
        car.mark="Nissan";
        car.carClass = "C";
        car.weight = 1024;

        System.out.println(car.toString());
    }
}
