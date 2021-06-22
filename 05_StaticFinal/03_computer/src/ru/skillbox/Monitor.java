package ru.skillbox;

public class Monitor {
    private final MonitorMatrixType monitorMatrixType;
    private final int diagonal;
    private final double weight;

    public Monitor(MonitorMatrixType monitorMatrixType, int diagonal, double weight) {
        this.monitorMatrixType = monitorMatrixType;
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public MonitorMatrixType getMonitorMatrixType() {
        return monitorMatrixType;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public double getWeight() {
        return weight;
    }
}
