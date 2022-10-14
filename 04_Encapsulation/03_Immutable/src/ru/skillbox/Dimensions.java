package ru.skillbox;

public class Dimensions {
    private final double Length; //meters
    private final double Width;  //meters
    private final double High;   //meters

    public Dimensions(double length, double width, double high) {
        Length = length;
        Width = width;
        High = high;
    }

    public double getVolumeCargo(Dimensions dimensions) {
        return dimensions.High * dimensions.Length * dimensions.Width;
    }
}
