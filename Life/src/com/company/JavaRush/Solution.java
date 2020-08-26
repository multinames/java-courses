package com.company.JavaRush;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

       if ((year&400) == 0)
            System.out.println("400/ количество дней в году: 366");
        else if ((year&100) == 0)
            System.out.println("100/ количество дней в году: 365");
        else if ((year&4) == 0)
            System.out.println("4/ количество дней в году: 366");
        else
            System.out.println("/ количество дней в году: 365");

    }
}