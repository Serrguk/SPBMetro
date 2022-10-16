package ru.skillbox;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Elevator elevator = new Elevator(-3, 25);
        elevator.move(20);
    }
}
