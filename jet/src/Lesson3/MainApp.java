package Lesson3;
// Generic
public class MainApp {
    public static void main(String[] args) {
        Printer printer = new Printer();
        /*printer.print("Hello");
        printer.print(1);
        printer.printerPlus(1);*/

        printer.<String>print("Hello");

        People<String> people = new People<String>();
        people.item = "Hello, I'm human";
        System.out.println(people);

        People<Integer> people1 = new People<>();
        people1.item = 10;
        System.out.println(people1);
    }
}

class Printer {
     public <T> void print (T message){
         System.out.println(message);
     }

     /*     public void print (int message) {
         System.out.println(message);
     }*/

     public void printerPlus(Object message) {
         Integer value = (Integer) message;
         System.out.println(1+value);
     }
}

class People<T>{
    T item;

    @Override
    public String toString() {
        return item.toString();
    }
}