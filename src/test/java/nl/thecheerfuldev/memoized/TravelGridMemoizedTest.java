package nl.thecheerfuldev.memoized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelGridMemoizedTest {

    private TravelGridMemoized sut;

    @BeforeEach
    void setUp() {
        this.sut = new TravelGridMemoized();
    }

    @Test
    void travelGridMemoized() {
        assertEquals(0, sut.travelGridMemoized(0, 0));
        assertEquals(0, sut.travelGridMemoized(0, 1));
        assertEquals(0, sut.travelGridMemoized(1, 0));
        assertEquals(1, sut.travelGridMemoized(1, 1));
        assertEquals(3, sut.travelGridMemoized(2, 3));
        assertEquals(2333606220L, sut.travelGridMemoized(18, 18));
    }
}
