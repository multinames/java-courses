package com.company.JavaRush.lavel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int a4 = Integer.parseInt(reader.readLine());
        int a5 = Integer.parseInt(reader.readLine());

        int b1 = 0, b2 = 0, b3 = 0, b4 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, b5 = 0;

        if (a1 <= a2) {
            b1 = a1;
            b2 = a2;
        } else {
            b1 = a2;
            b2 = a1;
        }

        if (a3 <= a4) {
            b3 = a3;
            b4 = a4;
        } else {
            b3 = a4;
            b4 = a3;
        }

        if (b1 <= b3) {
            c1 = b1;
            c2 = b3;
        } else {
            c1 = b3;
            c2 = b1;
        }

        if (b2 <= b4) {
            c3 = b2;
            c4 = b4;
        } else {
            c3 = b4;
            c4 = b2;
        }

        if (c2 < c3) {
            d1 = c1;
            d2 = c2;
            d3 = c3;
            d4 = c4;
        } else if (c2 > c3) {
            d1 = c1;
            d2 = c3;
            d3 = c2;
            d4 = c4;
        }

        if ((a5 < d1)) {
            b1 = a5; b2=d1; b3=d2; b4=d3; b5=d4;
        }

        else if ((a5 > d1) & (a5 < d3)) {
            b1=d1; b2 = a5; b3=d2;b4=d3; b5=d4;
        }

        if (( a5 > d2) & (a5 <d4)) {
            d3 = a5; }
        else if ((a5 > d3) & (a5 < d5)) {
                d4=a5;        }
        else if (a5 > d4) d5=a5;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5) ;

    }
}
