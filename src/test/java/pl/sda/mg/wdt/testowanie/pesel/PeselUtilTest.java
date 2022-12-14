package pl.sda.mg.wdt.testowanie.pesel;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PeselUtilTest {

    @Test
    void shouldReturnNullForNullPesel() {
        // given
        String pesel = null;

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
        assertNull(actualBirthDate);
    }

    @Test
    void shouldReturnNullForEmptyPesel() {
        // given
        String pesel = "";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
        assertNull(actualBirthDate);
    }

    @Test
    void shouldReturnNullForEmptyPeselWithSpaces() {
        // given
        String pesel = "    ";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
        assertNull(actualBirthDate);
    }

    @Test
    void shouldReturnNullForPeselWithLengthLessThan11() {
        // given
        String pesel = "1234567890";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
        assertNull(actualBirthDate);
    }

    @Test
    void shouldReturnNullForPeselWithLengthGreaterThan11() {
        // given
        String pesel = "123456789012";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
        assertNull(actualBirthDate);
    }

    @Test
    void shouldReturnBirthDate() {
        // given
        String pesel = "84091011111";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
        assertEquals(LocalDate.of(1984, 9, 10), actualBirthDate);
    }

    @Test
    void shouldReturnBirthDateFrom2000() {
        // given
        String pesel = "18291011111";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
        assertEquals(LocalDate.of(2018, 9, 10), actualBirthDate);
    }

    @Test
    void shouldThrowException() {
        // given
        String pesel = "aa123456789";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
        // Tutaj do sprawdzenia w assercji czy wyj??tek NumberFormatException zosta?? rzucony z aplikacji
    }

}