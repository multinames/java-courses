package Lesson20.ArrayListMethod;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        // System.out.println("all = " +al1);

        List<String> list = List.of("odin", "dva", "tri");
        System.out.println("list = " + list);

        List<String> list2 = List.copyOf(list);
        System.out.println("list2 = " + list2);
    }
}
