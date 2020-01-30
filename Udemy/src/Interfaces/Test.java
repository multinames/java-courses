package Interfaces;

public class Test {
    public static void main(String[] args) {
        // В каждом классе Animal и Person существуют методы из интерфейса Info;

        Animal animal1 = new Animal(1);
        Person person1 = new Person("Mark");

        outputInfo(animal1);
        outputInfo(person1);

/*
        Info info1 = new Animal(124);
        Info info2 = new Person("Ivan");
*/
/*

        info1.showInfo();
        info2.showInfo();
*/

/*
        outputInfo(info2);
        outputInfo(info1);
*/

        /*Animal animal1 = new Animal(231);
        Person person1 = new Person("Piter");*/

/*        animal1.sleep();
        person1.sayHello();*/
/*
            animal1.showInfo();
            person1.showInfo();*/
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
