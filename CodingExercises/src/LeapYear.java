public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 10000) {
            return false;
        }
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0;
            } else {
                isLeap = true;
            }
        }
        return isLeap;
    }
}
