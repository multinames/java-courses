package HomeWork22;

// Класс Animal

public class Animal {
    int eyes;

    Animal () { // Конструктор
        System.out.println("I am animal");
    }

    void eat(){ // Метод
        System.out.println("Animal eats");
    }

    void drink() { // Метод
        System.out.println("Animal drinks");
    }

}

class Pet extends Animal { // наследуем класс
    String name;
    final int tail = 1;
    final int paw = 4;

    Pet (){            //Констуктор
        eyes =2 ;
        System.out.println("I am pet");
    }

    void run(){
        System.out.println("Pet runs");
    }

    void jump () {
        System.out.println("Pet jumps");

    }
}

class Dog extends Pet { // наследуем класс

    Dog(String n) {
        name = n;
        System.out.println("I am dog and my name is: " +name);

    }
    void play (){
        System.out.println("Dog Plays");
    }

}

class Cat extends Pet { //наследуем класс

    Cat(String n) {
        this.name = n;
        System.out.println("I am cat and my name is: " +name);

    }

    void sleep(){
        System.out.println("Cat sleeps");
    }

}

class TestAnimal{
    public static void main(String[] args) {
        // Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Маркиз");
        //System.out.println("Всего лап :" +dog1.paw);
         cat1.sleep();
    }
}