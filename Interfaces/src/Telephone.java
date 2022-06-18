public interface Telephone {
    void powerOn();
    void dial(int phoneNumber);
    boolean callPhone(int phoneNumber);
    boolean isRinging();
    void answer();
}
