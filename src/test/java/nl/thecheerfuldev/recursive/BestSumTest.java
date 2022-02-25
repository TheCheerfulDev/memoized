package nl.thecheerfuldev.recursive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestSumTest {

    private BestSum sut;

    @BeforeEach
    void setUp() {
        this.sut = new BestSum();
    }

    @Test
    void bestSum() {
        assertThat(this.sut.bestSum(7, new int[]{5, 3, 4, 7})).containsExactlyInAnyOrder(7);
        assertThat(this.sut.bestSum(8, new int[]{2, 3, 5})).containsExactlyInAnyOrder(3, 5);
        assertThat(this.sut.bestSum(8, new int[]{1, 4, 5})).containsExactlyInAnyOrder(4, 4);
        assertThat(this.sut.bestSum(100, new int[]{1, 2, 5, 25})).containsExactlyInAnyOrder(25, 25, 25, 25);
    }
}
