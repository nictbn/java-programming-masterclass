import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org/somepage");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Chrome");
            connection.setReadTimeout(30000);

            int responseConde = connection.getResponseCode();
            System.out.println("Response code: " + responseConde);

            if (responseConde != 200) {
                System.out.println("Error reading web page");
                System.out.println(connection.getResponseMessage());
                return;
            }
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }
            inputReader.close();
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
