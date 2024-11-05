package ro.siit.calculator;

public class Calculator {
    public double addition(double a, double b) {
        return a + 2 * a + 2 * b - b - 3 * a + a ;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double multiplication(double a, double b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
