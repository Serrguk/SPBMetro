package ru.skillbox;

public class RAM {
    private final RAMType ramType;
    private final int memorySize;
    private final double weight;

    public RAM(RAMType ramType, int memorySize, double weight) {
        this.ramType = ramType;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public RAMType getRamType() {
        return ramType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getWeight() {
        return weight;
    }
}
