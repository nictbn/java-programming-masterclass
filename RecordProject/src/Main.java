public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Student s = new Student(
                    "S92300" + i,
                    getName(i),
                    "05/11/1985",
                    "Java Masterclass"
            );
            System.out.println(s);
        }
    }
    public static String getName(int i) {
        return switch (i) {
            case 1 -> "Mary";
            case 2 -> "Carol";
            case 3 -> "Tim";
            case 4 -> "Harry";
            case 5 -> "Lisa";
            default -> "Anonymous";
        };
    }
}
