package nl.thecheerfuldev.recursive;

public class Fibonacci {

    public long fib(long n) {
        if (n <= 2) {
            return 1L;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
