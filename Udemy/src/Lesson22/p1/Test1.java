package Lesson22.p1;

import Lesson22.Human;

public class Test1 {
    public static void main(String[] args) {
        Human chel = new Human("male");
        chel.setName(new StringBuilder("Толян"));
        chel.setAge(40);
        chel.setWt(60);

        System.out.println("Имя: "+chel.getName() + ", возраст: " + chel.gtAge()+", вес: " +chel.getWt());
    }
}
