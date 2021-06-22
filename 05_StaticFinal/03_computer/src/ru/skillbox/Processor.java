package ru.skillbox;

public record Processor(int cpuFrequency, int coreCount, String manufacturer, double weight) {

    public int getCpuFrequency() {
        return cpuFrequency;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }
}
