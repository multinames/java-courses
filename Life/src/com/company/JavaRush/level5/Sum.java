package com.company.JavaRush.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1= reader.readLine();
        String b1= reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);

        System.out.println("Sum = "+ (a+b));
    }
}
