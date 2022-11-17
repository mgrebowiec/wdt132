package pl.sda.mg.wdt.testowanie.ownassertion;

import org.junit.jupiter.api.BeforeAll;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.*;

class PersonFactoryTest {

    private static PersonFactory personFactory;

    @BeforeAll
    static void initialize() {
        LocalDate actualNow = LocalDate.of(2022, 11, 17);
        ZoneId zoneId = ZoneId.systemDefault();
        Instant now = actualNow.atStartOfDay(zoneId).toInstant();

        Clock clock = Clock.fixed(now, zoneId);
        personFactory = new PersonFactory(clock);
    }

}