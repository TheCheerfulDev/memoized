package nl.thecheerfuldev.memoized;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoized {

    public BigInteger fibonacciMemoized(long n) {
        Map<Long, BigInteger> calculated = new HashMap<>();
        return fibonacciMemoized(n, calculated);
    }

    private BigInteger fibonacciMemoized(long n, Map<Long, BigInteger> calculated) {
        if (n <= 2) {
            return BigInteger.ONE;
        }
        if (calculated.containsKey(n)) {
            return calculated.get(n);
        }
        BigInteger left = fibonacciMemoized(n - 1, calculated);
        BigInteger right = fibonacciMemoized(n - 2, calculated);
        calculated.put(n, left.add(right));
        return calculated.get(n);
    }

}
