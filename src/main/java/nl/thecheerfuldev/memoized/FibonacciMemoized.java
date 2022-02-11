package nl.thecheerfuldev.memoized;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoized {

    public long fibonacciMemoized(long n) {
        Map<Long, Long> calculated = new HashMap<>();
        return fibonacciMemoized(n, calculated);
    }

    private long fibonacciMemoized(long n, Map<Long, Long> calculated) {
        if (n < 2) {
            return n;
        }
        if (calculated.containsKey(n)) {
            return calculated.get(n);
        }
        calculated.put(n, fibonacciMemoized(n - 1, calculated) + fibonacciMemoized(n - 2, calculated));
        return calculated.get(n);
    }

}
