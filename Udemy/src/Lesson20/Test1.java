package Lesson20;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c= new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList<String> list2 = new ArrayList();
        list2.add("poka");

        ArrayList<StringBuilder> list3 = new ArrayList<>();
        list3.add(new StringBuilder("ok"));


    }

}

class Car{

}

class Student{

}