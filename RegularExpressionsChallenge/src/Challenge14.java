public class Challenge14 {
    public static void main(String[] args) {
        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));

        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));
    }
}
