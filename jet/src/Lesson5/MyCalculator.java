package Lesson5;

public class MyCalculator implements Calculatable{


    @Override
    public int sum (int value1, int value2) throws CalculatorException {
        return value1 + value2;
    }

    @Override
    public int diff (int value1, int value2) throws CalculatorException{
        return value1-value2;
    }

    @Override
    public int mult (int value1, int value2) throws CalculatorException{
        return value1*value2;
    }

    @Override
    public int div(int value1, int value2) throws DivideByZerroExeption {
        return 0;
    }


    public int dev (int value1, int value2) throws DivideByZerroExeption{
       // if (value2 ==0)
        return value1/value2;
    }
}

class TestCalculator {
    public static void main(String[] args) throws CalculatorException {

        Calculatable calc1 = (Calculatable) new MyCalculator();

        System.out.println(calc1.sum(1,3));
        System.out.println(calc1.diff(3,1));
        System.out.println(calc1.mult(3,1));
    }

}
