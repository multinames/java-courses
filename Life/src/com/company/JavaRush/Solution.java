package com.company.JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {

    public static void main(String[] args) throws IOException {

     //    Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num= reader.readLine();
        double minute = Double.parseDouble(num);

        double green = 3.0;
        double yellow = 4.0;
        double red = 5.0;
        minute = minute % 5;
        if (minute < green)
            System.out.println("зелёный");
        else if (minute < yellow)
         	System.out.println("жёлтый");
        else if (minute < red)
            System.out.println("красный");
        }
}