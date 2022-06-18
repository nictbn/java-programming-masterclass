public class Main {
    public static void main(String[] args) {
        Telephone timsPhone = new Deskphone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
    }
}
