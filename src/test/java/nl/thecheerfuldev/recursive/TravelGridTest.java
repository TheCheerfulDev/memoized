package nl.thecheerfuldev.recursive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelGridTest {

    private TravelGrid sut;

    @BeforeEach
    void setUp() {
        this.sut = new TravelGrid();
    }

    @Test
    void travelGrid() {
        assertEquals(0, sut.travelGrid(0, 0));
        assertEquals(0, sut.travelGrid(0, 1));
        assertEquals(0, sut.travelGrid(1, 0));
        assertEquals(1, sut.travelGrid(1, 1));
        assertEquals(3, sut.travelGrid(2, 3));
        assertEquals(2_333_606_220L, sut.travelGrid(18, 18));
    }
}
