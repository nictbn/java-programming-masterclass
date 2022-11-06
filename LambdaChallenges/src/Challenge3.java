import java.util.function.Function;

public class Challenge3 {
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
        System.out.println(lambdaFunction.apply("1234567890"));
    }
}
