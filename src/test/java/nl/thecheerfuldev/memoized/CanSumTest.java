package nl.thecheerfuldev.memoized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CanSumTest {

    private CanSum sut;

    @BeforeEach
    void setUp() {
        sut = new CanSum();
    }

    @Test
    void canSum() {
        assertTrue(sut.canSum(7, new int[]{2, 5}));
    }

    @Test
    void cantSum() {
        assertFalse(sut.canSum(11, new int[]{4, 5}));
    }

    @Test
    void slowCanSum() {
        assertFalse(sut.canSum(300, new int[]{7, 14}));
    }

    @Test
    void canSumMemoized() {
        assertFalse(sut.canSumMemoized(3000, new int[]{7, 14}));
    }
}
