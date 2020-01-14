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

    Pet (int eyes){            //Констуктор
        this.eyes =2 ;
        System.out.println("I am pet");
    }

    void run(){
        System.out.println("Pet runs");
    }

    void jump () {
        System.out.println("Pet jumps");

    }

}