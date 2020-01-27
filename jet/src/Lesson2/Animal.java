package Lesson2;

abstract public class Animal implements Movable, Turnable{

    public void sleep(){
        System.out.println("sleeeeeep....");
    }

    abstract void say();

}

class Cat extends Animal {

    @Override
    void say() {
        System.out.println("Mew!");

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}

class Dog extends  Animal {

    public String name;

    public Dog (String name) {
        this.name = name;
    }

    public Dog() {

    }

    @Override
    void say() {
        System.out.println("Gav!");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}