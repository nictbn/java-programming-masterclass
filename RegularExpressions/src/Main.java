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
        String thirdAlphaNumericString = "abcDDDeeeF13Ghhiiijkl99z";
        System.out.println(thirdAlphaNumericString.replaceAll("^abcD{3}", "YYY"));
    }
}
