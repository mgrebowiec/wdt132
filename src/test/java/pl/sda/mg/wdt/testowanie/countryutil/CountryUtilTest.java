package pl.sda.mg.wdt.testowanie.countryutil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryUtilTest {

    // sprawdzamy:
    // kody jednoznakowe
    @Test
    void shouldReturnEmptyStringForSingleCharCode() {
        // given
        String sampleCode = "P";

        // when
        final String actualCountryName = CountryUtil.getCountryNameByCode(sampleCode);

        // then
        assertEquals("", actualCountryName);
    }


    // kody 3 znakowe
    @Test
    void shouldReturnEmptyStringForCodeWithThreeChars() {
        // given
        String sampleCode = "PLN";

        // when
        final String actualCountryName = CountryUtil.getCountryNameByCode(sampleCode);

        // then
        assertEquals("", actualCountryName);
    }


    // wartosc null
    @Test
    void shouldReturnEmptyStringForNullCode() {
        // given
        String sampleCode = null;

        // when
        final String actualCountryName = CountryUtil.getCountryNameByCode(sampleCode);

        // then
        assertEquals("", actualCountryName);
    }

    // spacje
    @Test
    void shouldReturnEmptyStringForTwoSpaces() {
        // given
        String sampleCode = "  ";

        // when
        final String actualCountryName = CountryUtil.getCountryNameByCode(sampleCode);

        // then
        assertEquals("", actualCountryName);
    }

    // PL
    @Test
    void shouldReturnCountryNameForExistingCountryCodeUpperCase() {
        // given
        String sampleCode = "PL";

        // when
        final String actualCountryName = CountryUtil.getCountryNameByCode(sampleCode);

        // then
        assertEquals("Polska", actualCountryName);
    }

    // pl
    @Test
    void shouldReturnCountryNameForExistingCountryCodeLowerCase() {
        // given
        String sampleCode = "pl";

        // when
        final String actualCountryName = CountryUtil.getCountryNameByCode(sampleCode);

        // then
        assertEquals("Polska", actualCountryName);
    }
}