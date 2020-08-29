package com.company.JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a= reader.readLine();
        String b= reader.readLine();
        String c= reader.readLine();
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        int n3 = Integer.parseInt(c);


        int t3 = 0, t2 = 0, t1 = 0;


        if (n1 > n2 & n1 > n3 ) {
            t3 = n1;
            if (n2 > n3) {t2=n2; t1=n3;}
            else {t2 = n3; t1 = n2;}
        }

        if (n2 > n1 & n2 > n3 ) {
            t3 = n2;
            if (n1 > n3) {t2=n1; t1=n3;}
            else {t2 = n3; t1 = n1;}
        }

        if (n3 > n1 & n3 > n2 ) {
            t3 = n3;
            if (n1 > n2) { t2=n1; t1=n2;}
            else {t2 = n2; t1 = n1;}
        }


        if (n3 == n1 & n3 == n2 ) {
            t3 = n3; t2=n2; t1=n1;
        }

        if (n1==n2 & n3 < n1) {
            t3 = n1; t2=n2; t1=n3;
        }

        if (n1==n2 & n3 > n1) {
            t3 = n3; t2=n2; t1=n1;
        }

        if (n1==n3 & n2 > n1) {
            t3 = n2; t2=n1; t1=n3;
        }

        if (n1==n3 & n2 < n1) {
            t3 = n3; t2=n1; t1=n2;
        }

        if (n1==n3 & n2 > n1) {
            t3 = n2; t2=n1; t1=n3;
        }

        if (n2==n3 & n1 < n2) {
            t3 = n3; t2=n2; t1=n1;
        }

        if (n2==n3 & n1 > n2) {
            t3 = n1; t2=n2; t1=n3;
        }

        System.out.print(t3+ " "+ t2+ " "+ t1);


        }
}
