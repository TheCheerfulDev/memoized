package nl.thecheerfuldev.tabulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanSumTabulationTest {

    private CanSumTabulation sut;

    @BeforeEach
    void setUp() {
        this.sut = new CanSumTabulation();
    }

    @Test
    void canSumTabulation() {
        assertTrue(this.sut.canSumTabulation(7, new int[]{5,3,4}));
        assertFalse(this.sut.canSumTabulation(6, new int[]{5,4}));
    }
}
