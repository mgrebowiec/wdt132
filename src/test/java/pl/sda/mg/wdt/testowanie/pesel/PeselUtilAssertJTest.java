package pl.sda.mg.wdt.testowanie.pesel;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PeselUtilAssertJTest {

    @Test
    void shouldReturnNullForNullPesel() {
        // given
        String pesel = null;

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
//        assertNull(actualBirthDate);
        assertThat(actualBirthDate)
                .isNull();
    }

    @Test
    void shouldReturnNullForEmptyPesel() {
        // given
        String pesel = "";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
//        assertNull(actualBirthDate);
        assertThat(actualBirthDate)
                .isNull();
    }

    @Test
    void shouldReturnNullForEmptyPeselWithSpaces() {
        // given
        String pesel = "    ";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
//        assertNull(actualBirthDate);
        assertThat(actualBirthDate)
                .isNull();
    }

    @Test
    void shouldReturnNullForPeselWithLengthLessThan11() {
        // given
        String pesel = "1234567890";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
//        assertNull(actualBirthDate);
        assertThat(actualBirthDate)
                .isNull();
    }

    @Test
    void shouldReturnNullForPeselWithLengthGreaterThan11() {
        // given
        String pesel = "123456789012";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
//        assertNull(actualBirthDate);
        assertThat(actualBirthDate)
                .isNull();
    }

    @Test
    void shouldReturnBirthDate() {
        // given
        String pesel = "84091011111";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
//        assertEquals(LocalDate.of(1984, 9, 10), actualBirthDate);
        assertThat(actualBirthDate)
                .isNotNull()
                .isEqualTo(LocalDate.of(1984, 9, 10));
    }

    @Test
    void shouldReturnBirthDateFrom2000() {
        // given
        String pesel = "18291011111";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
//        assertEquals(LocalDate.of(2018, 9, 10), actualBirthDate);
        assertThat(actualBirthDate)
                .isNotNull()
                .isEqualTo(LocalDate.of(2018, 9, 10));
    }

    @Test
    void shouldThrowException() {
        // given
        String pesel = "aa123456789";

        // when
        final LocalDate actualBirthDate = PeselUtil.getBirthDate(pesel);

        // then
        // Tutaj do sprawdzenia w assercji czy wyjątek NumberFormatException został rzucony z aplikacji
    }

}