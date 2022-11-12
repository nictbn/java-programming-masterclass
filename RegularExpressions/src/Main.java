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
    }
}
