package com.company.JavaRush.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level4_8 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        String b= reader.readLine();
        int m = Integer.parseInt(a);
        int n = Integer.parseInt(b);

        for (int i=1; i<=m;i++) {

            for ( int j=1; j<=n; j++) {
                System.out.print("8");

            }

            System.out.println();
        }
    }
}
