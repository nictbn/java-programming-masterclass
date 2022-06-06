public class LastDigitChecker {
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }
        int d1 = a % 10;
        int d2 = b % 10;
        int d3 = c % 10;
        return d1 == d2 || d1 == d3 || d2 == d3;
    }
}