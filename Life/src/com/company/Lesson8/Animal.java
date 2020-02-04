package com.company.Lesson8;

public class Animal {
    String food;
    String location;

    public Animal () {
    }

    public void makeNoise(){
    }

    public void eat() {
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}

class Dog extends Animal{
    @Override
    public void makeNoise (){
        System.out.println("Собака лает");
    }

    @Override
    public void eat () {
        System.out.println("Собака есть мясо");
    }
}

class Cat extends Animal{
    @Override
    public void makeNoise (){
        System.out.println("Кошка мяукает");
    }

    @Override
    public void eat () {
        System.out.println("Кошка есть консервы ");
    }
}

class Horse extends Animal{
    @Override
    public void makeNoise (){
        System.out.println("Лошадь фыркает");
    }

    @Override
    public void eat () {
        System.out.println("Лошадь есть овес ");
    }

}

class Veterinarian{

    public void treatAnimal(Animal animal){
        System.out.println(animal.food+ " " + animal.location);

    }
}

class TestAnimal {

    public static void main(String[] args)


      {
/*
        Animal an1 = new Animal();
        an1.sleep();
*/

        Animal dog1 = new Dog();
        dog1.food = "Мясо";
        dog1.location = "Деревня";
        dog1.sleep();
        dog1.makeNoise();
        dog1.eat();

        Animal cat1 = new Cat();
        cat1.food = "Консервы";
        cat1.location = "Город";
        cat1.makeNoise();

        Animal horse1 = new Horse();
        horse1.food = "Овес";
        horse1.location = "Иподдром";
        horse1.makeNoise();

        Veterinarian vt1 = new Veterinarian();
        vt1.treatAnimal(cat1);


    }
}