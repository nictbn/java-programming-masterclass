import java.util.function.Supplier;

public class Challenge7 {
    public static void main(String[] args) {
        Supplier<String> iLoveJava = () -> "I love Java";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }
}
