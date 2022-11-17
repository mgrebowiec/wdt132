package pl.sda.mg.wdt.testowanie.datevalidator;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;


class DateValidatorAssertJTest {

    @Test
    void shouldReturnFalseForNullInput() {
        // given
        LocalDate input = null;

        // when
        final boolean actualResult = DateValidator.isValidDate(input);

        // then
//        assertFalse(actualResult);
        assertThat(actualResult)
                .isFalse();
    }

    @Test
    void shouldReturnFalseForDateFromFuture() {
        // given
        LocalDate input = LocalDate.of(2021, 4, 2);

        // when
        final boolean actualResult = DateValidator.isValidDate(input);

        // then
//        assertFalse(actualResult);
        assertThat(actualResult)
                .isFalse();
    }

    @Test
    void shouldReturnTrueForDateFromValidPeriod() {
        // given
        LocalDate input = LocalDate.of(2021, 2, 2);

        // when
        final boolean actualResult = DateValidator.isValidDate(input);

        // then
//        assertTrue(actualResult);
        assertThat(actualResult)
                .isTrue();
    }

    @Test
    void shouldReturnTrueForMinimalDate() {
        // given
        LocalDate input = LocalDate.of(2021, 1, 1);

        // when
        final boolean actualResult = DateValidator.isValidDate(input);

        // then
//        assertTrue(actualResult);
        assertThat(actualResult)
                .isTrue();
    }

    @Test
    void shouldReturnTrueForMaximumDate() {
        // given
        LocalDate input = LocalDate.of(2021, 4, 1);

        // when
        final boolean actualResult = DateValidator.isValidDate(input);

        // then
//        assertTrue(actualResult);
        assertThat(actualResult)
                .isTrue();
    }

}