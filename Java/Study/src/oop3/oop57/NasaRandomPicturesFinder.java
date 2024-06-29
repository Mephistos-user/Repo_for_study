package oop3.oop57;

import utils.PageDownloader;
import utils.RandomDateGenerator;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class NasaRandomPicturesFinder {
    public NasaPictureInfo[] findRandomPictures(int count) {

        NasaPictureInfo[] arr = new NasaPictureInfo[count];

        for (int i = 0; i < count; i++) {

            String date = getRandomDateStr();

            String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=" + date;

            PageDownloader downloader = new PageDownloader();
            String page = "";
            try {
                page = downloader.downloadWebPage(url);
            } catch (IOException e) {
                e.printStackTrace();
                throw new IllegalStateException("Can not call nasa API");
            }

            String explanation = getTagValue(page, "explanation");
            String hdUrl = getTagValue(page, "hdurl");
            String mediaType = getTagValue(page, "media_type");
            String title = getTagValue(page, "title");
            title.replace(":", "_");

            NasaPictureInfo info = new NasaPictureInfo(title, date, explanation, hdUrl, mediaType);
            arr[i] = info;
        }
        return arr;
    }

    private String getTagValue(String page, String tagName) {
        int begin = page.indexOf('"' +  tagName+ '"') + tagName.length() + 4;
        int end = page.indexOf("\"", begin + 1);
        String substr = page.substring(begin, end);
//        System.out.println(substr);

        return substr;
    }

    private static String getRandomDateStr() {
        RandomDateGenerator randomDateGenerator = new RandomDateGenerator();
        LocalDate randomDate = randomDateGenerator.getRandomDate(1996, 2021);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateStr = randomDate.format(format);
        return dateStr;
    }


}
