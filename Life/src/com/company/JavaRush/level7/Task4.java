package com.company.JavaRush.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) {
        int arr[] = new int[10];

        try {
            arr=initializeArray(10);
            System.out.println(arr.toString().length());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int[] initializeArray(int num) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[10];

        for (int i = 0; i < num; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        return list;
    }
}
