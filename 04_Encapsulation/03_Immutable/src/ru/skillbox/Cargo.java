package ru.skillbox;

public class Cargo {
    private final Dimensions dimensions;
    private final double mass; //kg
    private final String addressDestination;
    private final boolean isTurn;
    private final String registrationNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double mass, String addressDestination, boolean isTurn, String registrationNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.addressDestination = addressDestination;
        this.isTurn = isTurn;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, mass, addressDestination, isTurn, registrationNumber, isFragile);
    }

    public Cargo setMass(double mass) {
        return new Cargo(dimensions, mass, addressDestination, isTurn, registrationNumber, isFragile);
    }

    public Cargo setAddressDestination(String addressDestination) {
        return new Cargo(dimensions, mass, addressDestination, isTurn, registrationNumber, isFragile);
    }

    public Cargo setTurn(boolean turn) {
        return new Cargo(dimensions, mass, addressDestination, turn, registrationNumber, isFragile);
    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(dimensions, mass, addressDestination, isTurn, registrationNumber, isFragile);
    }

    public Cargo setFragile(boolean fragile) {
        return new Cargo(dimensions, mass, addressDestination, isTurn, registrationNumber, fragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getMass() {
        return mass;
    }

    public String getAddressDestination() {
        return addressDestination;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "dimensions volume=" + dimensions.getVolumeCargo() +
                " m^3, mass=" + mass +
                " kg, addressDestination='" + addressDestination + '\'' +
                ", isTurn=" + isTurn +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", isFragile=" + isFragile +
                '}';
    }
}
