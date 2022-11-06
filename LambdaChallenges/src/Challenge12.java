import java.util.Arrays;
import java.util.List;

public class Challenge12 {
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        long countNamesStartingWithA = topNames2015.stream()
                .map(String::toUpperCase)
                .filter(name -> name.startsWith("a"))
                .count();
        System.out.println(countNamesStartingWithA);
    }
}
