import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge8 {
    public static void main(String[] args) {
        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher = pattern8.matcher(challenge8);
        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }
    }
}
