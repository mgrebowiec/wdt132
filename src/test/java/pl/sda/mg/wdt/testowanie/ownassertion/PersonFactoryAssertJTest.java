package pl.sda.mg.wdt.testowanie.ownassertion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.assertThat;

class PersonFactoryAssertJTest {

    private static PersonFactory personFactory;

    @BeforeAll
    static void initialize() {
        LocalDate actualNow = LocalDate.of(2022, 11, 17);
        ZoneId zoneId = ZoneId.systemDefault();
        Instant now = actualNow.atStartOfDay(zoneId).toInstant();

        Clock clock = Clock.fixed(now, zoneId);
        personFactory = new PersonFactory(clock);
    }

    @Test
    void shouldCreateValidPerson() {
        // given
        String name = "Michal";
        String pesel = "01220211111";

        // when
        final Person actualPerson = personFactory.buildPerson(name, pesel);

        // then
//        assertThatPerson(actualPerson)
//                .isValid()
//                .hasAge(21)
//                .hasName("Michal");

        assertThat(actualPerson)
                .isNotNull()
                .hasFieldOrPropertyWithValue("name", "Michal")
                .hasFieldOrPropertyWithValue("age", 21)
                .hasFieldOrProperty("pesel");
    }

    @Test
    void shouldNotCreatePersonWhenNameIsNull() {
        // given
        String name = null;
        String pesel = "01220211111";

        // when
        final Person actualPerson = personFactory.buildPerson(name, pesel);

        // then
//        assertThatPerson(actualPerson)
//                .notExist();

        assertThat(actualPerson)
                .isNull();
    }

    @Test
    void shouldNotCreatePersonWhenPeselIsNull() {
        // given
        String name = "Michal";
        String pesel = null;

        // when
        final Person actualPerson = personFactory.buildPerson(name, pesel);

        // then
//        assertThatPerson(actualPerson)
//                .notExist();

        assertThat(actualPerson)
                .isNull();
    }

    @Test
    void shouldNotCreatePersonWhenPeselIsNotValid() {
        // given
        String name = "Michal";
        String pesel = "111111";

        // when
        final Person actualPerson = personFactory.buildPerson(name, pesel);

        // then
//        assertThatPerson(actualPerson)
//                .notExist();

        assertThat(actualPerson)
                .isNull();
    }

    @Test
    void shouldGetDescription() {
        // when
        final Person person = new Person("Michal", 19, "03220211111");

        // then
        assertThat(person.getName())
                .startsWith("M")
                .endsWith("l")
                .contains("c");
    }

}