package nl.thecheerfuldev.tabulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTabulationTest {

    private FibonacciTabulation sut;

    @BeforeEach
    void setUp() {
        this.sut = new FibonacciTabulation();
    }

    @Test
    void fibonacci() {
        assertEquals(1, sut.fibonacciTabulation(1));
        assertEquals(1, sut.fibonacciTabulation(2));
        assertEquals(2, sut.fibonacciTabulation(3));
        assertEquals(3, sut.fibonacciTabulation(4));
        assertEquals(5, sut.fibonacciTabulation(5));
        assertEquals(3736710778780434371L, sut.fibonacciTabulation(100));
    }


}
