package HomeWork1;

// if else part 2

public class Home2_1 {
       public static void main(String[] args) {
         ComNumbers t1 = new ComNumbers();

      t1.abc(1,2,-3);
      t1.abc2(1,3,-3);
      t1.ab(1,2);
   }
}

class ComNumbers {
    public void abc(int a, int b, int c) {
        int n=0;
        if (a>0) {n++ ;}
        if (b>0) {n++ ;}
        if (c>0) {n++ ;}
        System.out.println("Даны числа: "+a + " "+ b+" "+c+", из них положительных - " +n);
    }

    public void abc2(int a, int b, int c) {

        int n = 0, m=0;
        if (a>0) {n++ ;} else {m++;}
        if (b>0) {n++ ;} else {m++;}
        if (c>0) {n++ ;} else {m++;}
        System.out.println("Даны числа: "+a + " "+ b+" "+c+", из них положительных - " +n +", отрицательных -" +m);
    }

    public void ab(int a, int b) {
        System.out.print("Из двух чисел - " + a + " и " + b + ", большее ");
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);

        }
    }
}
