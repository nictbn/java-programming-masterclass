public class Challenge6 {
    public static void main(String[] args) {
        String challenge6 = "aaabccccccccdddefffg";
        System.out.println(challenge6.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge6.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED"));
    }
}
