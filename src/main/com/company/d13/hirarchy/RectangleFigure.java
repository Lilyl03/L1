package com.company.d13.hirarchy;

public class RectangleFigure implements Figure {
    private  double width;
    private  double height;

    public RectangleFigure(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }
}
