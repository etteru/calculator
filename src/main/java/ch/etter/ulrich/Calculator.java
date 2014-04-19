package ch.etter.ulrich;

import java.util.List;
import java.util.Optional;

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

    public Integer max(List<Integer> values) {
        Optional<Integer> max = values.stream().max(Integer::compare);
        if (max.isPresent()){
            return max.get();
        }
        else {
            return null;
        }
    }

    public Integer min(List<Integer> values){
        Integer result = null;
        for (Integer v : values) {
            if (result == null) {
                result = v;
            }
            else{
                if (v < result) {
                    result = v;
                }
            }
        }
        return result;
    }
}
