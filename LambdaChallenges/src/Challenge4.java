import java.util.function.Function;

public class Challenge4 {
    public static void main(String[] args) {
        Function<String, String> lambdaFunction = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(everysecondCharacter(lambdaFunction, "1234567890"));
    }

    public static String everysecondCharacter(Function<String, String> function, String targetString) {
        return function.apply(targetString);
    }
}
