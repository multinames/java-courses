package Lessom16;

// Строки

import java.sql.SQLOutput;

public class Test11 {
    public static void main(String[] args) {
        Test11 st1 = new Test11();
        Test11 st2 = new Test11();

        String s1 = new String("Ok");
        String s2 = new String("Ok");

        String st3="Hello";
        String st4="Hello";

        //System.out.println(st1==st2);
        System.out.println(st3.equals(st4));
        System.out.println(s1.equals(s2));
        System.out.println(s1!=st3);

        String s10 = "Kak Dela?";
        String s11 = "kak dela?";
        System.out.println(s10.equalsIgnoreCase(s11));



    }

}
