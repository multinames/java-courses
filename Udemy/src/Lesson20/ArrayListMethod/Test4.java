package Lesson20.ArrayListMethod;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        Map<Integer, String > map = new HashMap<>();
        map.put(777,"Ivanov Ivan");
        map.put(778,"Petrov Zaut");
        map.put(779,"Sidorova Maria");
        map.put(780,"Mudko Petr");
        map.put(781,"Mudko Petr");
        map.remove(781);
        System.out.println("map " + map);

    }
}
