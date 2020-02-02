package Lesson5;

public interface Calculatable {

    int sum(int value1, int value2) throws CalculatorException;
    int diff(int value1, int value2) throws CalculatorException;
    int mult(int value1, int value2) throws CalculatorException;
    int div(int value1, int value2) throws DivideByZeroException;
}
