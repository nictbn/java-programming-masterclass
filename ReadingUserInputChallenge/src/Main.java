import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            System.out.println("Enter number #" + (counter + 1) + ":");
            boolean isInt = scanner.hasNextInt();
            if (!isInt) {
                System.out.println("Invalid number");
                scanner.nextLine();
                continue;
            }
            int number = scanner.nextInt();
            scanner.nextLine();
            sum += number;
            counter++;
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }

}
