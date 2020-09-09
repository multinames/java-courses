package com.company.JavaRush.lavel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

    public static int even;
    public  static  int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1= reader.readLine();
        int num = Integer.parseInt(n1);

        while (num >0) {
            if (num%2 == 0) even++;
            else odd++;
            num = num/10;
        }
        System.out.println("Even: "+even +" Odd: "+odd);
    }
}
