package nl.thecheerfuldev.memoized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HowSumTest {

    private HowSum sut;

    @BeforeEach
    void init() {
        sut = new HowSum();
    }

    @Test
    void howSumTest() {

        int[] firstArray = {13,7};

        System.out.println(sut.howSum(300, firstArray));

    }

}