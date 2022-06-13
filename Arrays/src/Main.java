import java.util.Scanner;

public class Main {
    //    public static void main(String[] args) {
//        int[] myIntArray = new int[10];
//        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] myIntArray = new int[25];
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//        myIntArray[5] = 50;
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
//    }
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    private static int[] getIntegers(int arrayLength) {
        System.out.println("Enter " + arrayLength + " integer values.\r");
        int[] values = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
