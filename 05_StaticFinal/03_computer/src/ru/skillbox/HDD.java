package ru.skillbox;

public record HDD(HDDType hddType, int memorySize, double weight) {

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
