public class TeenNumberChecker {
    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }
}
