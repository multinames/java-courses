package Lesson4;

import java.util.Scanner;

public class Reverse {

    public static String reverse (String str) {
        String newString ="";
        char[] chars = str.toCharArray();
        for (int i = chars.length-1; i>=0;i--) {
            newString =newString + chars[i];
        }
        return newString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));


     }
}
