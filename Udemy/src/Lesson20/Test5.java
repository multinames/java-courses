package Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(1,new String("hello"));

        /*for (String sb:list) {
            System.out.print(sb + " "); }*/
        System.out.println(list.toString());
            System.out.print(list.indexOf(new String("poka")));

    }

}
