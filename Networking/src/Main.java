import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URI baseUri = new URI("http://username:password@myserver.com:5000");
            URI relativeUri = new URI("/catalogue/phones?os=android#samsung");
            URI resolvedUri = baseUri.resolve(relativeUri);
            URL url = resolvedUri.toURL();
            System.out.println("URL = " + url);
        } catch (URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
    }
}
