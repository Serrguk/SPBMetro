package ru.skillbox;

import java.util.ArrayList;
import java.util.List;

public class Immutable {
    public static void main(String[] args) {

        Cargo cargo = new Cargo(new Dimensions(0.5, 0.3, 0.2), 15.0, "Петру", true, "1a", false);

        List<Cargo> cargos = new ArrayList<>();
        cargos.add(cargo);
        cargos.add(cargo.setFragile(true));
        cargos.add(cargo.setAddressDestination("На деревню дедушке"));

        for (Cargo cargo1 : cargos) {
            System.out.println(cargo1.toString());
        }

    }
}
