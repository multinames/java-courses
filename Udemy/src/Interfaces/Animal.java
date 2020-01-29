package Interfaces;

public class Animal implements Info {
    // класс Animal реализует интерфейс Info
    public int id;

    public Animal (int id) {
        this.id=id;
    }
    @Override
    public void showInfo() {
        System.out.println("ID is "+this.id);

    }
    public void sleep(){
        System.out.println("I'm sleeping");
    }
}
