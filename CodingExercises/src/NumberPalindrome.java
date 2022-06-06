public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if(number < 0) {
            number = -number;
        }
        int copy = number;
        int reverse = 0;

        while(copy > 0) {
            int digit = copy % 10;
            copy = copy / 10;
            reverse = reverse * 10;
            reverse += digit;
        }
        return number == reverse;
    }
}