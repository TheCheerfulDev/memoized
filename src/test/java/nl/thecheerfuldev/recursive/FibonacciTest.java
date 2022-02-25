package nl.thecheerfuldev.recursive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    private Fibonacci sut;

    @BeforeEach
    void setUp() {
        this.sut = new Fibonacci();
    }

    @Test
    void fibonacci() {
        assertEquals(1, sut.fib(1));
        assertEquals(1, sut.fib(2));
        assertEquals(2, sut.fib(3));
        assertEquals(3, sut.fib(4));
        assertEquals(5, sut.fib(5));
        assertEquals(13, sut.fib(7));
        assertEquals(3736710778780434371L, sut.fib(100));
    }
}
