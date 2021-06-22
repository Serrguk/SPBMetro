package ru.skillbox;

public class Processor {
    private final int cpuFrequency;
    private final int coreCount;
    private final String manufacturer;
    private final double weight;

    public Processor(int cpuFrequency, int coreCount, String manufacturer, double weight) {
        this.cpuFrequency = cpuFrequency;
        this.coreCount = coreCount;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

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
