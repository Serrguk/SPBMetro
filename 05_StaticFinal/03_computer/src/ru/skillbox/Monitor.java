package ru.skillbox;

public record Monitor(MonitorMatrixType monitorMatrixType, int diagonal, double weight) {

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
