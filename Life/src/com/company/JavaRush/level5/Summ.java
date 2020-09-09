package com.company.JavaRush.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summ {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        while (true) {

            String a1= reader.readLine();
            if (a1.equals("сумма")) break;
            int a = Integer.parseInt(a1);
            s=s+a;
        }
        System.out.println(s);
    }
}
