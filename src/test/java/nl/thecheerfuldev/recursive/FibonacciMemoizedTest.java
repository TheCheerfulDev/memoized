package nl.thecheerfuldev.recursive;

import nl.thecheerfuldev.memoized.FibonacciMemoized;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciMemoizedTest {

    private FibonacciMemoized sut;

    @BeforeEach
    void setUp() {
        sut = new FibonacciMemoized();
    }

    @Test
    void fibonacci() {
        assertEquals(1, sut.fibonacciMemoized(1));
        assertEquals(1, sut.fibonacciMemoized(2));
        assertEquals(2, sut.fibonacciMemoized(3));
        assertEquals(3, sut.fibonacciMemoized(4));
        assertEquals(5, sut.fibonacciMemoized(5));
        assertEquals(3736710778780434371L, sut.fibonacciMemoized(100));
    }
}
