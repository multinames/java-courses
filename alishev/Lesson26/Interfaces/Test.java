package Interfaces;

public class Test {

    public static void main(String[] args) {
        /*Animal animal = new Animal(1);
        Person person = new Person("Bob"); */

        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");

        /*animal.showInfo();
        person.showInfo() */;

        info1.showInfo();
        info2.showInfo();
    }
}
