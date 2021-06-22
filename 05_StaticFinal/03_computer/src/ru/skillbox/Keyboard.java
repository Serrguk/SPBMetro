package ru.skillbox;

public class Keyboard {
    private final KeyboardType keyboardType;
    private final Backlight backlight;
    private final double weight;

    public Keyboard(KeyboardType keyboardType, Backlight backlight, double weight) {
        this.keyboardType = keyboardType;
        this.backlight = backlight;
        this.weight = weight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public Backlight getBacklight() {
        return backlight;
    }

    public double getWeight() {
        return weight;
    }
}
