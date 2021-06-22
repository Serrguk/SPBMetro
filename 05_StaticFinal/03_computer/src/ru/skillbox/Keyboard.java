package ru.skillbox;

public record Keyboard(KeyboardType keyboardType, Backlight backlight, double weight) {

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
