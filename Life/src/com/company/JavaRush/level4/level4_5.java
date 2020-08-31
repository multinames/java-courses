package com.company.JavaRush.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level4_5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String ph = reader.readLine();
        String a= reader.readLine();
        int num = Integer.parseInt(a);

        if (num >=0) {

                int i = 0;
        while (i != num) {
            System.out.println(ph);
            i++;
        }
        }
    }
}
