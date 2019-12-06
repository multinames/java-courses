package com.company;

import java.util.Scanner;

public class Lesson6 {
    public static void main (String[] args){
        Scanner num = new Scanner(System.in);
        float first, second, result;
        System.out.print("Enter first num: ");
        first = num.nextFloat();
        System.out.print("Enter second num: ");
        second = num.nextFloat();
        result = first + second;
        result += 1;
        System.out.println("Result is - " + result);
    }
}
