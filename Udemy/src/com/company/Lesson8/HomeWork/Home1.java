package com.company.Lesson8.HomeWork;

public class Home1 {

    static int umnozhenia(int a, int b, int c) {
        return a*b*c;
    }

    static void delenie (int a, int b, int c) {
        System.out.println("Целое частно: "+ a/b + "; Остаток: " +a%b);

    }
}

class Home1Test{
    public static void main(String[] args) {
        System.out.println(Home1.umnozhenia(3,4,5));
        System.out.println(Home1.umnozhenia(30,40,50));

        Home1.delenie(3,4,5);
        Home1.delenie(30,40,50);



    }
}
