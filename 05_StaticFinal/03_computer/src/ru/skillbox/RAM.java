package ru.skillbox;

public record RAM(RAMType ramType, int memorySize, double weight) {

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
