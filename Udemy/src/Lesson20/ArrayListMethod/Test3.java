package Lesson20.ArrayListMethod;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        // al1.add(new Test3());
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        // System.out.println("all = " +al1);

        for (Object s: al1) {
            System.out.println("Number = " + s + " and length =" +((String)s).length());
        }
    }
}
