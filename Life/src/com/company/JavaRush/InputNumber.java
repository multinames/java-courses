package com.company.JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1= reader.readLine();
        String b1= reader.readLine();
        String c1= reader.readLine();
        String d1= reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int d = Integer.parseInt(d1);

        int max1, max2;

        if (a>b)
            max1 = a;
        else
            max1 = b;

        if (c>d)
            max2=c;
        else
            max2=d;

        if (max1>max2)
            System.out.println(max1);
        else if (max2>max1)
            System.out.println(max2);
        else
            System.out.println(max1);


               // else System.out.println(a);


    }

}
