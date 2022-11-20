public class Challenge2 {
    public static void main(String[] args) {
        String challenge1 = "I want a bike";
        String chalenge2 = "I want a ball";
        String regExp = "I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        System.out.println(chalenge2.matches(regExp));
    }
}
