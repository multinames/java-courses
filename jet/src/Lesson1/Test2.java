package Lesson1;

import java.util.Scanner;


public class Test2 {

    public static  boolean printValue(String paramName, boolean flag){
        System.out.println(paramName);
        return flag;
    }
    public static void main(String[] args) {

        // if(Test2.printValue("first", true)) && Test2.printValue("Second", false) && Test2.printValue("third", false)){
          //  int z = 10;
        // }
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        System.out.println("Введите второе число:");

        int value1 = sc.nextInt();

        int result = Calculator.minWithTwoDigist(value, value1);
        System.out.println(result);

       /* int value = sc.nextInt();

        int result = Calculator.twoDigit(value);
        System.out.println(result);

        int result2 = Calculator.threeDigitSum(value);
        System.out.println(result2);*/
    }
}

class Calculator{


    public static int minWithTwoDigist (int value1, int value2) {
        if(value1 < value2) {
            return value1;
        }
        return value2;

    }

    public static  int twoDigit (int value) {

        return value %100;
    }

    public static int threeDigitSum(int value){
        int first = value / 100;
        int second = value % 100 /10;
        int third = value %10;

        return first + second+ third;
    }
}