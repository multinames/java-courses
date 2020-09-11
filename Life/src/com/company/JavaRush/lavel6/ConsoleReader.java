package com.company.JavaRush.lavel6;

import java.io.BufferedReader;

import java.io.InputStreamReader;

/*
Класс ConsoleReader
*/

public class ConsoleReader {

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1= reader.readLine();
        return s1;

    }
    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1= reader.readLine();
        int num = Integer.parseInt(n1);
        return num;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d1= reader.readLine();
        double num = Double.parseDouble(d1);
        return num;
    }
    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b1= reader.readLine();
        boolean bol = Boolean.parseBoolean(b1);
        return bol;
    }


    public static void main(String[] args) throws Exception {

    }

}
