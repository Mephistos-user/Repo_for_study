package utils;

import java.time.LocalDate;
import java.time.Year;
import java.util.Random;

public class RandomDateGenerator {
    public LocalDate getRandomDate(int startYear, int endYear) {
        int difference = endYear - startYear;
        int randomYearDelta = new Random().nextInt( difference + 1); // [0...21]
        int randomYear = startYear + randomYearDelta;
        int randomMonth = new Random().nextInt( 12) + 1;
//        String randomMonthStr = addZeroIfOneDigit(randomMonth);
        int randomDay = new Random().nextInt( 28) + 1; // TODO: проверить сколько дней в месяце и включить границу до 28, 29, 30 или 31 дня
//        String randomDayStr = addZeroIfOneDigit(randomDay);

        return LocalDate.of(randomYear, randomMonth, randomDay);
    }
}
