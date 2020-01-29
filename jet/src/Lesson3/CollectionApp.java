package Lesson3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        List<Animal> list = new LinkedList<>();
        list.add(new Animal("Dog"));
        list.add(new Animal("Dog"));

        list.forEach(elem-> System.out.println(elem));
            
       /* }
        for (Animal value:list){
            System.out.println(value);
        }
*/

/*        ArrayList<Integer> list = new ArrayList<>(); //инициализацяи коллекции
        list.add(1);
        list.add(10);
        list.add(20);
        list.add(14);

        list.remove(3);

        for (Integer value:list){
            System.out.println(value);
        }

        System.out.println(list.contains(10));*/
    }
}
