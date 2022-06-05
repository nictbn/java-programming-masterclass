public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstDouble = (int)(firstNumber * 1000);
        int secondDouble = (int)(secondNumber * 1000);
        return firstDouble == secondDouble;
    }
}