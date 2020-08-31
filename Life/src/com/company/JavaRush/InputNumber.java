package com.company.JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a= reader.readLine();
        int num = Integer.parseInt(a);

        if (num==0) {
            System.out.println("ноль");

        }

        if (plus(num) == false & chet(num)==true & num !=0)
            System.out.println("отрицательное четное число");

        if (plus(num) == false & chet(num)==false & num !=0)
            System.out.println("отрицательное нечетное число");

        if (plus(num) == true & chet(num)==true & num !=0)
            System.out.println("положительное четное число");

        if (plus(num) == true & chet(num)==false & num !=0)
            System.out.println("положительное нечетное число");
    }

        public static boolean chet(int a) {
        boolean b;
        if (a%2==0)
            b=true;
        else
            b=false;
        return b;
        }

        public static boolean plus(int a) {
        boolean b;
        if (a > 0) b = true;
        else b=false;

        return b;
        }
}
