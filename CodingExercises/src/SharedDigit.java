public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if(a < 10 || a > 99) {
            return false;
        }
        if(b < 10 || b > 99) {
            return false;
        }
        int da1, da2, db1, db2;
        da1 = a % 10;
        da2 = a / 10 % 10;
        db1 = b % 10;
        db2 = b / 10 % 10;
        if(da1 == db1 || da1 == db2) {
            return true;
        }
        return da2 == db1 || da2 == db2;
    }
}