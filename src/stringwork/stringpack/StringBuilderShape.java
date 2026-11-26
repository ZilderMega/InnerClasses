package stringwork.stringpack;

public class StringBuilderShape {
    private final int length;
    private final int width;

    public StringBuilderShape(int length, int width) {
        if (width < 1 || length < 1) {
            throw new IllegalArgumentException("Ошибка ввода");
        }
        this.length = length;
        this.width = width;
    }

    public String generateShape() {
        StringBuilder shape = new StringBuilder();
        shape.append(generateHorizontal());
        shape.append(generateVertical());
        shape.append(generateHorizontal());
        return shape.toString();
    }

    private StringBuilder generateHorizontal() {
        StringBuilder horizontal = new StringBuilder(" ");
        for (int i = 1; i <= length; i++) {
            horizontal.append("-");
        }
        horizontal.append(" \n");
        return horizontal;
    }

    private StringBuilder generateVertical() {
        StringBuilder vertical = new StringBuilder();
        for (int i = 1; i <= width; i++) {
            vertical.append("|");
            for (int j = 1; j <= length; j++) {
                vertical.append(" ");
            }
            vertical.append("|\n");
        }
        return vertical;
    }
}
