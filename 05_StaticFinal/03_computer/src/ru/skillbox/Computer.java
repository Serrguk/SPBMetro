package ru.skillbox;

public record Computer(String vendor, String name, Processor processor,
                       RAM ram, HDD hdd, Monitor monitor,
                       Keyboard keyboard) {

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double getWeight() {
        return processor.getWeight() + ram.getWeight() + hdd.getWeight() + monitor.getWeight() + keyboard.getWeight();

    }

    @Override
    public String toString() {
        return "Computer{" +
                "Vendor='" + vendor + '\'' +
                "; Name='" + name + '\'' +
                "; Processor=" + processor.getManufacturer() + ", " + processor.getCoreCount() + " core, " + processor.getCpuFrequency() + " Mhz" +
                "; Ram=" + ram.getRamType() + ", " + ram.getMemorySize() + " Gb" +
                "; Hdd=" + hdd.getHddType() + ", " + hdd.getMemorySize() + " Gb" +
                "; Monitor=" + monitor.getMonitorMatrixType() + ", " + monitor.getDiagonal() + "''" +
                "; Keyboard=" + keyboard.getKeyboardType() + ", Backlight: " + keyboard.getBacklight() +
                '}';
    }
}
