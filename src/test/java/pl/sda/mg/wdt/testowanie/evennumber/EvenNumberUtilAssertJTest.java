package pl.sda.mg.wdt.testowanie.evennumber;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class EvenNumberUtilAssertJTest {

    private EvenNumberUtil evenNumberUtil = new EvenNumberUtil();

    @Test
    void shouldReturnNullForNullArray() {
        // given
        int[] inputArray = null;

        // when
        int[] actualResult = evenNumberUtil.getEvenNumbers(inputArray);

        // then
//        assertNull(actualResult);
        assertThat(actualResult)
                .isNull();
    }

    @Test
    void shouldReturnEmptyArrayForNonEvenNumbers() {
        // given
        int[] inputArray = new int[] {1, 3, 5};

        // when
        int[] actualResult = evenNumberUtil.getEvenNumbers(inputArray);

        // then
//        assertArrayEquals(new int[]{}, actualResult);
        assertThat(actualResult)
                .isEmpty();
    }

    @Test
    void shouldReturnEvenNumbers() {
        // given
        int[] inputArray = new int[] {1, 2, 5, 8};

        // when
        int[] actualResult = evenNumberUtil.getEvenNumbers(inputArray);

        // then
//        assertArrayEquals(new int[]{2, 8}, actualResult);
        assertThat(actualResult)
                .isNotEmpty()
                .containsExactly(2, 8);
    }

}