package HomeWork1;

// if else part 3

public class Home2_2 {
    public static void main(String[] args) {
        TwoNumbers t1 = new TwoNumbers();
        t1.abc(3,3);
        t1.abc(2,3);
    }
}

class TwoNumbers {

    public void abc(int a, int b){

        if (a!=b) {
            int c=a+b;
            a=c; b=c;
            System.out.println("Значения не равны, новые значения "+a+" "+b);
        }
        else { a=0;b=0;
            System.out.println("Значения равны, новые значения "+a+" "+b);
        }
    }
}