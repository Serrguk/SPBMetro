package ru.skillbox;

public class Dimensions {
    private final double length; //meters
    private final double width;  //meters
    private final double high;   //meters

    public Dimensions(double length, double width, double high) {
        this.length = length;
        this.width = width;
        this.high = high;
    }

    public double getVolumeCargo() {
        return high * width * length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHigh() {
        return high;
    }
}
