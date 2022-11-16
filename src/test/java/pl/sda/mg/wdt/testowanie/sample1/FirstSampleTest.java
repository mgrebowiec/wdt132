package pl.sda.mg.wdt.testowanie.sample1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FirstSampleTest {

    @BeforeEach
    private void beforeEachTest() {
        System.out.println("@BeforeEach");
    }

    @AfterEach
    private void afterEachTest() {
        System.out.println("@AfterEach");
    }

    @BeforeAll
    private static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @AfterAll
    private static void afterAll() {
        System.out.println("@AfterAll");
    }

    @Test
    @DisplayName("Check if calculation return 9")
    void shouldReturnNine() {
        // given
        int firstArgument = 3;
        int secondArgument = 3;

        // when
        int actualResult = firstArgument * secondArgument;

        // then
        Assertions.assertEquals(9, actualResult);

    }

    @Test
    @Disabled
    void shouldReturnZero() {
        // given
        int firstArgument = 0;
        int secondArgument = 3;

        // when
        int actualResult = firstArgument * secondArgument;

        // then

        // Asercja grupująca wykona wszystkie asercje niezależnie czy któraś zgłosi błąd
        Assertions.assertAll(
                () -> Assertions.assertFalse(actualResult == 0),
                () -> Assertions.assertEquals(0, actualResult)
        );

//        Assertions.assertFalse(actualResult == 0);
//        Assertions.assertEquals(0, actualResult);
    }


    @Test
    void shouldCheckNullValue() {
        // given
        String value = null;

        // when


        // then
        Assertions.assertNull(value);

    }

    @Test
    void shouldBeTrue() {
        boolean value = false;

        Assertions.assertTrue(value, "value should be true");
    }

    @Test
    void bothArraysShouldBeEqual() {
        final int[] intsA = { 1, 2, 3 };
        final int[] intsB = { 1, 2, 3 };

        assertArrayEquals(intsA, intsB, "Elements in arrays are not equals");
    }
}
