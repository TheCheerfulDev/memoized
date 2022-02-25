package nl.thecheerfuldev.memoized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanSumMemoizedTest {

    private CanSumMemoized sut;

    @BeforeEach
    void setUp() {
        this.sut = new CanSumMemoized();
    }

    @Test
    void canSumMemoized() {
        assertFalse(sut.canSumMemoized(3000, new int[]{7, 14}));
    }
}
