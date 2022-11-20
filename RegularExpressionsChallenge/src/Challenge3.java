import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge3 {
    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        String chalenge2 = "I want a ball.";
        String regExp = "I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        System.out.println(chalenge2.matches(regExp));
        String regExp1 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(chalenge2.matches(regExp1));

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(chalenge2);
        System.out.println(matcher.matches());
    }
}
