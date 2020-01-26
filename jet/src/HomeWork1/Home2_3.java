package HomeWork1;

import java.io.*;

// if else part 4

public class Home2_3 {
    public static void main(String[] args) {
        HomeWork23 min = new HomeWork23();
        min.abc(1,2,3);

        HomeWork23 type = new HomeWork23();
        System.out.println("-------------------------------------------");

        type.abc(-3);
        type.abc(2);
        type.abc(0);

        System.out.println("-------------------------------------------");

        type.infoNumber(1024);

    }
}

class HomeWork23 {
    public void abc (int a, int b, int c) {
        System.out.print("Даны три числа "+a + " "+b+ " "+c);
        if (a <b & a<c) {
            System.out.println(", наименьшее из них - "+a); }
    }

    public void abc(int a) {
        if (a <0 && (a%2)==0 ) {
            System.out.println(a +" отрицательное, четное число");
        }
        else if (a <0 && (a%2)!=0 ){System.out.println(a +" отрицательное, не четное число");}

        if (a >0 & (a%2)==0 ) {
            System.out.println(a +" положительное, четное число");
        }
        else if ((a >0 && (a%2)!=0 )){System.out.println(a +" положительное, не четное число");}

        if (a==0) {
            System.out.println(a+ " нулевое число ");
        }
    }

    public void infoNumber(int a){
        if ((String.valueOf(a).length() == 2) & ((a%2)==0)){
            System.out.println(a + " четное, двухзначеное число");
         }
        else if ((String.valueOf(a).length() == 3) & ((a%2)==0)){
            System.out.println(a + " четное, трехзначное число");
        }
        else if ((String.valueOf(a).length() == 1) & a!=0 & ((a%2)==0)){
            System.out.println(a + " четное число");
        }

        if ((String.valueOf(a).length() == 2) & ((a%2)!=0)){
            System.out.println(a + " не четное, двухзначеное число");
        }
        else if ((String.valueOf(a).length() == 3) & ((a%2)!=0)){
            System.out.println(a + " не четное, трехзначное число");
        }
        else if ((String.valueOf(a).length() == 1) & a!=0 & ((a%2)!=0)){
            System.out.println(a + " не четное число");
        }

        else {
            System.out.println("Число не входит в заданный диапазон (1-999)!!");
        }


    }

}