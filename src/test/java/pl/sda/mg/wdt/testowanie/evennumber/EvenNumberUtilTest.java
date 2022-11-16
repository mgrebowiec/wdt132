package pl.sda.mg.wdt.testowanie.evennumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberUtilTest {

    private EvenNumberUtil evenNumberUtil = new EvenNumberUtil();

    @Test
    void shouldReturnNullForNullArray() {
        // given
        int[] inputArray = null;

        // when
        int[] actualResult = evenNumberUtil.getEvenNumbers(inputArray);

        // then
        assertNull(actualResult);
    }

    @Test
    void shouldReturnEmptyArrayForNonEvenNumbers() {
        // given
        int[] inputArray = new int[] {1, 3, 5};

        // when
        int[] actualResult = evenNumberUtil.getEvenNumbers(inputArray);

        // then
        assertArrayEquals(new int[]{}, actualResult);
    }

    @Test
    void shouldReturnEvenNumbers() {
        // given
        int[] inputArray = new int[] {1, 2, 5, 8};

        // when
        int[] actualResult = evenNumberUtil.getEvenNumbers(inputArray);

        // then
        assertArrayEquals(new int[]{2, 8}, actualResult);
    }

}