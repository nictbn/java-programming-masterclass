public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeUp = false;
        if (barking && ((hourOfDay >= 0 && hourOfDay < 8) || hourOfDay == 23)) {
            wakeUp = true;
        }
        return wakeUp;
    }
}