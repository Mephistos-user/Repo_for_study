import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class MyClass08 {
    public static void main(String[] args) throws IOException {

        // сравнить курсы валюты ЦБ за две даты

        String page1 = downloadWebPage("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=02/05/2023&date_req2=14/05/2023&VAL_NM_RQ=R01235");
        int startIndex1 = page1.lastIndexOf("<Value>");
        int endIndex1 = page1.lastIndexOf("</Value>");
        String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);

        String page2 = downloadWebPage("https://cbr.ru/scripts/XML_dynamic.asp?date_req1=02/05/2024&date_req2=14/05/2024&VAL_NM_RQ=R01235");
        int startIndex2 = page2.lastIndexOf("<Value>");
        int endIndex2 = page2.lastIndexOf("</Value>");
        String courseStr2 = page2.substring(startIndex2 + 7, endIndex2);

        double course1 = Double.parseDouble(courseStr1.replace(',', '.'));
        double course2 = Double.parseDouble(courseStr2.replace(',', '.'));

        if (course1 < course2) {
            System.out.println("За год курс подрос на " + (course2 - course1));
        } else {
            System.out.println("Курс год назад был больше на " + (course1 - course2));
        }

    }

    private static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla");
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
