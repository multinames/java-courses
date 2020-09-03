package com.company.JavaRush.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l4_average {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = reader.readLine();
        String b1= reader.readLine();
        String c1= reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);

        int max, min;

//        // если все равны
//        if (a == b & a ==c)
//            System.out.println(a);
//
//        //если два равны
//        if (a == b | a==c )
//            System.out.println(a);
//        else if(b==c)
//            System.out.println(c);

        // среднее число
        if ( a>b) max=a;
        else
            max =b;
        if (c > max) max=c;

        if ( a < b) min=a;
        else
            min =b;
        if (c < min) min=c;
        int avg = (a+b+c)-(max+min);
        System.out.println(avg);
    }
}
