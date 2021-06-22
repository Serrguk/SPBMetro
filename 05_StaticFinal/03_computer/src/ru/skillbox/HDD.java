package ru.skillbox;

public class HDD {
    private final HDDType hddType;
    private final int memorySize;
    private final double weight;

    public HDD(HDDType hddType, int memorySize, double weight) {
        this.hddType = hddType;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public HDDType getHddType() {
        return hddType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getWeight() {
        return weight;
    }
}
