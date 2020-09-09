package com.company.JavaRush.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputN {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1= reader.readLine();
        int num = Integer.parseInt(n1);
        int maximum=Integer.MIN_VALUE;

        if (num >0) {

        for (int i=0; i!=num;i++) {
            String a1= reader.readLine();
            int a = Integer.parseInt(a1);
            if (a > maximum) maximum =a;
        }
        System.out.println(maximum);
        }
    }
}
