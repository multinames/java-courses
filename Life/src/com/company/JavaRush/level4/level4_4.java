package com.company.JavaRush.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level4_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a= reader.readLine();
        int num = Integer.parseInt(a);

        if (chet(num)==true & range(num) == true) {
            if (num >=1 & num <=9)
                System.out.println("четное однозначное число");
            else if (num >=10 & num <=99)
                System.out.println("четное двузначное число");
            else if (num >=100 & num <=999)
                System.out.println("четное трехзначное число");
        }

        if (chet(num)==false & range(num) == true) {
            if (num >=1 & num <=9)
                System.out.println("нечетное однозначное число");
            else if (num >=10 & num <=99)
                System.out.println("нечетное двузначное число");
            else if (num >=100 & num <=999)
                System.out.println("нечетное трехзначное число");
        }


    }
    public static boolean chet(int a) {
        boolean b;
        if (a%2==0)
            b=true;
        else
            b=false;
        return b;
    }

    public static boolean range(int a) {
        boolean b;
        if (a >=1 & a <= 999)
            b=true;
        else
            b=false;
        return b;

    }

}
