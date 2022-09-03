public class IndexRecord {
    private int StartByte;
    private int length;

    public IndexRecord(int startByte, int length) {
        StartByte = startByte;
        this.length = length;
    }

    public int getStartByte() {
        return StartByte;
    }

    public void setStartByte(int startByte) {
        StartByte = startByte;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
