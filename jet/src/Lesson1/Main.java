package Lesson1;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Бобик",3);
        Animal cat = new Animal("Маркиз",15);


        System.out.println(dog.getName() + " " + dog.getAge());

        System.out.println(cat.getName() + " " + cat.getAge());

        System.out.println(Animal.LABEL +": " + Animal.getCount());
    }
}
