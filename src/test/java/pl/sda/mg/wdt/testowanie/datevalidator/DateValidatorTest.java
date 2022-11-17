package pl.sda.mg.wdt.testowanie.datevalidator;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateValidatorTest {

    @Test
    void shouldReturnFalseForNullInput() {
        // given
        LocalDate input = null;

        // when
        final boolean actualResult = DateValidator.isValidDate(input);

        // then
        assertFalse(actualResult);
    }

    @Test
    void shouldReturnFalseForDateFromFuture() {
        // given
        LocalDate input = LocalDate.of(2021, 4, 2);

        // when
        final boolean actualResult = DateValidator.isValidDate(input);

        // then
        assertFalse(actualResult);
    }

    @Test
    void shouldReturnTrueForDateFromValidPeriod() {
        // given
        LocalDate input = LocalDate.of(2021, 2, 2);

        // when
        final boolean actualResult = DateValidator.isValidDate(input);

        // then
        assertTrue(actualResult);
    }

    @Test
    void shouldReturnTrueForMinimalDate() {
        // given
        LocalDate input = LocalDate.of(2021, 1, 1);

        // when
        final boolean actualResult = DateValidator.isValidDate(input);

        // then
        assertTrue(actualResult);
    }

    @Test
    void shouldReturnTrueForMaximumDate() {
        // given
        LocalDate input = LocalDate.of(2021, 4, 1);

        // when
        final boolean actualResult = DateValidator.isValidDate(input);

        // then
        assertTrue(actualResult);
    }

}