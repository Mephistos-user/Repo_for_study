package oop2.oop46;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyClass46 {
    public static void main(String[] args) throws InterruptedException {

        // работа с датами:

//        Date date = new Date(); // старая библиотека даты времени
//        System.out.println(date);

        // Local - местная дата время
        // LocalDate

        // 1. Информационные (get-методы): получение даты времени
//        LocalDate dateNow = LocalDate.now(); // static constructor
//        System.out.println(dateNow);
//        LocalTime timeNow = LocalTime.now();
//        System.out.println(timeNow);
//        LocalDateTime localDateTimeNow = LocalDateTime.now();
//        System.out.println(localDateTimeNow);
//
//        System.out.println(dateNow.getDayOfMonth());
//        System.out.println(dateNow.getDayOfYear());
//        System.out.println(dateNow.getDayOfWeek());
//        System.out.println(dateNow.getMonth());
//        System.out.println(dateNow.getYear());
//        System.out.println(dateNow.getMonthValue());
//        System.out.println(dateNow.isLeapYear()); // високосный или не високосной год
//        System.out.println(dateNow.lengthOfMonth());


        // 2. методы сдвига (плюс-минус методы):
//        System.out.println(dateNow.plusDays(20));
//        System.out.println(dateNow.minusDays(25));
//
//        LocalDate plus20Days = dateNow.plusDays(20);
//        System.out.println(plus20Days.getDayOfYear());
//        System.out.println(plus20Days);
//
//        System.out.println(plus20Days.minusWeeks(3));
//        System.out.println(plus20Days.minusYears(2));
//        System.out.println(plus20Days.plusMonths(4));
//
//        if (plus20Days.isAfter(LocalDate.now())) {
//            System.out.println("feb13.isAfter(now)");
//        } else {
//            System.out.println("Something wrong");
//        }

        // 0. Кострукторы

//        LocalDate endOf1999 = LocalDate.of(1999, 12 , 31);
//        System.out.println(endOf1999);
//        LocalDate currentDate = LocalDate.of(1999, 1, 1);
//        while (currentDate.isBefore(endOf1999)) {
//            System.out.println(currentDate);
//            currentDate = currentDate.plusDays(1);
//        }

        // 3. With-методы:
//        LocalDate localDate = LocalDate.of(0,1,1);
//        System.out.println(localDate);
//        System.out.println(localDate.withYear(2000));
//        System.out.println(localDate.withMonth(2));
//        System.out.println(localDate.withDayOfMonth(31));
//
//        localDate = localDate.withYear(2000);
//        localDate = localDate.withMonth(2);
//        localDate = localDate.withDayOfMonth(20);
//        System.out.println(localDate);
//
//        System.out.println(
//                localDate
//                        .withYear(2020)
//                        .withMonth(3)
//                        .withDayOfMonth(10)
//        );

        // Localtime
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // 1. get-методы
//        System.out.println(time.getHour());
//        System.out.println(time.getMinute());
//
//        int sec = 0;
//        while (sec < 10) {
//            Thread.sleep(1000);
//            LocalTime newTime = LocalTime.now();
//            System.out.println(newTime.getSecond() + "." + newTime.getNano());
//            sec++;
//        }

        // 2. методы сдвига (плюс-минус методы):
//        System.out.println(time.plusHours(2));
//        System.out.println(time.minusHours(3));

        // 3. With-методы:
//        System.out.println(time.withNano(0));
//        System.out.println(time.withHour(23));

        // 0. Кострукторы
//        LocalTime time1 = LocalTime.of(20,17);
//        System.out.println(time1);
//        LocalTime time2 = LocalTime.of(20,17,25);
//        System.out.println(time2);
//        LocalTime time3 = LocalTime.of(20,17,23,150000000);
//        System.out.println(time3);

        // LocalDateTime

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

//        LocalDateTime localDateTime1 = LocalDateTime.of(2000, 10, 1, 11 ,33, 44, 123400000);
//        System.out.println(localDateTime1);

        // форматирование даты времени
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
//        String formatedDate = localDateTime.format(formatter);
//        System.out.println(formatedDate);
//
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
//        String formatedDate2 = localDateTime.format(formatter2);
//        System.out.println(formatedDate2);
//
//        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("d.MM.yyyy");
//        String formatedDate3 = localDateTime.format(formatter3);
//        System.out.println(formatedDate3);
//
//        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("d/MMM/yy");
//        String formatedDate4 = localDateTime.format(formatter4);
//        System.out.println(formatedDate4);
//
//        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("d MMMM yyyy года");
//        String formatedDate5 = localDateTime.format(formatter5);
//        System.out.println(formatedDate5);


        // формат unix-epoch, timestamp - количество миллисекунд прошедшее с 1.01.1970г.
        System.out.println(System.currentTimeMillis()); // milliseconds
        Thread.sleep(1000);
//        System.out.println(System.currentTimeMillis()); // milliseconds
//        Thread.sleep(1000);
//        System.out.println(System.currentTimeMillis()/1000); // seconds
//        Thread.sleep(1000);
//        System.out.println(System.currentTimeMillis()/1000/60); // minute
//        Thread.sleep(1000);
//        System.out.println(System.currentTimeMillis()/1000/60/60); // hours
//        Thread.sleep(1000);
//        System.out.println(System.currentTimeMillis()/1000/60/60/24); // day
//        Thread.sleep(1000);
//        System.out.println(System.currentTimeMillis()/1000/60/60/24/365); // year

        // время по часовым поясам
//        LocalDateTime now = LocalDateTime.now();
//        ZoneId zoneId = ZoneId.of("Europe/Moscow");
//        ZonedDateTime zonedDateTime = ZonedDateTime.of(now, zoneId);
//        System.out.println(zonedDateTime);
//
//        ZoneId tokio = ZoneId.of("Asia/Tokyo");
//        ZonedDateTime tokioTime = zonedDateTime.withZoneSameInstant(tokio);
//        System.out.println(tokioTime);



    }
}
