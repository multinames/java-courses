package Lesson5;

public class Calculator {
    public int sum(int value1, int value2) throws CalculatorException{
        long testValue1 = (long)value1+(long)value2;

        if (testValue1 > Integer.MAX_VALUE ) {
            throw new CalculatorException("сумма двух слогаемых больше чем " +Integer.MAX_VALUE);
        }
        if (testValue1 < Integer.MIN_VALUE ) {
            throw new RuntimeException("сумма двух слогаемых меньше чем " +Integer.MIN_VALUE);
        }

        return value1+value2;
}
}

class App{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            System.out.println("before exception");
            calculator.sum(-2_000_000_000, -2_000_000_000);
            System.out.println("after exception");
        } catch (CalculatorException ex) {
            System.out.println("Calculator");
        }
    }
}

// {method8... method4,method3,method2,method1,main}

/*
class Test {
    public static void main(String[] args) {



        Test.method1();
    }

    static int count =0;

    public static void method1 (){
        System.out.println(++count);
        Test.method1();
        System.out.println(++count);
    }

    public static void method2 (){
        Test.method3();
    }
    public static void method3 (){
        Test.method4();
    }
    public static void method4 (){
        Test.method5();
    }
    public static void method5 (){
        Test.method6();
    }
    public static void method6 (){
        Test.method7();
    }
    public static void method7 (){
        Test.method8();
    }
    public static void method8 (){}
}*/
