public class NumberToWords {
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int digitCount = 0;
        while(number > 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }

    public static int reverse(int number) {
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number;
        }
        int reverse = 0;
        while(number > 0) {
            int digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number = number / 10;
        }
        if (isNegative) {
            reverse = -reverse;
        }
        return reverse;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int numberOfDigits = getDigitCount(number);
        int reverse = reverse(number);
        for (int i = 0; i < numberOfDigits; i++) {
            int digit = reverse % 10;
            reverse = reverse / 10;
            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
            }
        }
    }
}
