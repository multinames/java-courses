package com.company.JavaRush;

public class IfElse {
    public static void main(String[] args) {
        int month = 10;

        if ((month == 1) |  (month == 2) | (month == 12))
            System.out.println("Зима");
        else if ((month == 3) |  (month == 4) | (month == 5))
            System.out.println("Весна");
        else if ((month == 6) |  (month == 7) | (month == 8))
            System.out.println("Лето");
        else if ((month == 9) |  (month == 10) | (month == 11))
            System.out.println("Осень");

    }
}
