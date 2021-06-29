import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        int boxesCount = Integer.parseInt(boxes);
        int containerCapacityInBoxes = 27;
        int truckCapacityInContainers = 12;
        int containerCount = 0;
        int truckCount = 0;

        if (boxesCount != 0) {
            containerCount++;
            truckCount++;

            System.out.println("Грузовик: " + truckCount + "\n\tКонтейнер: " + containerCount);

            for (int i = 1; i <= boxesCount; i++) {
                System.out.println("\t\tЯщик: " + i);
                if (i % (truckCapacityInContainers * containerCapacityInBoxes) == 0 && i != boxesCount) {
                    truckCount++;
                    System.out.println("Грузовик: " + truckCount);
                }
                if (i % containerCapacityInBoxes == 0 && i != boxesCount) {
                    containerCount++;
                    System.out.println("\tКонтейнер: " + containerCount);
                }
            }
        }
        System.out.println("Необходимо:\nгрузовиков - " + truckCount + " шт.\nконтейнеров - " + containerCount + " шт.");
    }
}
