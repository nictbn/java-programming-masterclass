import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge11 {
    public static void main(String[] args) {
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher = pattern11.matcher(challenge11);
        while (matcher.find()) {
            System.out.println("Occurrence: " + matcher.group(1));
        }

        System.out.println();
        String challenge11b = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {6, 34}, {11, 12}";
        Pattern pattern11b = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcherb = pattern11b.matcher(challenge11b);
        while (matcherb.find()) {
            System.out.println("Occurrence: " + matcherb.group(1));
        }
    }
}
