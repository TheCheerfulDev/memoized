package nl.thecheerfuldev.memoized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciMemoizedTest {

    private FibonacciMemoized sut;

    @BeforeEach
    void setUp() {
        this.sut = new FibonacciMemoized();
    }

    @Test
    void fibonacci() {
//        assertEquals(1, sut.fibonacciMemoized(1));
//        assertEquals(1, sut.fibonacciMemoized(2));
//        assertEquals(2, sut.fibonacciMemoized(3));
//        assertEquals(3, sut.fibonacciMemoized(4));
//        assertEquals(5, sut.fibonacciMemoized(5));
        assertEquals(new BigInteger("354224848179261915075"), sut.fibonacciMemoized(100));
    }
}
