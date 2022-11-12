import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphaNumeric = "abcDDDeeeF13Ghhiiijkl99z";
        System.out.println(alphaNumeric.replaceAll(".", "Y"));

        System.out.println(alphaNumeric.replaceAll("^abcDDD", "YYY"));

        String secondString = "abcDDDeeeF13GhhiiiabcDDDjkl99z";
        System.out.println(secondString.replaceAll("^abcDDD", "YYY"));

        System.out.println(alphaNumeric.matches("^hello"));
        System.out.println(alphaNumeric.matches("^abcDDD"));
        System.out.println(alphaNumeric.matches("^abcDDDeeeF13Ghhiiijkl99z"));
        System.out.println(alphaNumeric.replaceAll("jkl99z$", "THE END"));
        System.out.println(alphaNumeric.replaceAll("[aei]", "X"));
        System.out.println(alphaNumeric.replaceAll("[aei]", "I replaced a letter here"));
        System.out.println(alphaNumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));
        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphaNumeric = "abcDDDeeeF13Ghhiiijkl99z";
        System.out.println(newAlphaNumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[a-f3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("(?iu)[a-f3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\D", "X"));

        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "X"));

        System.out.println(hasWhitespace.replaceAll("\\S", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "T"));
        System.out.println(hasWhitespace.replaceAll("\\W", "Y"));
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));

        System.out.println("Quantifiers");
        String thirdAlphaNumericString = "abcDDDeeeF13Ghhiiijjkl99z";
        System.out.println(thirdAlphaNumericString.replaceAll("^abcD{3}", "YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^abcD+", "YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^abcD*", "YYY"));

        String fourthAlphaNumericString = "abcDeeeF13Ghhiiijkl99z";
        System.out.println(fourthAlphaNumericString.replaceAll("^abcDe{2,5}", "YYY"));

        System.out.println(thirdAlphaNumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something</p>");
        htmlText.append("<p>This is another paragraph about something else</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "(<h2>)";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        int count = 0;
        matcher.reset();
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.+?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);

        // initial check to see if group matches
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }
    }
}
