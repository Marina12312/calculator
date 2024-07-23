package pro.sky.skyprocalculator;

public interface CalculatorService {
    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int multiply(int num1, int num2);
    int divide(int num1, int num2) throws IllegalArgumentException;
}
