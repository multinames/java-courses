package Lesson19;

public class Test7 {
    public static void main(String[] args) {
        String [] array = {"Privet","Poka","Ok"};

        for (String s:array) {
            s = new String("hello");
        }
        /*for (int i=0; i < array.length;i++) {
            array[i] = 3;
        }*/

        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
