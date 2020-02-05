package HomeWork3;
// 7.	Напишите Java-программу для сравнения двух хеш-наборов.

import java.util.HashSet;

public class Exercise10 {
    public static void main(String[] args) {
        // Create a empty hash set 1
        HashSet<String> h_set = new HashSet<String>();

        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");

        // Create a empty hash set 2

        HashSet<String>h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Orange");

        //comparison output in hash set

     //   HashSet<String> result_set = new HashSet<String>();

        for (String element : h_set){
            System.out.println(h_set2.contains(element) ? "Yes" : "No");
        }
    }

}
