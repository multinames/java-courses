import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int result = Calculator.twoDigit(value);
        System.out.println(result);

        int result2 = Calculator.threeDigitSum(value);
        System.out.println(result2);
    }
}

class Calculator{
    public static  int twoDigit (int value) {

        return value %100;
    }

    public static int threeDigitSum(int value){
        int first = value / 100;
        int second = value % 100 /10;
        int third = value %10;

        return first + second+ third;
    }
}