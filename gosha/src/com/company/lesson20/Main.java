package com.company.lesson20;
// перегрузка методов

public class Main {
    public  static int summ (int a, int b){
        return a + b;
    }

    public  static int summ (int a, int b, int g){
        return a + b + g;
    }

    public  static float summ (float a, float b, float g){
        return a + b + g;
    }
    public static void main(String[] args) {
        System.out.println(summ(1,2));
        System.out.println(summ(23.12f,12.11f, 15.2112f));
    }
}
