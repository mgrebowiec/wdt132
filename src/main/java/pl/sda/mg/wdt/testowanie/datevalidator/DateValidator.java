package pl.sda.mg.wdt.testowanie.datevalidator;

import java.time.LocalDate;

public class DateValidator {
    private static final LocalDate START_DATE = LocalDate.of(2021, 1, 1);
    private static final LocalDate END_DATE = LocalDate.of(2021, 4, 1);

    /**
     * Check if date is between 01-01-2021 and 01-04-2021
     * @param date
     * @return
     */
    public static boolean isValidDate(LocalDate date) {
        if (date == null) {
            return false;
        }

        if (START_DATE.isAfter(date)) {
            return false;
        }

        if (END_DATE.isBefore(date)) {
            return false;
        }

        return true;
    }
}
