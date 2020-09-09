package com.company.JavaRush.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double s = 0;
        int count=0;
        while (true) {
            String a1= reader.readLine();
            int a = Integer.parseInt(a1);
            if (a == -1) break;
            s=s+a;
            count++;
        }
        System.out.println(s/count);
    }
}
