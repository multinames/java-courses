package HomeWork1;

// if else part 3

public class Home2_2 {
    public static void main(String[] args) {
        TwoNumbers t1 = new TwoNumbers();
        t1.abc(3,3);
        t1.abc(2,3);
        System.out.println("");
        t1.abc2(3,2);
        t1.abc2(3,3);
    }
}

class TwoNumbers {
    public void abc(int a, int b){

        if (a!=b) {
            System.out.print("Дано a="+a+ " и b=" +b);
            int c=a+b;
            a=c; b=c;
            System.out.println(", значения не равны, новые значения a="+a+" b="+b);
        }
        else {
            System.out.print("Дано a="+a+ " и b=" +b);
            a=0;b=0;
            System.out.println(", значения равны, новые значения a="+a+" b="+b);
        }
    }

    public void abc2(int a, int b) {
        if (a!=b) {
            if(a >b) {
                System.out.print("Дано a="+a+ " и b=" +b);
                b=a;
                System.out.println(", значения не равны, новые значения a="+a+" b="+b);

            }
        }
        else {
            System.out.print("Дано a="+a+ " и b=" +b);
            a=0;b=0;
            System.out.println(", значения равны, новые значения a="+a+" b="+b);
        }

    }
}