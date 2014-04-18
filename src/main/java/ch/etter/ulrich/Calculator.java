package ch.etter.ulrich;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public int fac(int n){
        if (n > 1){
            return n * fac(n - 1);
        }
        else if (n == 1 || n == 0){
            return 1;
        }
        else {
            throw new IllegalArgumentException("Argument must be non-negative!");
        }
    }
}
