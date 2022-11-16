package pl.sda.mg.wdt.testowanie.sample1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstSampleTest {

    @Test
    void shouldReturnSix() {
        // given
        int firstArgument = 3;
        int secondArgument = 3;

        // when
        int actualResult = firstArgument * secondArgument;

        // then
        Assertions.assertEquals(9, actualResult);

    }
}
