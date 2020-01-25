import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int result = Calculator.twoDigit(value);
        System.out.println(result);
    }
}

class Calculator{
    public static  int twoDigit (int value) {
        return value %100;
    }
    }