public class Main {
    public static void main(String[] args) {
        int count = 1;
        while ( count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        count = 1;

        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int totalEvenNumbers = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            totalEvenNumbers++;
            System.out.println("Even number " + number);
            if (totalEvenNumbers == 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + totalEvenNumbers);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
