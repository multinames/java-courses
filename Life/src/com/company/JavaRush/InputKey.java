package com.company.JavaRush;

import java.util.Scanner;

public class InputKey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (  (c >=(a+b))  |  ( b >= (a+c)) | (a >=(b+c))  )
            System.out.println("Треугольник не существует");
        else
            System.out.println("Треугольник  существует");

//        else if (a==b)
//            System.out.println(a+ " " +b);
//        else if (a==c)
//            System.out.println(a+ " " +c);
//        else if (b==c)
//            System.out.println(b + " " +c);




//        System.out.println(a + b + c);
    }


}
