import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URI baseUri = new URI("http://username:password@mynewserver.com:5000");
            URI relativeUri1 = new URI("/catalogue/phones?os=android#samsung");
            URI relativeUri2 = new URI("/catalogue/tvs?manufacturer=samsung");
            URI relativeUri3 = new URI("/stores/locations?zip=12345");

            URI resolvedUri1 = baseUri.resolve(relativeUri1);
            URI resolvedUri2 = baseUri.resolve(relativeUri2);
            URI resolvedUri3 = baseUri.resolve(relativeUri3);

            URL url1 = resolvedUri1.toURL();
            System.out.println("URL = " + url1);

            URL url2 = resolvedUri2.toURL();
            System.out.println("URL = " + url2);

            URL url3 = resolvedUri3.toURL();
            System.out.println("URL = " + url3);
        } catch (URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
    }
}
