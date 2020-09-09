package com.company.JavaRush.level4;
// Считываем целые числа с клавиатуры, суммируем и выводим сумму в случае -1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class l4_16_break {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        while (true) {
            String a1= reader.readLine();
            int a = Integer.parseInt(a1);
            s=s+a;
            if (a == -1) break;
        }
        System.out.println(s);
    }
}

