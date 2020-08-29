package com.company.JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort {

    public static void main(String args []) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a= reader.readLine();
        String b= reader.readLine();
        String c= reader.readLine();
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        int n3 = Integer.parseInt(c);


        int x;
        System.out.println("Числа в переменных a, b и c : " + a  + " " + b + " " + c);
        if (n1 < n2) {
            x = n1; n1 = n2; n2 = x;
        }
        if (n2 < n3){
            x = n2; n2 = n3; n3 = x;
        }
        System.out.println("Возрастающая последовательность: " + a  + " " + b + " " + c);
    }
}
