import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int readNumbers = 0;
        int sum = 0;
        while(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            scanner.nextLine();
            sum += number;
            readNumbers++;
        }
        double average = sum * 1.0 / readNumbers;
        average = Math.round(average);
        System.out.println("SUM = " + sum + " AVG = " + ((int)average));
        scanner.close();
    }
}