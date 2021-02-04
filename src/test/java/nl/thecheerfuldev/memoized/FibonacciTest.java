package nl.thecheerfuldev.memoized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    private Fibonacci sut;

    @BeforeEach
    void setUp() {
        sut = new Fibonacci();
    }

    @Test
    void fibonacci() {
        assertEquals(1, sut.fibonacci(1));
        assertEquals(1, sut.fibonacci(2));
        assertEquals(2, sut.fibonacci(3));
        assertEquals(3, sut.fibonacci(4));
        assertEquals(5, sut.fibonacci(5));
//        assertEquals(3736710778780434371L, sut.fibonacci(100));
        assertEquals(3736710778780434371L, sut.fibonacciMemoized(100));
    }
}