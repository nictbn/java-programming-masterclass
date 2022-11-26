import java.util.Locale;

public class StringUtilities {
    private int charsAdded = 0;
    public void addChar(StringBuilder stringBuilder, char c) {
        stringBuilder.append(c);
        charsAdded++;
    }

    public String upperAndPrefix(String str) {
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }

    public String addSuffix(String str) {
        return str + "__Suffix";
    }
}
