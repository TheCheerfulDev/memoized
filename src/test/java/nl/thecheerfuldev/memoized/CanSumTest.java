package nl.thecheerfuldev.memoized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CanSumTest {

    private CanSum sut;

    @BeforeEach
    void setUp() {
        sut = new CanSum();
    }

    @Test
    void canSum() {
        assertTrue(sut.canSum(7, new int[]{2,3}));
    }
}