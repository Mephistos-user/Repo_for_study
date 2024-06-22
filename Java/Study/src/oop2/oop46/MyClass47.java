package oop2.oop46;

import utils.PageDownloader;

import java.io.IOException;
import java.time.LocalDate;

public class MyClass47 {
    public static void main(String[] args) throws InterruptedException, IOException {

        // курс ЦБ между датами:

        LocalDate currentDay = LocalDate.of(2022,5,1);
        LocalDate lastDay = LocalDate.of(2022,5,31);
        PageDownloader downloader = new PageDownloader();

        System.out.println("Download courses...");
        while (currentDay.isBefore(lastDay)) {

            String day = withZero(currentDay.getDayOfMonth());
            String month = withZero(currentDay.getMonthValue());
            String year = String.valueOf(currentDay.getYear());

            String dateForUrl = day + "/" + month + "/" + year;
            String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=" + dateForUrl + "&date_req2=" + dateForUrl + "&VAL_NM_RQ=R01235";
            Thread.sleep(500);
            String page = downloader.downloadWebPage(url);
            int startIndex = page.lastIndexOf("<Value>");

            if (startIndex != -1) {
                int endIndex = page.lastIndexOf("</Value>");
                String courseStr = page.substring(startIndex + 7, endIndex);
                System.out.println(currentDay + ": " + courseStr);
            }
            currentDay = currentDay.plusDays(1);
        }



    }

    static String withZero(int day) {
        return day < 10 ? "0" + day : String.valueOf(day);
    }
}
