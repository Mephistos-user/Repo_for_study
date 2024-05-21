import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyClass16 {
    public static void main(String[] args) throws IOException, InterruptedException {

        // вывести курсы валюты ЦБ за месяц
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month: ");
        String month = scanner.next();
        System.out.println("Enter year: ");
        String year = scanner.next();
        String[] courses = new String[31];

        for (int day = 1; day <= 31; day++) {
            courses[day - 1] = "not found";
        }

        for (int day = 1; day <= 31; day++) {

            String dayStr = day < 10 ? "0" + day : String.valueOf(day);

            Thread.sleep(3000); // timeout

            String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/" + month + "/" + year + "&date_req2=" + dayStr + "/" + month + "/" + year + "&VAL_NM_RQ=R01235";

            String page1 = downloadWebPage(url);
            int startIndex1 = page1.lastIndexOf("<Value>");
            if (startIndex1 != -1) {
                int endIndex1 = page1.lastIndexOf("</Value>");
                String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);
//            double course1 = Double.parseDouble(courseStr1.replace(',', '.'));
                System.out.println(dayStr + "/" + month + "/" + year + ": " + courseStr1);
                courses[day - 1] = courseStr1;
            }
        }
        System.out.println("Arrow courses: " + courses);
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
