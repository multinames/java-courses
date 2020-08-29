package com.company.JavaRush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputString {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if (name1.equals(name2)==true)
            System.out.println("Имена идентичны");
        else if(name1.length()==name2.length())
            System.out.println("Длины имен равны");


        // System.out.println(name1.length()+ " " +name2.length());
    }
}
