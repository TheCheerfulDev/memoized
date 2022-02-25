package nl.thecheerfuldev.tabulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridTravelerTabulationTest {

    private GridTravelerTabulation sut;

    @BeforeEach
    void setUp() {
        this.sut = new GridTravelerTabulation();
    }

    @Test
    void travelGridTabulation() {
        assertEquals(1, sut.travelGridTabulation(1, 1));
        assertEquals(3, sut.travelGridTabulation(2, 3));
        assertEquals(2333606220L, sut.travelGridTabulation(18, 18));
    }
}
