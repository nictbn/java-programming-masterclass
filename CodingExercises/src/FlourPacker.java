public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (5 * bigCount + smallCount < goal) {
            return false;
        }

        if (5 * bigCount + smallCount == goal) {
            return true;
        }
        int ideal5KgBags = goal / 5;
        int used5KgBags = bigCount <= ideal5KgBags ? bigCount : ideal5KgBags;
        goal = goal - 5 * used5KgBags;
        return smallCount >= goal;
    }
}
