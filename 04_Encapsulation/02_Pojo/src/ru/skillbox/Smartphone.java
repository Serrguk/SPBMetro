package ru.skillbox;

public class Smartphone {
    private String name;
    private int RAM; //Gb
    private int ROM; //Gb
    private int resolutionCamera; //Mpx
    private boolean typeC;

    public Smartphone(String name, int ROM) {
        this.name = name;
        this.ROM = ROM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public int getResolutionCamera() {
        return resolutionCamera;
    }

    public void setResolutionCamera(int resolutionCamera) {
        this.resolutionCamera = resolutionCamera;
    }

    public String isTypeC() {
        return typeC ? "Да" : "Нет";
    }

    public void setTypeC(boolean typeC) {
        this.typeC = typeC;
    }

    @Override
    public String toString() {
        return "\nНаименование устройства: " +
                 name +
                ";\nКоличество оперативной памяти: " + RAM +
                " Гб;\nКоличество постоянной памяти: " + ROM +
                " Гб;\nРазрешение основного модуля камеры: " + resolutionCamera +
                " Мпкс;\nРазъём Type-C: " + isTypeC() + ".";
    }
}
