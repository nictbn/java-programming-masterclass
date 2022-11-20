public class StringUtilities {
    private int charsAdded = 0;
    public void addChar(StringBuilder stringBuilder, char c) {
        stringBuilder.append(c);
        charsAdded++;
    }
}
