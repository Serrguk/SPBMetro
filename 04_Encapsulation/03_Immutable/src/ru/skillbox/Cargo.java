package ru.skillbox;

public class Cargo {
    private Dimensions dimensions;
    private double mass;
    private String addressDestination = "";
    private boolean isTurn;
    private String registrationNumber;
    private boolean isFragile;

    public Cargo(Dimensions dimensions, double mass, String addressDestination, boolean isTurn, String registrationNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.addressDestination = addressDestination;
        this.isTurn = isTurn;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setAddressDestination(String addressDestination) {
        this.addressDestination = addressDestination;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }
}
