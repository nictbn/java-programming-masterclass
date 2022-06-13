import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        int[] sortedArray = getSortedArray(myArray);
        printArray(sortedArray);
    }

    private static int[] getIntegers(int arrayLength) {
        int[] values = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " integer values:\r");

        for (int i = 0; i < arrayLength; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private static int[] getSortedArray(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    int greater = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = greater;
                }
            }
        }
        return sortedArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
