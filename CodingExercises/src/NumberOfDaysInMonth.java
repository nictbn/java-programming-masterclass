public class NumberOfDaysInMonth {
    // write your code here
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12) {
            return -1;
        }
        if(year < 1 || year > 9999) {
            return -1;
        }
        int answer = 0;
        switch(month){
            case 1:
                answer = 31;
                break;
            case 2:
                if(isLeapYear(year)){
                    answer = 29;
                }
                else {
                    answer = 28;
                }
                break;
            case 3:
                answer = 31;
                break;
            case 4:
                answer = 30;
                break;
            case 5:
                answer = 31;
                break;
            case 6:
                answer = 30;
                break;
            case 7:
                answer = 31;
                break;
            case 8:
                answer = 31;
                break;
            case 9:
                answer = 30;
                break;
            case 10:
                answer = 31;
                break;
            case 11:
                answer = 30;
                break;
            case 12:
                answer = 31;
                break;
            default:
                answer = -1;
        }
        return answer;
    }
}