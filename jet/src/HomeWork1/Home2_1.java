package HomeWork1;

// if else part 2

public class Home2_1 {
    public static void main(String[] args) {
        int a=1, b=2, c=-3, n=0,m=0;

        if (a>0) {n++ ;}
        if (b>0) {n++ ;}
        if (c>0) {n++ ;}
        System.out.println("Даны числа: "+a + " "+ b+" "+c+", из них положительных - " +n);

        n=0;
        if (a>0) {n++ ;} else {m++;}
        if (b>0) {n++ ;} else {m++;}
        if (c>0) {n++ ;} else {m++;}
        System.out.println("Даны числа: "+a + " "+ b+" "+c+", из них положительных - " +n +", отрицательных -" +m);

        System.out.print("Из двух чисел - "+a +" и " +b + ", большее ");
        if (a >b) {
            System.out.println(a);}
        else {
            System.out.println(b); }
    }

}

