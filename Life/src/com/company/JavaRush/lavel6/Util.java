package com.company.JavaRush.lavel6;

/*
Расстояние между двумя точками
*/

import static java.lang.Math.sqrt;

public class Util {

    public static double getDistance(int x1, int y1, int x2, int y2) {

        // System.out.println(Math.sqrt((x2-x1)+(y2-y1)));

//        double b= Math.sqrt((x2-x1);
//        double c= Math.sqrt((y2-y1);

        return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

    }


    public static void main(String[] args) {

    }

}