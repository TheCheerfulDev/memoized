package nl.thecheerfuldev.memoized;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public long fibonacci(long n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public long fibonacciMemoized(long n) {
        Map<Long, Long> calculated = new HashMap<>();
        return fibonacciMemoized(n, calculated);
    }

    private long fibonacciMemoized(long n, Map<Long, Long> calculated) {
        if (n <= 0) {
            return 0;
        }
        if (calculated.containsKey(n)) {
            return calculated.get(n);
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        calculated.put(n, fibonacciMemoized(n - 1, calculated) + fibonacciMemoized(n - 2, calculated));
        return calculated.get(n);
    }

}
