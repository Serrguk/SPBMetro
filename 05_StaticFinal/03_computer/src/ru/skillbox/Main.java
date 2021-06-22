package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Computer computerDavidich = new Computer("ASUS", "SUPERULTRATOP",
                new Processor(4400, 16, "Intel", 25),
                new RAM(RAMType.DDR6, 64, 150),
                new HDD(HDDType.SSD_M2, 8000, 1500),
                new Monitor(MonitorMatrixType.IPS, 35, 4000),
                new Keyboard(KeyboardType.MECHANICAL, Backlight.YES, 350));

        Computer computerAcademeg = new Computer("Toshiba", "MegaPushka",
                new Processor(3500, 16, "Intel", 25),
                new RAM(RAMType.DDR5, 128, 150),
                new HDD(HDDType.SSD_SATA, 8000, 1500),
                new Monitor(MonitorMatrixType.IPS, 15, 1000),
                new Keyboard(KeyboardType.MEMBRANE, Backlight.YES, 300));

        System.out.println(computerAcademeg);
        System.out.println("Вес компонентов компа Давидыча: " + computerDavidich.getWeight() + " гр.");
        System.out.println("Вес компонентов компа Академега: " + computerAcademeg.getWeight() + " гр.");
    }
}
