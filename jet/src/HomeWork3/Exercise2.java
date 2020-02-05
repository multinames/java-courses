package HomeWork3;

import java.util.ArrayList;
import java.util.LinkedList;

// 2.	Напишите Java-программу для итерации всех элементов ArrayList
public class Exercise2 {
    public static void main(String[] args) {
        // create an empty array list
        ArrayList<String> a_list = new ArrayList<String>();
        // use add() method to add values in the array list
        a_list.add("Red");
        a_list.add("Green");
        a_list.add("Black");
        a_list.add("White");
        a_list.add("Pink");
        // Print the linked list
        for (String element : a_list) {
            System.out.println(element);
        }
    }

}
