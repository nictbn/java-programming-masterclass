package composition;

public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColour) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
