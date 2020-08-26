package com.company.JavaRush;

import java.util.Scanner;

public class InputKey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();

        if (a > 0)
            System.out.println(a*2);
        else if (a < 0 )
            System.out.println(a+1);
        else
            System.out.println(0);
    }


}
