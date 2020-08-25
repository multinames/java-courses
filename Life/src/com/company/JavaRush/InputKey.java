package com.company.JavaRush;

import java.util.Scanner;

public class InputKey {

    public static void main(String[] args) {
        System.out.println(toSum(145));
        }

    public static int toSum (int number) {
        int sum = 0;
        for (;number>0;number /=10) {
            int number_create = number % 10;
            sum = sum + number_create;
        }
        return sum;
    }
}
