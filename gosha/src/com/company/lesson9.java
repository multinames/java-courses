package com.company;
import java.util.Scanner; // подключили класс Scanner

public class lesson9 {
    public static void main (String[] args) {
        int[] a;
        int n;
        Scanner in = new Scanner(System.in); // Создаем объект in класса Scanner
        System.out.print("Enter number of array: ");
        n = in.nextInt();
        a = new int[n];              //выделение памяти под массив

        for (int i = 0; i < n ; i++ ) {
            System.out.print("Enter a[" + i +"] = ");
            a[i] = in.nextInt ();
        }

        int max = 0;

        for (int i = 0; i < a.length ; i++ ) {
            if (a[i] > max)  max = a[i];
        }
        System.out.print("MaX Number of Array = " +max);


    }
}
