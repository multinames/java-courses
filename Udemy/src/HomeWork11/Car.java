package HomeWork11;

public class Car {
    String color;
    String engine;
    int doors;

    Car (String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;

    }
}

class CarTest{

    public static void changeDoors(Car c, int d){
    c.doors = d;
    }

    public static void changeColor (Car c1, Car c2) {
        String c3 = c1.color;
        c1.color = c2.color;
        c2.color = c3;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "V6", 3);
        Car car2 = new Car("black", "V8", 5);


        System.out.println(car1.color);
        changeDoors(car1,4);
        changeColor(car1, car2);

        System.out.println("Car 1: цвет " +car1.color + ", двигатель " +car1.engine +", кол-во дверей "+ car1.doors);
        System.out.println("Car 2: цвет " +car2.color + ", двигатель " +car2.engine +", кол-во дверей "+ car2.doors);

    }
}


