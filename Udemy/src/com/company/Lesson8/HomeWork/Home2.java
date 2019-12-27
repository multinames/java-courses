package com.company.Lesson8.HomeWork;

public class Home2 {
    public static final double pi = 3.14;

    public double ploshad(double radius){
        double s = pi*radius*radius;
        return s;
    }

    public static double dlinna(double radius){
        double s = 2*pi*radius;
        return s;
    }

    void ShowInfo(double radius2){
        System.out.println("Радиус: " +radius2);
        System.out.println("Площадь круга: " + ploshad(radius2));
        System.out.println("Длинна окружности: " + dlinna(radius2));
            }

}

class Home2Test{
    public static void main(String[] args) {

        Home2 r1 = new Home2();
        r1.ploshad(5);
        Home2.dlinna(7.5);
        r1.ShowInfo(3);

    }


}