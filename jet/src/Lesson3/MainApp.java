package Lesson3;
// Generic
public class MainApp {
    public static void main(String[] args) {
        Printer printer = new Printer();
        /*printer.print("Hello");
        printer.print(1);
        printer.printerPlus(1);*/

       /* printer.<String>print("Hello");*/

        People<String> people = new People<String>();
        /*people.item = "Hello, I'm human";
        System.out.println(people);*/

        People<Integer> people1 = new People<>();
        /*people1.item = 10;
        System.out.println(people1);*/

        Animal animal = new Animal("Dog");
        Animal animal1 = new Animal("Dog");
        System.out.println(animal.equals(animal1));

        Box box = new Box(10);
/*        box.add(printer);
        box.add(people);
        box.add(people1);*/

/*        for (int i=0; i<box.count; i++) {
            Printer printer1 = (Printer) box.get(i);
            printer1.print("Hello!!!");
        }*/
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

class Animal {
    public String name;

    public Animal(String name) {
        this.name=name;
    }
@Override
    public boolean equals (Object obj) {
        if (obj instanceof  Animal) {
            return this.name == ((Animal) obj).name;
        }
        return false;
    }

    public String toString () {
        return name;
    }
}