package com.company.JavaRush.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {
        String[] arr = new String[10];
        String [] arr2=initializeArray(arr);

        for (int i=arr2.length;i> 0;i--) {
          System.out.println(arr2[i-1]);
      }

    }
    public static String[] initializeArray(String list1[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[10];

        for (int i = 0; i != 8; i++) {
            list[i] = reader.readLine();
        }
        return list;
    }
}
