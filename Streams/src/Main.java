import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B40", "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71"
        );

        List<String> gnumbers = new ArrayList<>();
        someBingoNumbers.forEach(number -> {
            if (number.toUpperCase().startsWith("G")) {
                gnumbers.add(number);
            }
        });
        gnumbers.sort((String s1, String s2) -> s1.compareTo(s2));
        gnumbers.forEach((String s) -> System.out.println(s));
    }
}
