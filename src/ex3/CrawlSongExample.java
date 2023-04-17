package ex3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {


        try {
            URL url = null;
            try {
                url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            } catch (MalformedURLException ex) {
                throw new RuntimeException(ex);
            }
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String context = scanner.next();
            scanner.close();
            context = context.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("name_song\\\">(.*?)</a>");
            Matcher m = p.matcher(context);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}