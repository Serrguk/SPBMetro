package ru.skillbox;

public class Pojo {
    public static void main(String[] args) {
        Country country = new Country("Russia");

        country.setPopulation(140_000_000);
        country.setAccessToTheSea(true);
        country.setCapitalName("Moscow");

        System.out.println(country);

        Smartphone honor50 = new Smartphone("HONOR 50", 256);
        honor50.setRAM(8);
        honor50.setResolutionCamera(108);
        honor50.setTypeC(true);

        System.out.println(honor50);

        Smartphone xiaomi11T = new Smartphone("XIAOMI 11T", 512);
        xiaomi11T.setRAM(12);
        xiaomi11T.setResolutionCamera(108);
        xiaomi11T.setTypeC(true);

        System.out.println(xiaomi11T);
    }
}
