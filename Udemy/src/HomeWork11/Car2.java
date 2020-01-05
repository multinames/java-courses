package HomeWork11;

public class Car2 {
    public static class Car {
        String color;
        String engine;
        int doors;

        Car (String color, String engine, int doors) { // Конструктор
            this.color = color;
            this.engine = engine;
            this.doors = doors;

        }
    }

        public static void main(String[] args) {

            Car car1 = new Car("red", "V6", 3);
            Car car2 = new Car("red", "V6", 3);

            boolean b = car1.color.equals(car2.color);
            System.out.println(b);


        }
    }

