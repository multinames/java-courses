package com.company;

import java.util.Scanner;

public class Lesson7home {
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int first;
        System.out.print("Enter first num: ");
        first = num.nextInt();

        switch (first) {
            case 3:
                System.out.print("Три");
                break;
            case 7:
                System.out.print("Семь");
                break;
            default:
                System.out.print("Что то другое");
        }
    }
}
