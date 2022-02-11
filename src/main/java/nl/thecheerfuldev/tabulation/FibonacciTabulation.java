package nl.thecheerfuldev.tabulation;

public class FibonacciTabulation {

    public long fibonacciTabulation(int n) {

        long[] result = new long[n + 1];
        result[0] = 0L;
        result[1] = 1L;

        for (int i = 2; i < result.length; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result[result.length - 1];
    }
}
