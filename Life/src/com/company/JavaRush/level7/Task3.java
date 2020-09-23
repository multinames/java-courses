package com.company.JavaRush.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) {
        String[] arr_str = new String[10];
        int [] arr_int = new int[10];


        try {
            arr_str = initializeArray(10);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i =0;i < arr_int.length ;i++) {
            arr_int[i] = arr_str[i].length();
        }

        for (int n :arr_int
             ) {
            System.out.println(n);
        }
    }

    public static String[] initializeArray(int num) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[10];

        for (int i = 0; i < num; i++) {
            list[i] = reader.readLine();
        }
        return list;
    }
}
