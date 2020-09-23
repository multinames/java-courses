package com.company.JavaRush.levels1_3;

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

        int x =0, y=0;

        if (plus(n1)==true & n1!=0)
            x=x+1;
        else if(plus(n1)==false & n1!=0)
            y=y+1;

        if (plus(n2)==true & n2!=0)
            x=x+1;
        else if(plus(n2)==false & n2!=0)
            y=y+1;

        if (plus(n3)==true & n3!=0)
            x=x+1;
        else if(plus(n3)==false & n3!=0)
            y=y+1;

        System.out.println("количество положительных чисел: "+x);
        System.out.println("количество отрицательных чисел: "+y);
    }

    public static boolean plus(int a) {
        boolean b;
        if (a > 0) b = true;
        else b=false;

        return b;
    }
}
