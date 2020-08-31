package com.company.JavaRush.level4;

public class level4_chet {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++) {
            if (chet(i)==true)
                System.out.println(i);
        }
    }

    public static boolean chet(int a) {
        boolean b;
        if (a%2==0)
            b=true;
        else
            b=false;
        return b;
    }
}
