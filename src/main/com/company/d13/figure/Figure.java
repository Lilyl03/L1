package com.company.d13.figure;

public class Figure {
    private double width;
    private double height;
    private double radius;
    private final FigureType type;


    public Figure(double width, double height) {
        this.width = width;
        this.height = height;
        type = FigureType.RECTANGLE;
    }

    public Figure(double radius) {
        this.radius = radius;
        type = FigureType.CIRCLE;
    }

    public static Figure ofRectangle(double width, double height) {
        return new Figure(width, height);
    }

    public static Figure ofCircle(double radius) {
        return new Figure(radius);
    }

    public double perimeter() {
        if (type == FigureType.CIRCLE) {
            return 2 * Math.PI * radius;
        } else {
            return width + height;
        }
    }

    public double area() {
        if (type == FigureType.CIRCLE) {
            return Math.PI * radius * radius;
        } else {
            return width * height;
        }
    }

    public FigureType getType() {
        return type;
    }

    @Override
    public String toString() {
        if (type == FigureType.RECTANGLE) {
            return "The area of rectangle  is: " + area();
        }
        return "The area of circle : " + area();
    }

}
