package com.company.Lesson8.HomeWork;

public class Home2 {
    static final double pi = 3.14;

    void ploshadKruga(double radius){
        double s;
        s = pi*radius*radius;
        System.out.println(s);
    }

    static void dlinnaOkruzhnosti(double radius){
        double s;
        s = 2*pi*radius;
        System.out.println(s);
    }

    void ShowInfo(double radius){
        System.out.println(radius);
        System.out.println(pi*radius*radius);
        System.out.println(2*pi*radius);
            }

}

class Home2Test{
    public static void main(String[] args) {

        Home2 r1 = new Home2();
        r1.ploshadKruga(12);
        Home2.dlinnaOkruzhnosti(14);
        r1.ShowInfo(14);

    }


}