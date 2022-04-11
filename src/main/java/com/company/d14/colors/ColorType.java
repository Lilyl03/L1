package com.company.d14.colors;

public enum ColorType {
    GREEN("green color", 0xFFFF0000),
    BLUE("blue color", 0xFF00FF00),
    RED("red color", 0xFF0000FF);

    private String colorStringRepresentation;
    private int intValue;

    ColorType(String colorStringRepresentation, int intValue) {
        this.colorStringRepresentation = colorStringRepresentation;
        this.intValue = intValue;
    }

    public static String getColor(ColorType colors) {
        if (colors == ColorType.GREEN) {
            return "green color";
        }
        if (colors == ColorType.BLUE) {
            return "blue color";
        }
        return "default color";
    }

    public String getColorStringRepresentation() {
        return colorStringRepresentation;
    }

    public int getIntValue() {
        return intValue;
    }

    @Override
    public String toString() {
        if (this == ColorType.GREEN) {
            return "green color";
        }
        if (this == ColorType.BLUE) {
            return "blue color";
        }
        if (this == ColorType.RED) {
            return "red color";
        }
        return super.toString();
    }
}
