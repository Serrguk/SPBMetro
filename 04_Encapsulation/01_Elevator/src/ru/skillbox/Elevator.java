package ru.skillbox;

public class Elevator {
    private int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    private void floorDown() {
        currentFloor--;
    }

    private void floorUp() {
        currentFloor++;
    }

    public void move(int floor) throws InterruptedException {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Данного этажа в здании нет.\n" +
                    "Лифт двигается в пределах от " + minFloor + " до " + maxFloor + " этажа.");
        } else if (floor == getCurrentFloor()) {
            System.out.println("Вы уже на этаже " + currentFloor);
        } else if (floor > getCurrentFloor()) {
            while (floor > getCurrentFloor()) {
                Thread.sleep(500);
                floorUp();
                System.out.println("Этаж номер " + getCurrentFloor());
            }
            System.out.println("Вы прибыли на этаж номер " + getCurrentFloor());
        } else {
            while (floor < getCurrentFloor()) {
                Thread.sleep(500);
                floorDown();
                System.out.println("Этаж номер " + getCurrentFloor());
            }
            System.out.println("Вы прибыли на этаж номер " + getCurrentFloor());
        }
    }
}
